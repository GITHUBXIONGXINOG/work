package com.chinasoft.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.chinasoft.pojo.login_User;

public interface UserMapper {
	@Select("select * from login_info "
			+ "where username=#{username} and password=#{possword}")
	login_User findByParam(@Param("username")String username,
						   @Param("password")String password);

}
