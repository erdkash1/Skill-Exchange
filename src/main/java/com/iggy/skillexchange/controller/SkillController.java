package com.iggy.skillexchange.controller;

import com.iggy.skillexchange.entity.Skill;
import com.iggy.skillexchange.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/skills")
public class SkillController {
    @Autowired
    private SkillService skillService;

    @GetMapping
    public List<Skill> getAll(){ return skillService.getAllSkills();}

    @GetMapping("/{id}")
    public Optional<Skill> getSkillById(@PathVariable Long id){ return skillService.getSkillById(id);}

    @GetMapping("/category/{category}")
    public List<Skill> getSkillCategory(@PathVariable String category){ return skillService.getSkillByCategory(category);}

    @PostMapping
    public Skill createSkill(@RequestBody Skill skill){ return skillService.saveSkill(skill);}

    @DeleteMapping("/{id}")
    public void deleteSkillById(@PathVariable Long id){ skillService.deleteSkill(id);}
}
