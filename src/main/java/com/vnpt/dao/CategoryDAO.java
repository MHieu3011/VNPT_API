package com.vnpt.dao;

import com.vnpt.model.response.InfoCategory;

import java.util.List;

/**
 * @author HieuDM24
 * @date 8/6/2022
 */

public interface CategoryDAO {

    List<InfoCategory> findById(Integer categoryId) throws Exception;
}
