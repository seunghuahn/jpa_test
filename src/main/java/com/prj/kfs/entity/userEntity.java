package com.prj.kfs.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;

@Entity
@AllArgsConstructor
public class userEntity {
    @Id
    @GeneratedValue
    Long id;
    @Column
    String name;
    @Column
    String pw;
    @Column
    String address;
    @Column
    String email;
    @Column
    String mbti;
    @Column
    Long iq;
    @Column
    Long eq;
    @Column
    Long mt;
    @Column
    Long rk;

}
