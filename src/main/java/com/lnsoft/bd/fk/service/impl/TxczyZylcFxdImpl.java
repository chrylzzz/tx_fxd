package com.lnsoft.bd.fk.service.impl;

import com.lnsoft.bd.fk.config.ExceptionEnum;
import com.lnsoft.bd.fk.mapper.TXczyFxdwjMapper;
import com.lnsoft.bd.fk.mapper.TXczyZylcDetailsMapper;
import com.lnsoft.bd.fk.mapper.TXczyZylcFxdMapper;
import com.lnsoft.bd.fk.mapper.TXczyZylcMapper;
import com.lnsoft.bd.fk.po.TXczyFxdwj;
import com.lnsoft.bd.fk.po.TXczyZylc;
import com.lnsoft.bd.fk.po.TXczyZylcDetails;
import com.lnsoft.bd.fk.po.TXczyZylcFxd;
import com.lnsoft.bd.fk.resultVo.FxdTpPictureVo;
import com.lnsoft.bd.fk.resultVo.ResponseData;
import com.lnsoft.bd.fk.service.TxczyZylcFxdSerivce;
import com.lnsoft.bd.fk.utils.ExceptionUtil;
import com.lnsoft.bd.fk.utils.UploadUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class TxczyZylcFxdImpl implements TxczyZylcFxdSerivce{

	@Autowired
	private TXczyZylcMapper tXczyZylcMapper;
	
	@Autowired
	private TXczyZylcDetailsMapper tXczyZylcDetailsMapper;
	
	@Autowired
	private TXczyZylcFxdMapper tXczyZylcFxdMapper;

	@Autowired
	private TXczyFxdwjMapper tXczyFxdwjMapper;

	//ftp服务器地址
	@Value("${FTP_PIC_SERVER}")
	private String FTP_PIC_SERVER;

	//图片上传url
	@Value("${PIC_UP_URL}")
	private String PIC_UP_URL;

	//风险点Ftp文件夹路径
	@Value("${FXDPATHNAME}")
	private String FXDPATHNAME;

	private Logger logger = LoggerFactory.getLogger(TxczyZylcFxdImpl.class);

	@Transactional
	@Override
	public ResponseData batchAllFxd(@RequestBody List<TXczyZylc> tXczyZylcs) {

		if(tXczyZylcs.size()>0){
			int i = tXczyZylcMapper.batchinsert(tXczyZylcs);		
			for(TXczyZylc tx:tXczyZylcs){
				List<TXczyZylcDetails> tXczyZylcDetails = tx.getTxczyZylcDetails();
				if(tXczyZylcDetails.size()>0){
					tXczyZylcDetailsMapper.batchinsert(tXczyZylcDetails);
					for(TXczyZylcDetails tXczyZylcFxdDetails:tXczyZylcDetails){
						List<TXczyZylcFxd> tXczyZylcFxds = tXczyZylcFxdDetails.getTxczyZylcFxds();
						if(tXczyZylcFxds.size()>0){
							tXczyZylcFxdMapper.batchinsert(tXczyZylcFxds);
						}
					}
				}
				
			}
		}
		return ResponseData.ok();
	}


	@Transactional
	@Override
	public ResponseData uploadPicture(@RequestBody FxdTpPictureVo fxdTpPictureVo, MultipartFile multipartFile, HttpServletRequest request) {

		try {
			Boolean flag = UploadUtils.upload(FXDPATHNAME,fxdTpPictureVo.getFxid(),fxdTpPictureVo.getTpName(),multipartFile.getInputStream(),request.getContentLength(),FTP_PIC_SERVER+"/"+PIC_UP_URL);
			if(flag){
				TXczyFxdwj tXczyFxdwj = new TXczyFxdwj();
				tXczyFxdwj.setObjId(UUID.randomUUID().toString().replace("-",""));
				tXczyFxdwj.setFxid(fxdTpPictureVo.getFxid());
				tXczyFxdwj.setScsj(fxdTpPictureVo.getSj());
				tXczyFxdwj.setWjmc(fxdTpPictureVo.getTpName());
				tXczyFxdwj.setWjms(fxdTpPictureVo.getWjms());
				tXczyFxdwjMapper.insert(tXczyFxdwj);
				if(!StringUtils.isEmpty(fxdTpPictureVo.getSfdc())){
					if("1".equals(fxdTpPictureVo.getSfdc())){
						TXczyZylcFxd tXczyZylcFxd = new TXczyZylcFxd();
						tXczyZylcFxd.setObjId(fxdTpPictureVo.getFxid());
						tXczyZylcFxd.setZxr(fxdTpPictureVo.getUsername());
						tXczyZylcFxdMapper.updateByPrimaryKeySelective(tXczyZylcFxd);
					}
				}
				return ResponseData.ok();
			}else {
				return ResponseData.error(ExceptionEnum.Error_1111.getIndex(),ExceptionEnum.Error_1111.getName());
			}

		} catch (IOException e) {
			logger.error("上传出错:{}",ExceptionUtil.getStaceTrace(e));
			return ResponseData.error(ExceptionEnum.Error_1111.getIndex(),ExceptionEnum.Error_1111.getName());
		}

	}

	@Override
	public ResponseData updateWcsjAndSfwc(String zylcid,Date wcsj) {
		TXczyZylc tXczyZylc = new TXczyZylc();
		tXczyZylc.setWcsj(wcsj);
		tXczyZylc.setSfwc("1");
		tXczyZylc.setObjId(zylcid);
		tXczyZylcMapper.updateByPrimaryKeySelective(tXczyZylc);
		return ResponseData.ok();
	}


}
