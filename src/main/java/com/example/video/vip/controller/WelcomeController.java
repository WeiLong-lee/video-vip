package com.example.video.vip.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author: weilonglee
 * @date: 2018-09-25 17:47
 **/

@RequestMapping("/welcome")
@Controller
public class WelcomeController {

    @ApiOperation(value="欢迎页",notes="跳转欢迎页")
    @RequestMapping(value = "/index" ,method = RequestMethod.GET)
    public String index(){
        return "vip_video";
    }

}
