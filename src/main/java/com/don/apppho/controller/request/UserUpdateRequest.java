package com.don.apppho.controller.request;

import com.don.apppho.common.Gender;
import com.don.apppho.common.UserStatus;
import com.don.apppho.common.UserType;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Getter
@ToString
public class UserUpdateRequest implements Serializable {
    private Long id;
    private String username;
    private String email;
    private Date birthday;
    private Gender gender;
    private UserType type;
    private UserStatus status;
}
