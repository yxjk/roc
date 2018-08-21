package com.yxjk.diip.service;

import com.yxjk.diip.dao.MenuDao;
import com.yxjk.diip.dao.UserDao;
import com.yxjk.diip.domain.Menu;
import com.yxjk.diip.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class SystemService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private MenuDao menuDao;

    public List<User> findUserByUserLogin(String userLogin) {
        return userDao.findByUserLogin(userLogin);
    }

    public List<Menu> findMenuByParentId(String parentId) {
        return menuDao.findByParentId(parentId);
    }

    public Page<User> findUsers(User user, Pageable pageable) {
        return userDao.findAll(Example.of(user), pageable);
    }

    public void save(User user) {
        userDao.save(user);
    }

    public void deleteUser(String userId) {
        userDao.deleteById(userId);
    }
}
