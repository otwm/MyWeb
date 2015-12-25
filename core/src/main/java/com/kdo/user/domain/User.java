package com.kdo.user.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by kdo on 2015-12-25.
 */
@Entity
public class User {
    /**
     * 아이디
     */
    @Id
    @GeneratedValue
    private Long id;
}
