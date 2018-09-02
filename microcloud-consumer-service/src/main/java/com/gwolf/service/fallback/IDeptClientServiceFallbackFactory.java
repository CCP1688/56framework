package com.gwolf.service.fallback;

import com.gwolf.service.IDeptClientService;
import com.gwolf.vo.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Component
public class IDeptClientServiceFallbackFactory 
        implements FallbackFactory<IDeptClientService>{
    @Override
    public IDeptClientService create(Throwable throwable) {
        return new IDeptClientService() {
            @Override
            public Dept get(@PathVariable("id") Long id) {
                Dept dept = new Dept();
                dept.setDname("【ERROR】feign-provider-hystrix");
                dept.setLoc("Comsumer客户端提供");
                dept.setDeptno(-1L);

                return dept;
            }

            @Override
            public List<Dept> list() {
                return null;
            }

            @Override
            public boolean add(Dept dept) {
                return false;
            }
        };
    }
}
