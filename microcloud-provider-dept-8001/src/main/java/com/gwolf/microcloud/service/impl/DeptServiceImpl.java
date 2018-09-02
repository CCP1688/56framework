package com.gwolf.microcloud.service.impl;

import com.gwolf.microcloud.dao.IDeptDAO;
import com.gwolf.microcloud.service.IDeptService;
import com.gwolf.vo.Dept;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DeptServiceImpl implements IDeptService{
    @Resource
    private IDeptDAO deptDAO;

    @Override
    public Dept get(long id) {
        return this.deptDAO.findById(id);
    }

    @Override
    public boolean add(Dept dept) {
        return this.deptDAO.doCreate(dept);
    }

    @Override
    public List<Dept> list() {
        return this.deptDAO.findAll();
    }
}
