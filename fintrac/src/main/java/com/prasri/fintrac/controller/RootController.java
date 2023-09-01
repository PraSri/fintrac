package com.prasri.fintrac.controller;

import com.prasri.fintrac.Welcome;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    @Autowired
    private Welcome welcome;

    @GetMapping("/")
    public String showWelcomeMessage() {
        return welcome.showMessage();
    }
}
