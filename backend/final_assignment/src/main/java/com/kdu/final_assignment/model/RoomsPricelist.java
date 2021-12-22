package com.kdu.final_assignment.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rooms_pricelist")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class RoomsPricelist {
    @Id
    private Integer room_id;

    private String room_type;

    private Double price;

    private String room_type_svg_url;

}
