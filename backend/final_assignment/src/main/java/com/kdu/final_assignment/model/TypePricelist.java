package com.kdu.final_assignment.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "type_pricelist")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class TypePricelist {
    @Id
    private Integer type_id;

    private String cleaning_type;

    private Double price;
}
