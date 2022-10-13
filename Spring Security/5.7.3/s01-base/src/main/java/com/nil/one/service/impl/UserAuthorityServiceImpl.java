package com.nil.one.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nil.one.entity.UserAuthority;
import com.nil.one.service.UserAuthorityService;
import com.nil.one.mapper.UserAuthorityMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【t_user_authority】的数据库操作Service实现
* @createDate 2022-10-13 20:07:45
*/
@Service
public class UserAuthorityServiceImpl extends ServiceImpl<UserAuthorityMapper, UserAuthority>
    implements UserAuthorityService{

}




