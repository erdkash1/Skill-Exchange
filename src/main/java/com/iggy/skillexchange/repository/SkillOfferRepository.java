package com.iggy.skillexchange.repository;

import com.iggy.skillexchange.entity.SkillOffer;
import com.iggy.skillexchange.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SkillOfferRepository extends JpaRepository<SkillOffer, Long> {
    public List<SkillOffer> findByUser(User user);
}
