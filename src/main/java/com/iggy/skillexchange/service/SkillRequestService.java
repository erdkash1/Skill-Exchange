package com.iggy.skillexchange.service;

import com.iggy.skillexchange.entity.SkillRequest;
import com.iggy.skillexchange.entity.User;
import com.iggy.skillexchange.repository.SkillRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SkillRequestService {
    @Autowired
    private SkillRequestRepository skillRequestRepository;

    public List<SkillRequest> getAllSkillRequest(){ return skillRequestRepository.findAll();}
    public List<SkillRequest> getSkillRequestByUser(User user){ return skillRequestRepository.findByUser(user);}
    public Optional<SkillRequest> getSkillRequestById(Long id){ return skillRequestRepository.findById(id);}
    public SkillRequest saveSkillRequest(SkillRequest skillRequest){ return skillRequestRepository.save(skillRequest);}
    public void deleteSkillRequestById(Long id){ skillRequestRepository.deleteById(id);}
    public List<SkillRequest> getSkillRequestByStatus(String status){ return skillRequestRepository.findByStatus(status);}
}
