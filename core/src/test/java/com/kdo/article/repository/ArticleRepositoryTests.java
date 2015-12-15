package com.kdo.article.repository;

import com.kdo.CoreApplication;
import com.kdo.article.domain.Article;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 게시물 테스트
 * Created by kdo on 2015-12-15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(CoreApplication.class)
public class ArticleRepositoryTests {
    @Autowired
    ArticleRepository articleRepository;

    @Before
    public void setUp() {
        articleRepository.save(new Article("test title1", "content1"));
        articleRepository.save(new Article("test title2", "content2"));
        articleRepository.save(new Article("test title3", "content3"));
    }

    @Test
    public void testFindAll() {
        articleRepository.findAll().forEach((element) -> {
            System.out.printf(
                    "id : %s\ntitle : %s\ncontent : %s\n\n\n"
                    , element.getId()
                    , element.getTitle()
                    , element.getContent()
            );
        });

    }
}