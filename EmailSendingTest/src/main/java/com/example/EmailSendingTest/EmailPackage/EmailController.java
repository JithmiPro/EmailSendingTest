package com.example.EmailSendingTest.EmailPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmailController {

    @Autowired
    private EmailService emailService;


    @PostMapping("/sendTemplate")
    public String sendEmailString(
            @RequestBody EmailDetails_DTO details) {
        String status = emailService.sendEmailString(details);
        return status;
    }


}