package com.kdu.final_assignment.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "room_type")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RoomType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String room_type;

    private Integer room_count;

    @ManyToOne
    @JoinColumn(name = "booking_id")
    private Booking booking;

}
