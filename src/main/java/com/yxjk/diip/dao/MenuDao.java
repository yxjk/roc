package com.yxjk.diip.dao;

import com.yxjk.diip.domain.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MenuDao extends JpaRepository<Menu, String> {

    public List<Menu> findByParentId(String parentId);
}
