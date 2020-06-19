package com.bices.backend.controllers;

import com.bices.backend.models.HomePage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRequest {

    @Value("${mensajePrincipal}")
    private String mensajePrinc;

    @Value("${vineta1}")
    private String viñeta1;

    @Value("${vineta2}")
    private String viñeta2;

    @Value("${vineta3}")
    private String viñeta3;

    @Value("${vineta4}")
    private String viñeta4;

    @Value("${testimonio1}")
    private String testimonio1;

    @Value("${testimonio2}")
    private String testimonio2;

    @Value("${testimonio3}")
    private String testimonio3;

    @Value("${contactanos}")
    private String contactanos;

    @RequestMapping("/")
    public HomePage getHomePage(){
        return new HomePage(mensajePrinc,viñeta1,viñeta2,viñeta3,viñeta4,testimonio1,testimonio2,testimonio3,contactanos);
    }
    
}