package com.kdu.final_assignment.controller;

import com.kdu.final_assignment.model.Testimonial;
import com.kdu.final_assignment.service.TestimonialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestimonialController {

    @Autowired
    private TestimonialService testimonialService;

    @CrossOrigin
    @GetMapping("/testimonials")
    public ResponseEntity getTestimonials() {
        List<Testimonial> testimonials = this.testimonialService.getAllTestimonials();
        if(testimonials == null) {
            return new ResponseEntity<>("No testimonials found", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(testimonials, HttpStatus.OK);
    }
}
