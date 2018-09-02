package com.gwolf.microcloud.service;

import com.gwolf.vo.Dept;

import java.util.List;

/**
 * Package: com.gwolf.microcloud.service
 * Description： TODO
 * Author:
 * Date: Created in 2017-11-12 11:49
 * Company:
 * Copyright: Copyright (c) 2017
 * Version: 0.0.1
 * Modified By:
 */
public interface IDeptService {
    public Dept get(long id);
    public boolean add(Dept dept);
    public List<Dept> list();
}
