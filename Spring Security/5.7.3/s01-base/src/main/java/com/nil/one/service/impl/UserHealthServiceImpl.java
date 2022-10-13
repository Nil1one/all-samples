package com.nil.one.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nil.one.entity.UserHealth;
import com.nil.one.service.UserHealthService;
import com.nil.one.mapper.UserHealthMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【t_user_health】的数据库操作Service实现
* @createDate 2022-10-13 20:07:52
*/
@Service
public class UserHealthServiceImpl extends ServiceImpl<UserHealthMapper, UserHealth>
    implements UserHealthService{

}




