package com.don.apppho.model;

import com.don.apppho.common.Gender;
import com.don.apppho.common.UserStatus;
import com.don.apppho.common.UserType;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Data
@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String email;

    @Temporal(TemporalType.DATE)
    private Date birthday;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Enumerated(EnumType.STRING)
    private UserStatus status;

    private String password;

    @Enumerated(EnumType.STRING)
    private UserType type;

    @CreationTimestamp
    private Date createdAt;

    @UpdateTimestamp
    private Date updatedAt;
}
