package com.kdu.final_assignment.dto;

import lombok.*;

// Custom class that will be used in the BookingDetails class, used for storing the room type details of the booking
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class RoomTypeDetails {
    private Integer id;

    private String room_type;

    private Integer count;

}
