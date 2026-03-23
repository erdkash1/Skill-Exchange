package com.iggy.skillexchange.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    private String name;


    @Column(unique = true, nullable = false)
    private String email;

    @Enumerated(EnumType.STRING)
    private Role role;

    private String password;
    @Column(name ="created_at")
    private LocalDateTime createdAt;


    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}

    public LocalDateTime getCreatedAt() {return createdAt;}
    public void setCreatedAt(LocalDateTime created_at) {this.createdAt = created_at;}

    public Role getRole() {return role;}
    public void setRole(Role role) {this.role = role;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
}
