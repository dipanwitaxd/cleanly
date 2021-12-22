package com.kdu.final_assignment.dto;

import lombok.*;

// Custom class that will be used in the BookingDetails class, used for storing the extras details of the booking
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ExtrasDetails {
    private Integer id;

    private String extra;

}
