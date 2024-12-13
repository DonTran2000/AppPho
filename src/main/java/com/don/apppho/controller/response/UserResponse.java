package com.don.apppho.controller.response;

import com.don.apppho.common.Gender;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserResponse implements Serializable {
    private Long id;
    private String username;
    private String email;
    private Date birthday;
    private Gender gender;
}
