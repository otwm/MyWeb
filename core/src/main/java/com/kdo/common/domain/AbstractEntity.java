package com.kdo.common.domain;

import com.kdo.user.domain.User;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.ZonedDateTime;

/**
 * 추상 엔티티
 * Created by kdo on 2015-12-25.
 */
@MappedSuperclass
public class AbstractEntity {
    /**
     * 아이디
     */
    @Id
    @GeneratedValue
    protected Long id;
    /**
     * 작성자
     */
    @OneToOne(fetch = FetchType.LAZY)
    @CreatedBy
    protected User writer;
    /**
     * 수정자
     */
    @OneToOne(fetch = FetchType.LAZY)
    @LastModifiedBy
    protected User modifier;
    /**
     * 작성일시
     */
    @CreatedDate
    protected ZonedDateTime createdDate;
    /**
     * 수정일시
     */
    @LastModifiedDate
    protected ZonedDateTime lastModifiedDate;

    public Long getId() {
        return id;
    }

    public AbstractEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public User getWriter() {
        return writer;
    }

    public AbstractEntity setWriter(User writer) {
        this.writer = writer;
        return this;
    }

    public User getModifier() {
        return modifier;
    }

    public AbstractEntity setModifier(User modifier) {
        this.modifier = modifier;
        return this;
    }

    public ZonedDateTime getCreatedDate() {
        return createdDate;
    }

    public AbstractEntity setCreatedDate(ZonedDateTime createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public ZonedDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public AbstractEntity setLastModifiedDate(ZonedDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }
}
