package com.kdu.final_assignment.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "extras_pricelist")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class ExtrasPricelist {
    @Id
    private Integer extras_id;

    private String extras_type;

    private Double price;

    private String extras_svg_url;
}
