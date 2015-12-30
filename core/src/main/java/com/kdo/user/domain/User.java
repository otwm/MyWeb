package com.kdo.user.domain;

import com.kdo.common.domain.AbstractEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by kdo on 2015-12-25.
 */
@Entity
@Table(name = "t_user")
public class User extends AbstractEntity {

}
