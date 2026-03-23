package com.iggy.skillexchange.service;

import com.iggy.skillexchange.entity.SkillOffer;
import com.iggy.skillexchange.entity.User;
import com.iggy.skillexchange.repository.SkillOfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SkillOfferService {

    @Autowired
    private SkillOfferRepository skillOfferRepository;

    public List<SkillOffer> getAllSkillOffer(){ return skillOfferRepository.findAll();}
    public List<SkillOffer> getSkillOffersByUser(User user){ return skillOfferRepository.findByUser(user);}
    public Optional<SkillOffer> getSkillOfferById(Long id){ return skillOfferRepository.findById(id);}
    public SkillOffer saveSkillOffer(SkillOffer skillOffer){ return skillOfferRepository.save(skillOffer);}
    public void deleteSkillOfferById(Long id){ skillOfferRepository.deleteById(id);}


}
