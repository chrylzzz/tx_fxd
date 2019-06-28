package com.lnsoft.bd.fk.resultVo;

import com.lnsoft.bd.fk.po.TXczyZylc;

import java.io.Serializable;
import java.util.List;

public class TxczyZylcVo implements Serializable {

	private static final long serialVersionUID = 7922592324904022176L;

	private List<TXczyZylc> txczyZylcList;

	public List<TXczyZylc> getTxczyZylcList() {
		return txczyZylcList;
	}

	public void setTxczyZylcList(List<TXczyZylc> txczyZylcList) {
		this.txczyZylcList = txczyZylcList;
	}
	 
}
