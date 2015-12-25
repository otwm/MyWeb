package com.kdo.article.domain;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.Set;

import com.kdo.common.domain.AbstractEntity;
import com.kdo.common.domain.Attach;
import com.kdo.user.domain.User;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

/**
 * 게시물
 * Created by kdo on 2015-12-15.
 */
@Entity
public class Article extends AbstractEntity {

    /**
     * 제목
     */
    private String title;

    /**
     * 내용
     */
    private String content;

    /**
     * 조회수
     */
    private int hit;

    /**
     * 파일
     */
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Attach> attachs;

    /**
     * 답글
     */
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Article> replys;

    /**
     * 코멘트
     */
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Comment> comments;

    public Article() {
    }

    public Article(String title, String content) {
        this.title = title;
        this.content = content;
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

    public int getHit() {
        return hit;
    }

    public Article setHit(int hit) {
        this.hit = hit;
        return this;
    }

    public Set<Attach> getAttachs() {
        return attachs;
    }

    public Article setAttachs(Set<Attach> attachs) {
        this.attachs = attachs;
        return this;
    }

    public Set<Article> getReplys() {
        return replys;
    }

    public Article setReplys(Set<Article> replys) {
        this.replys = replys;
        return this;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public Article setComments(Set<Comment> comments) {
        this.comments = comments;
        return this;
    }

}
