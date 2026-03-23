package com.iggy.skillexchange.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "skill_offers")
public class SkillOffer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;

    private String description;
    private String status;
    @Column(name = "created_at")
    private LocalDateTime createdAt;


    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public Skill getSkill() {return skill;}
    public void setSkill(Skill skill) {this.skill = skill;}

    public User getUser() {return user;}
    public void setUser(User user) {this.user = user;}

    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}

    public String getStatus() {return status;}
    public void setStatus(String status) {this.status = status;}

    public LocalDateTime getCreatedAt() {return createdAt;}
    public void setCreatedAt(LocalDateTime createdAt) {this.createdAt = createdAt;}
}
