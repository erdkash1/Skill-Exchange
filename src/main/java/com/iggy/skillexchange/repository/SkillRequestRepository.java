package com.iggy.skillexchange.repository;

import com.iggy.skillexchange.entity.SkillRequest;
import com.iggy.skillexchange.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SkillRequestRepository extends JpaRepository<SkillRequest, Long> {
    public List<SkillRequest> findByUser(User user);
    public List<SkillRequest> findByStatus(String status);
}
