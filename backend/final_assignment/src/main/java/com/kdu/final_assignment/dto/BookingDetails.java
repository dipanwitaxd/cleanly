package com.kdu.final_assignment.dto;

import lombok.*;
import java.sql.Timestamp;
import java.util.List;

// Custom class that will be used while returning booking details of a user.
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class BookingDetails {
    private Timestamp booking_timestamp;

    private String type;

    private String frequency;

    private List<RoomTypeDetails> rooms;

    private List<ExtrasDetails> extras;

    private String date_booked_for;

    private Integer booking_time_period;

    private String booking_start_time;

    private String special_requirements;

    private Double booking_amount;

}
