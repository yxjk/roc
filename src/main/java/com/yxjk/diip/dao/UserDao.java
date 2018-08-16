package com.yxjk.diip.dao;

import com.yxjk.diip.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import java.util.List;

public interface UserDao extends JpaRepository<User, String>, QueryByExampleExecutor<User> {

    public List<User> findByUserLogin(String userLogin);
}
