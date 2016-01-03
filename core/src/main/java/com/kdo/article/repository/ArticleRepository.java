package com.kdo.article.repository;

import com.kdo.article.domain.Article;
import com.kdo.article.domain.QArticle;
import com.mysema.query.types.path.StringPath;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by kdo on 2015-12-15.
 */
public interface ArticleRepository extends PagingAndSortingRepository<Article, Long>
        , QueryDslPredicateExecutor<Article>
        , QuerydslBinderCustomizer<QArticle>

{
    @Override
    default public void customize(QuerydslBindings bindings, QArticle article) {
        bindings.bind(String.class)
                .first((StringPath path, String value) -> path.containsIgnoreCase(value));
    }
}
