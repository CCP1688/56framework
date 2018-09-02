package com.gwolf.microcloud.controller;

import com.gwolf.service.IDeptClientService;
import com.gwolf.vo.Dept;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ConsumerDeptController {
    @Resource
    private IDeptClientService deptClientService;
    @Resource
    private LoadBalancerClient loadBalancerClient;

    @RequestMapping(value = "/consumer/dept/get",method = RequestMethod.GET)
    public Object getDept(long id) {
        ServiceInstance serviceInstance = this.loadBalancerClient.choose("MICROCLOUD-PROVIDER-DEPT");
        System.out.println("【***ServiceInstance***】host=" + serviceInstance.getHost() + ",port=" + 
                serviceInstance.getPort() + ",serviceId=" + serviceInstance.getServiceId());
       return this.deptClientService.get(id);
    }

    @RequestMapping(value = "/consumer/dept/list")
    public Object listDept() {
        return this.deptClientService.list();
    }

    @RequestMapping(value = "/consumer/dept/add")
    public Object addDept(Dept dept) {
        return this.deptClientService.add(dept);
    }
}
