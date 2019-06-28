package com.lnsoft.bd.fk.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;


public abstract class DataDbService<T> extends Thread{
	private static final Logger logger = LoggerFactory.getLogger(DataDbService.class);
	
    BlockingQueue<T> channelQue = new LinkedBlockingDeque<T>();
	private int batch = 500;
	private boolean isStop = false;
	
	
	protected void startThread() {
		System.out.println(this.getName()+"启动--------------");
		this.start();
	}
	
	protected void stopThread(){
		isStop = true;
		this.interrupt();
	}
	
	public  boolean push(T mr){
		try {
			channelQue.put(mr);
			return true;
		} catch (InterruptedException e) {
			logger.error("put error!", e);
			return false;
		} catch (Exception ex) {
			logger.error("error!!!", ex);
			return false;
		}
	}
	
	public  boolean push(List<T> list) {
		try {
			for(T mr : list){
				channelQue.put(mr);
			}
			return true;
		} catch (InterruptedException e) {
			logger.error("put error!", e);
			return false;
		} catch (Exception ex) {
			logger.error("error!!!", ex);
			return false;
		}
	}
	
	public abstract void dbService(List<T> list);
	
	@Override
	public void run() {
		List<T> list = new ArrayList<T>(batch);
		while(!isStop){
			T bean;
			try {
				if (list.size() == 0 && channelQue.size() == 0) {
					try {
						bean = channelQue.take();
						list.add(bean);
					} catch (InterruptedException e) {
						logger.error("take error!", e);
						continue;
					}
				} else if (list.size() < batch
						&& channelQue.size() > 0) {
					bean = channelQue.remove();
					list.add(bean);
				} else if (list.size() == batch
						|| (list.size() > 0 && channelQue.size() == 0)) {
					try {
						dbService(list);
					} catch (Exception e) {
						logger.error(e.getMessage());
					}
					list.clear();
				}
			} catch (Exception ex) {
				logger.error("error!!!", ex);
				list.clear();
			} 
		}
	}
}
