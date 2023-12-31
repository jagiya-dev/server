package com.jagiya.main.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QAuthority is a Querydsl query type for Authority
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAuthority extends EntityPathBase<Authority> {

    private static final long serialVersionUID = 89538221L;

    public static final QAuthority authority = new QAuthority("authority");

    public final DateTimePath<java.util.Date> authDate = createDateTime("authDate", java.util.Date.class);

    public final NumberPath<Integer> authFlag = createNumber("authFlag", Integer.class);

    public final NumberPath<Long> authorityId = createNumber("authorityId", Long.class);

    public final StringPath deviceId = createString("deviceId");

    public QAuthority(String variable) {
        super(Authority.class, forVariable(variable));
    }

    public QAuthority(Path<? extends Authority> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAuthority(PathMetadata metadata) {
        super(Authority.class, metadata);
    }

}

