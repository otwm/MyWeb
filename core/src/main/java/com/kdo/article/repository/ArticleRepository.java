package com.kdo.article.repository;

import com.kdo.article.domain.Article;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by kdo on 2015-12-15.
 */
public interface ArticleRepository extends PagingAndSortingRepository<Article, Long> {

}
