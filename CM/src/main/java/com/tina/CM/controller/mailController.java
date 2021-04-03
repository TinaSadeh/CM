package com.tina.CM.controller;


import com.tina.CM.domain.dto.RequestMailDto;
import com.tina.CM.domain.model.Mail;
import com.tina.CM.domain.model.User;
import com.tina.CM.repository.MailRepo;
import com.tina.CM.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/mail")
public class mailController {

   @Autowired
   private UserRepo userRepo;

    @Autowired
    private MailRepo mailRepo;

    private long currentUserId = 1L;

    @PostMapping("/new")
    public long newMail(@RequestBody RequestMailDto requestMailDto){

        Optional<User> currentUser = userRepo.findById(currentUserId);
        Optional<User> receiver = userRepo.findById(requestMailDto.getReceiverId());

        Mail mail = new Mail(currentUser.get(),
                receiver.get(),
                requestMailDto.getTitle(),
                requestMailDto.getContent(),
                null);

        Mail savedMail = mailRepo.save(mail);
        return savedMail.getId();
    }

}
