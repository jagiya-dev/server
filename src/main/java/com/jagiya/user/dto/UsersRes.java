package com.jagiya.user.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class UsersRes {
    private final Long usersId;

    private final Long id;

    private final String username;

    private final String email;

    private final String snsName;

    @Builder
    public UsersRes(Long usersId, Long id, String username, String email, String snsName) {
        this.usersId = usersId;
        this.id = id;
        this.username = username;
        this.email = email;
        this.snsName = snsName;
    }
}
