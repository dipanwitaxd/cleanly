package com.kdu.final_assignment.controller;

import com.kdu.final_assignment.dto.ServiceDetails;
import com.kdu.final_assignment.dto.ServiceInfoDetails;
import com.kdu.final_assignment.model.Service;
import com.kdu.final_assignment.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ServiceController {

    @Autowired
    private ServiceService serviceService;

    @CrossOrigin
    @GetMapping("/services")
    public ResponseEntity getServices() {
        List<ServiceDetails> serviceDetails = this.serviceService.getServices();
        if(serviceDetails == null) {
            return new ResponseEntity<>("No services found", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(serviceDetails, HttpStatus.OK);
    }

}
