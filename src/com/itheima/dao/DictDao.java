package com.itheima.dao;

import java.util.List;

import com.itheima.domain.Dict;

public interface DictDao {

	List<Dict> findByCode(String dict_type_code);

}
