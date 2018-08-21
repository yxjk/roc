package com.yxjk.diip.domain;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity(name = "DI_USER")
public class User {
    @Id
    @Column(name = "USER_ID", nullable = false)
    @GenericGenerator(name="idGenerator", strategy="uuid")
    @GeneratedValue(generator="idGenerator")
    private String userId;

    @Column(name = "USER_LOGIN")
    private String userLogin;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "USER_PWD")
    private String userPwd;

    @Column(name = "LOGIN_TIME")
    private Timestamp loginTime;

    @Column(name = "STATUS")//S-正常，F-失效，L-锁定
    private String status;

    @Column(name = "USER_DESC")
    private String userDesc;
}
