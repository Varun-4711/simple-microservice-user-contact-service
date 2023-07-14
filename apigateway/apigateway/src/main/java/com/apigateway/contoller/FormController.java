package com.apigateway.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
public class FormController {
    @PostMapping ("/processForm")
    public String processForm(@RequestParam("userId") String userId) {
        // Process the variable as needed
        // ...

        // Construct the redirect URL with the submitted value
//        String redirectUrl = "redirect:/user/" + userId;

        return userId;
    }
}

