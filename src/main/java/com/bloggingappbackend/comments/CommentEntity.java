package com.bloggingappbackend.comments;

import com.bloggingappbackend.articles.ArticleEntity;
import com.bloggingappbackend.common.BaseEntity;
import com.bloggingappbackend.users.UserEntity;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Getter
@Entity(name = "comments")
public class CommentEntity extends BaseEntity {

    @Column(length = 100)
    String title;

    @Column(nullable = false, length = 1000)
    String body;

    @ManyToOne
    UserEntity author;

    @ManyToOne
    ArticleEntity article;
}
