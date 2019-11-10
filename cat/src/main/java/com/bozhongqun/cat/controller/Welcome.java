package com.bozhongqun.cat.controller;

import com.bozhongqun.cat.entity.UserInfo;
import com.bozhongqun.cat.service.UserService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping(value = "/cat")
public class Welcome {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/welcome")
    String welcome(String userId){
        UserInfo userInfo = userService.getUserById(userId);
        JSONObject json = JSONObject.fromObject(userInfo);
        return json.toString();
    }


}
