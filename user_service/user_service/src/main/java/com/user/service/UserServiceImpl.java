package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{

    //Creating a fake user list
    //Will soon connect the project to a database.
    List<User> list = List.of(
            new User(1211L,"Varun Saxena","93211",123),
            new User(1212L,"Sabir Singh","99113",120),
            new User(1213L,"Mihir Anand","91982",117),
            new User(1214L,"Yeshudan Bora","933232",132)
    );

    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
