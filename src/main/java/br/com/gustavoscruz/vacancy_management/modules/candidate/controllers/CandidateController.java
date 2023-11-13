package br.com.gustavoscruz.vacancy_management.modules.candidate.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

    // method for candidate creation

    @PostMapping("/")
    public void create(){

    }
    
}
