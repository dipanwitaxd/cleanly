package com.kdu.final_assignment.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "testimonials")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Testimonial {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer testimonial_id;

    private Timestamp testimonial_timestamp;

    private String testimonial_message;

    private String testimonial_user;

    private String testimonial_user_designation;

    private String  testimonial_user_city;

}
