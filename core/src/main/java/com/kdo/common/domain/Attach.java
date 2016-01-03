package com.kdo.common.domain;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.math.BigInteger;

/**
 * Created by kdo on 2015-12-25.
 */
@MappedSuperclass
public class Attach extends AbstractEntity {
    /**
     * ���� ���
     */
    private String path;

    /**
     * ���� ��
     */
    private String name;

    /**
     * ������
     */
    @Column(name="file_size")
    private BigInteger size;

    /**
     * Ȯ����
     */
    private String extension;

    public String getPath() {
        return path;
    }

    public Attach setPath(String path) {
        this.path = path;
        return this;
    }

    public String getName() {
        return name;
    }

    public Attach setName(String name) {
        this.name = name;
        return this;
    }

    public BigInteger getSize() {
        return size;
    }

    public Attach setSize(BigInteger size) {
        this.size = size;
        return this;
    }

    public String getExtension() {
        return extension;
    }

    public Attach setExtension(String extension) {
        this.extension = extension;
        return this;
    }

}
