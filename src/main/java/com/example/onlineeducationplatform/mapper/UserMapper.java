package com.example.onlineeducationplatform.mapper;

import com.example.onlineeducationplatform.model.User;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UserMapper {
    User selectUserById(Integer id);

    List<User> selectAllUsers();

    int insertUser(User user);

    int updateUser(User user);

    int deleteUser(Integer id);
}