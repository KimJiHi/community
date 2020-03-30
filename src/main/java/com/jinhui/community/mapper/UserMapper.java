package com.jinhui.community.mapper;

import com.jinhui.community.Model.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

/**
 * @Author: JinHui
 * @Date: 2020-03-27 20:19
 * @version: 1.0
 */
@Mapper
@Component
public interface UserMapper {
    @Insert("insert into USER (ACCOUNT_ID,NAME,TOKEN,GMT_CREATE,GMT_MODIFIED,AVATAR_URL) " +
            "values (#{accountId},#{name},#{token},#{gmtCreate},#{gmtModified},#{avatarUrl})")
    void insert(User user);

    @Select("select * from user where token = #{token}")
    User findByToken(@Param("token") String token);

    @Select("select * from user where id = #{id}")
    User findById(@Param("id") Integer id);

    @Select("select * from user where account_id = #{accountId}")
    User findByAccountId(@Param("accountId") String accountId);

    @Update("UPDATE user SET name=#{name}, token=#{token}, gmt_modified=#{gmtModified}, AVATAR_URL=#{avatarUrl} where id=#{id}")
    void update(User user);
}
