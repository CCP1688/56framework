package com.gwolf.microcloud.rest;

import com.gwolf.microcloud.service.IDeptService;
import com.gwolf.vo.Dept;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Package: com.gwolf.microcloud.rest
 * Description： TODO
 * Author:
 * Date: Created in 2017-11-12 12:21
 * Company:
 * Copyright: Copyright (c) 2017
 * Version: 0.0.1
 * Modified By:
 */
@RestController
public class DeptRest {
    @Resource
    private IDeptService deptService;
    
    @Resource
    private DiscoveryClient client; //进行Eureka的发现服务
    
    @RequestMapping("/dept/discover")
    public Object discover() {//直接返回发现服务信息
        return this.client;
    }
    
    @RequestMapping("/dept/id")
    public Object id(HttpServletRequest request) {
        return request.getSession().getId();
    }

    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    public Object get(@PathVariable("id") long id) {
        return this.deptService.get(id);
    }

    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    public Object add(@RequestBody Dept dept) {
        return this.deptService.add(dept);
    }

    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    public Object list() {
        return this.deptService.list();
    }
}
