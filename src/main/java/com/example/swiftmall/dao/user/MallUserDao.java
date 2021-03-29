package com.example.swiftmall.dao.user;

import com.example.swiftmall.model.user.MallUser;
import org.apache.ibatis.annotations.Param;

public interface MallUserDao {


    MallUser login(@Param("userName") String userName, @Param("password") String password);


}
