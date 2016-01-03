package com.kdo.article.domain;

import com.kdo.common.domain.AbstractEntity;

import javax.persistence.*;
import java.util.Set;

/**
 * 게시물
 * Created by kdo on 2015-12-15.
 */
@Entity
@Table(name = "t_article")
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
    private int hit = 1;

    /**
     * 파일
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "article")
    private Set<ArticleAttach> attachs;

    /**
     * 답글
     */
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "parent")
    private Set<Article> replys;

    /**
     * 부모글
     */
    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Article parent;

    /**
     * 코멘트
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "article")
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

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    public Set<ArticleAttach> getAttachs() {
        return attachs;
    }

    public void setAttachs(Set<ArticleAttach> attachs) {
        this.attachs = attachs;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }

    public Set<Article> getReplys() {
        return replys;
    }

    public Article setReplys(Set<Article> replys) {
        this.replys = replys;
        return this;
    }

    public Article getParent() {
        return parent;
    }

    public Article setParent(Article parent) {
        this.parent = parent;
        return this;
    }
}
