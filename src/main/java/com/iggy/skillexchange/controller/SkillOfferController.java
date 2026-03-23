package com.iggy.skillexchange.controller;

import com.iggy.skillexchange.entity.SkillOffer;
import com.iggy.skillexchange.service.SkillOfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/offers")
public class SkillOfferController {

    @Autowired
    private SkillOfferService skillOfferService;

    @GetMapping
    public List<SkillOffer> getAllSkillOffer(){ return skillOfferService.getAllSkillOffer();}

    @GetMapping("/{id}")
    public Optional<SkillOffer> getSkillOfferById(@PathVariable Long id){ return skillOfferService.getSkillOfferById(id);}

    @PostMapping
    public SkillOffer createSkillOffer(@RequestBody SkillOffer skillOffer){ return skillOfferService.saveSkillOffer(skillOffer);}

    @DeleteMapping("/{id}")
    public void deleteSkillOffer(@PathVariable Long id){ skillOfferService.deleteSkillOfferById(id);}


}
