package com.mustafaergan.portal.dao;

import org.springframework.data.repository.CrudRepository;

import com.mustafaergan.portal.entity.MenuUrl;

public interface MenuRepository extends CrudRepository<MenuUrl, Long> {

}
