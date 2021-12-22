package com.kdu.final_assignment.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "frequency_pricelist")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class FrequencyPricelist {

    @Id
    private Integer frequency_id;

    private String frequency;

    private Double price;
}
