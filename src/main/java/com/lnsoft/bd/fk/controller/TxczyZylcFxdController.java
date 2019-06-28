package com.lnsoft.bd.fk.controller;

import com.lnsoft.bd.fk.config.ExceptionEnum;
import com.lnsoft.bd.fk.po.TXczyZylc;
import com.lnsoft.bd.fk.resultVo.FxdTpPictureVo;
import com.lnsoft.bd.fk.resultVo.ResponseData;
import com.lnsoft.bd.fk.service.TxczyZylcFxdSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/fxd")
public class TxczyZylcFxdController {

	@Autowired
	private TxczyZylcFxdSerivce txczyZylcFxdSerivce;

	@RequestMapping(value="/batchAllZylc")
	@ResponseBody
	public ResponseData saveAllGx(@RequestBody List<TXczyZylc> tXczyZylcs){

		txczyZylcFxdSerivce.batchAllFxd(tXczyZylcs);
		return ResponseData.ok();
	}

	@RequestMapping(value = "/uploadPictuire")
	@ResponseBody
	public ResponseData uploadPicture(FxdTpPictureVo fxdTpPictureVo, MultipartFile tp, HttpServletRequest httpServletRequest){
		txczyZylcFxdSerivce.uploadPicture(fxdTpPictureVo,tp,httpServletRequest);
		return ResponseData.ok();
	}

	@RequestMapping(value = "/wcZylc",method = RequestMethod.POST)
	@ResponseBody
	public ResponseData wcZylc(@RequestParam(value="zylcid") String zylcid, @RequestParam(value = "wcsj")Date wcsj){
		if(StringUtils.isEmpty(zylcid)){
			return ResponseData.error(ExceptionEnum.Error_1112.getIndex(),ExceptionEnum.Error_1112.getName());
		}

		return txczyZylcFxdSerivce.updateWcsjAndSfwc(zylcid,wcsj);
	}
}
