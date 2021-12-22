package com.kdu.final_assignment.model;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "bookings")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString

public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    private String username;

    @CreationTimestamp
    private Timestamp booking_timestamp;

    @NotNull
    private String type;

    @NotNull
    private String frequency;

    @NotNull
    @OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY, mappedBy = "booking")
    private List<RoomType> room_type;

    @OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY, mappedBy = "booking")
    private List<Extras> extras;

    @NotNull
    private String date_booked_for;

    @NotNull
    private Integer booking_time_period;

    @NotNull
    private String booking_start_time;

    private String special_requirements;

    @NotNull
    private Double booking_amount;

}
