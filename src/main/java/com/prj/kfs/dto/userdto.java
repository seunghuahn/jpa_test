package com.prj.kfs.dto;

import com.prj.kfs.entity.userEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class userdto {
    Long id;
    String name;
    String pw;
    String address;
    String email;
    String mbti;
    Long iq;
    Long eq;
    Long mt;
    Long rk;

    public userEntity toEntity() {
        return new userEntity(null, name, pw, address, email, mbti, iq, eq, mt, rk);
    }
}

