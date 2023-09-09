package com.example.eduquizcommon.entity;
import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String surname;
    private String email;
    private String password;
    @Enumerated(value = EnumType.STRING)
    private UserType userType;
}
