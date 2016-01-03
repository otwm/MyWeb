package com.kdo.article.domain;

import com.kdo.common.domain.AbstractEntity;
import com.kdo.common.domain.Attach;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Created by kdo on 2015-12-25.
 */
@Entity
@Table(name = "t_article_attach")
public class ArticleAttach extends Attach {
    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        if (this.article != null) {
            this.article.getAttachs().remove(this);
        }
        this.article = article;
        article.getAttachs().add(this);
    }
}
