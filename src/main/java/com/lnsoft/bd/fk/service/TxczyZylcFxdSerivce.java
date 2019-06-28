package com.lnsoft.bd.fk.service;

import com.lnsoft.bd.fk.po.TXczyZylc;
import com.lnsoft.bd.fk.resultVo.FxdTpPictureVo;
import com.lnsoft.bd.fk.resultVo.ResponseData;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

public interface TxczyZylcFxdSerivce {

	public ResponseData batchAllFxd(List<TXczyZylc> tXczyZylcs);

	public ResponseData uploadPicture(FxdTpPictureVo fxdTpPictureVo, MultipartFile multipartFile, HttpServletRequest httpServletRequest);

    ResponseData updateWcsjAndSfwc(String zylcid, Date wcsj);
}
