package com.huijing.dayflow.domain.user;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name="users")
public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String email;

    private String nickname;
    private String password;

    public User(String email, String nickname, String password) {
        this.email = email;
        this.password = password;
        this.nickname = nickname;
    }
}
