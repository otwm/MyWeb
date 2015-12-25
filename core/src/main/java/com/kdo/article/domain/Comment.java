package com.kdo.article.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 코멘트
 * Created by kdo on 2015-12-25.
 */
@Entity
public class Comment {
    /**
     * 아이디
     */
    @Id
    @GeneratedValue
    private Long id;
}
