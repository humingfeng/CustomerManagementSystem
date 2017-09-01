package com.itheima.service;

import org.hibernate.criterion.DetachedCriteria;

import com.itheima.domain.Linkman;
import com.itheima.domain.PageBean;

public interface LinkmanService {

	PageBean<Linkman> findByPage(Integer pageCode, Integer pageSize, DetachedCriteria criteria);

}
