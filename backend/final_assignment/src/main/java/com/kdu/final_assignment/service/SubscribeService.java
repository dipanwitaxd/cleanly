package com.kdu.final_assignment.service;

import com.kdu.final_assignment.model.Subscribe;
import com.kdu.final_assignment.repository.SubscribeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubscribeService {

    @Autowired
    private SubscribeRepository subscribeRepository;

    public Subscribe addToSubscribe(Subscribe subscribe) {
        Subscribe tempSubscribe = this.subscribeRepository.save(subscribe);
        return tempSubscribe;
    }
}
