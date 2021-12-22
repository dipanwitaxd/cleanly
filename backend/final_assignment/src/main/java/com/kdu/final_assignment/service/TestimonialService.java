package com.kdu.final_assignment.service;

import com.kdu.final_assignment.model.Testimonial;
import com.kdu.final_assignment.repository.TestimonialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestimonialService {

    @Autowired
    private TestimonialRepository testimonialRepository;

    public List<Testimonial> getAllTestimonials() {
        List<Testimonial> testimonials = null;
        try {
            testimonials = this.testimonialRepository.getTestimonials();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return testimonials;
    }
}
