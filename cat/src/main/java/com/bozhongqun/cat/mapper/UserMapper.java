package com.bozhongqun.cat.mapper;

import com.bozhongqun.cat.entity.UserInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    UserInfo getUserById(String userId);
}
