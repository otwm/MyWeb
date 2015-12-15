package com.kdo.article.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 게시물
 * Created by kdo on 2015-12-15.
 */
@Entity
public class Article {
    /**
     * 아이디
     */
    @Id
    @GeneratedValue
    private Long id;

    /**
     * 제목
     */
    private String title;

    /**
     * 내용
     */
    private String content;

    private Article() {
    }

    public Article(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public Article setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Article setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getContent() {
        return content;
    }

    public Article setContent(String content) {
        this.content = content;
        return this;
    }
}
