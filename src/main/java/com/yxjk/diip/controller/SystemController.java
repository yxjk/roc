package com.yxjk.diip.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yxjk.diip.domain.Menu;
import com.yxjk.diip.model.Pagel;
import com.yxjk.diip.exception.BizzException;
import com.yxjk.diip.domain.User;
import com.yxjk.diip.model.Response;
import com.yxjk.diip.service.SystemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.io.*;
import java.util.List;

@Slf4j
@Controller
@RestController
public class SystemController {
    @Autowired
    SystemService systemService;

    @PostMapping("/login")
    public Response login(@Validated @RequestBody User model) throws IOException, BizzException {
        List<User> users = systemService.findUserByUserLogin(model.getUserLogin());
        if (users == null || users.size() == 0) {
            return new Response("F", "用户名不存在", null);
        } else if (!model.getUserPwd().equals(users.get(0).getUserPwd())) {
            return new Response("F", "用户名和密码不匹配", null);
        }
        return new Response(users.get(0));
    }

    @GetMapping("/getMenu")
    public Response getMenu() throws IOException, BizzException {
        List<Menu> menus = systemService.findMenuByParentId(null);
        return new Response(menus);
    }

    @PostMapping("/userList")
    public Response userList(@RequestBody JSONObject json) throws IOException, BizzException {
        Page<User> users = systemService.findUsers((User) JSON.parseObject(json.toJSONString(), User.class), ((Pagel) JSON.parseObject(json.toJSONString(), Pagel.class)).getPageableInstance());
        return new Response(users.getContent(), users.getTotalElements());
    }

    @PostMapping("/saveUser")
    public Response saveUser(@RequestBody JSONObject json) throws IOException, BizzException {
        User user = JSON.parseObject(json.toJSONString(), User.class);
        if(null==user.getUserId()){
            user.setStatus("S");
        }
        systemService.save(user);
        return new Response();
    }

    @PostMapping("/deleteUser")
    public Response deleteUser(@RequestBody JSONObject json) throws IOException, BizzException {
        systemService.deleteUser(json.get("userId").toString());
        return new Response();
    }
}
