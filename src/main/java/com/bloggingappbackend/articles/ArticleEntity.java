package com.bloggingappbackend.articles;

import com.bloggingappbackend.common.BaseEntity;
import com.bloggingappbackend.users.UserEntity;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Getter
@Entity(name = "articles")
public class ArticleEntity extends BaseEntity {

    @Column(nullable = false, length = 150)
    String title;

    @Column(nullable = false, length = 100)
    String slug;

    @Column(length = 250)
    String subtitle;

    @Column(nullable = false, length = 3000)
    String body;

    @ManyToOne
    UserEntity author;
}
