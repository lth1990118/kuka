package com.kuka.mapper;

import com.kuka.pojo.User;
import org.apache.ibatis.annotations.Select;

public interface IUserMapper {
    @Select("SELECT * FROM [User] left join utuser on utuser.userid=[User].id WHERE [User].id = #{id}")
    User selectOne(int id);
}
