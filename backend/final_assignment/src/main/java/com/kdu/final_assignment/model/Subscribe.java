package com.kdu.final_assignment.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "subscribe")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Subscribe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer subs_id;

    private String email;
}
