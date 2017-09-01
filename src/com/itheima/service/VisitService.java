package com.itheima.service;

import org.hibernate.criterion.DetachedCriteria;

import com.itheima.domain.PageBean;
import com.itheima.domain.Visit;

public interface VisitService {

	PageBean<Visit> findByPage(Integer pageCode, Integer pageSize, DetachedCriteria criteria);

	void save(Visit visit);

}
