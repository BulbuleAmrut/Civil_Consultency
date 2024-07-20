package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavController {

    @GetMapping("/map-register")
    public String showRegister() {
        return "registrations/register";
    }

    @GetMapping("/map-contractor")
    public String showRegisterContractor() {
        return "registrations/contractorRegister";
    }

    @GetMapping("/map-labour")
    public String showRegisterLabour() {
        return "registrations/labourRegister";
    }

    @GetMapping("/map-company-reg")
    public String showRegisterCompany() {
        return "registrations/companyRegister";
    }
}
