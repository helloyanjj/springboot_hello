//package com.example.springboot_hello.dao;
//
//import com.example.springboot_hello.entity.User;
//import org.apache.ibatis.annotations.Mapper;
//import org.apache.ibatis.annotations.Select;
//
//import java.util.List;
//
//@Mapper
//public interface UserDao {
//    @Select("select * from user where name = #{name,jdbcType=VARCHAR}")
//    List<User> getByUserNameAndPassword(String name);
//}
