package com.kdu.final_assignment.controller;

import com.kdu.final_assignment.model.Subscribe;
import com.kdu.final_assignment.service.SubscribeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubscribeController {

    @Autowired
    private SubscribeService subscribeService;

    @CrossOrigin
    @PostMapping("/subscribe")
    public ResponseEntity addToSubscribeList(@RequestBody Subscribe subscribe) {
        Subscribe tempSubscribe = null;
        try {
            tempSubscribe = this.subscribeService.addToSubscribe(subscribe);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>("Could not subscribe", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(tempSubscribe, HttpStatus.OK);
    }
}
