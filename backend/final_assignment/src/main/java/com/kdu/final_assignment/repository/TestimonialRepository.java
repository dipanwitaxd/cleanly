package com.kdu.final_assignment.repository;


import com.kdu.final_assignment.model.Testimonial;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TestimonialRepository extends CrudRepository<Testimonial, Integer> {
    @Query(value = "select * from testimonials", nativeQuery = true)
    public List<Testimonial> getTestimonials();
}
