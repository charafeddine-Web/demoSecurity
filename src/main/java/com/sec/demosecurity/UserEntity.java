package com.sec.demosecurity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Entity
@Data
public class UserEntity {

    @jakarta.persistence.Id
    @Id
    @GeneratedValue
    private Long id;

    private String username;
    private String password;
    private String role;

}
