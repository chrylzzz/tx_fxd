package com.lnsoft.bd.fk.config;

import com.lnsoft.bd.fk.resultVo.ResponseData;
import com.lnsoft.bd.fk.utils.ExceptionUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * 以下四个注解应用到@RequestMapping注解，定义：拦截异常并统一处理
 *  启动之后，这四个注解，都会被作用在@RequestMapping上
 *  @ControllerAdvice
 *  @InitBinder
 *  @ExceptionHandler
 *  @ModelAttribute
 */
@ControllerAdvice
public class ExceptionAdvice {

    private Logger logger = LoggerFactory.getLogger(ExceptionAdvice.class);

    /**
     * 应用到所有的@RequestMapping注解，在其执行之前初始化数据绑定器，@RequestMapping注解执行前进行绑定
     * @param binder
     */
    @InitBinder
    public void initBinder(WebDataBinder binder){}

    /**
     *
     * 使全局@RequestMapping注解，都可以获取到该值
     * @param model
     */
    @ModelAttribute
    public void addAttribute(Model model){
        model.addAttribute("author","xxx");
    }

    /**
     * 全局异常捕捉处理
     * @param e
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public ResponseData errorHandler(Exception e){
        Map<String,Object> map = new HashMap<>();
        map.put("error",e.getMessage().toString());
        //slf4j 的占位{}
        logger.error("统一出错了接口:{}", ExceptionUtil.getStaceTrace(e));
        return ResponseData.ok(500,e.getMessage(),null);
    }

}
