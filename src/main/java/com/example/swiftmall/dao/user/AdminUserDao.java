package com.example.swiftmall.dao.user;

import com.example.swiftmall.model.user.AdminUser;
import org.apache.ibatis.annotations.Param;

public interface AdminUserDao {

    int insertAdminUser(AdminUser adminUser);

    AdminUser login(@Param("userName") String userName, @Param("password") String password);

}
