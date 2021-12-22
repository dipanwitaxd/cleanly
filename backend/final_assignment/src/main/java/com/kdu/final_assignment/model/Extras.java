package com.kdu.final_assignment.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "extras")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class Extras {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String extras_type;

    @ManyToOne
    @JoinColumn(name = "booking_id")
    private Booking booking;

}
