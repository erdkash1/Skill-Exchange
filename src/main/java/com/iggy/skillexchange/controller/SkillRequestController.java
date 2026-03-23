package com.iggy.skillexchange.controller;

import com.iggy.skillexchange.entity.SkillRequest;
import com.iggy.skillexchange.service.SkillRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/requests")
public class SkillRequestController {
    @Autowired
    private SkillRequestService skillRequestService;

    @GetMapping
    public List<SkillRequest> getAllSkillRequest(){ return skillRequestService.getAllSkillRequest();}

    @GetMapping("/{id}")
    public Optional<SkillRequest> getSkillRequestById(@PathVariable Long id){ return skillRequestService.getSkillRequestById(id);}

    @PostMapping
    public SkillRequest createSkillRequest(@RequestBody SkillRequest skillRequest){ return skillRequestService.saveSkillRequest(skillRequest);}

    @PatchMapping("/{id}/status")
    public SkillRequest updateSkillRequest(@PathVariable Long id, @RequestBody String status){
        SkillRequest request = skillRequestService.getSkillRequestById(id).get();
        request.setStatus(status);
        return skillRequestService.saveSkillRequest(request);}

    @DeleteMapping("/{id}")
    public void deleteSkillRequestById(@PathVariable Long id){ skillRequestService.deleteSkillRequestById(id);}


}
