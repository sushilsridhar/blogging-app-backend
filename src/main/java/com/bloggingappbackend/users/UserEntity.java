package com.bloggingappbackend.users;

import com.bloggingappbackend.common.BaseEntity;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Getter
@Entity(name = "users")
public class UserEntity extends BaseEntity {

    @Column(nullable = false, unique = true, length = 30)
    String username;

    @Column(nullable = false, unique = true, length = 50)
    String email;

    @Column(nullable = false)
    String password;

    String bio;
}
