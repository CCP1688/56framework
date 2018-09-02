package com.gwolf.microcloud.dao;

import com.gwolf.vo.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IDeptDAO {
    public  boolean doCreate(Dept vo);
    public Dept findById(Long id);
    public List<Dept> findAll();
}
