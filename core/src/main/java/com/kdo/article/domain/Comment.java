package com.kdo.article.domain;

import com.kdo.common.domain.AbstractEntity;

import javax.persistence.*;

/**
 * 코멘트
 * Created by kdo on 2015-12-25.
 */
@Entity
@Table(name = "t_comment")
public class Comment extends AbstractEntity {
    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        if (this.article != null) {
            this.article.getComments().remove(this);
        }
        this.article = article;
        article.getComments().add(this);
    }
}
