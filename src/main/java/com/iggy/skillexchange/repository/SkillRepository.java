package com.iggy.skillexchange.repository;

import com.iggy.skillexchange.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Long> {

    public List<Skill> findByCategory(String category);
}
