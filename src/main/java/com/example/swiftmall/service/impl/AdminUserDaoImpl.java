package com.example.swiftmall.service.impl;

import com.example.swiftmall.dao.user.AdminUserDao;
import com.example.swiftmall.model.user.AdminUser;

public class AdminUserDaoImpl implements AdminUserDao {

    @Override
    public int insertAdminUser(AdminUser adminUser) {
        return 1;
    }

    @Override
    public AdminUser login(String userName, String password) {
        return null;
    }
}
