package com.kdu.final_assignment.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.MetaValue;

import javax.persistence.*;
import java.util.Arrays;

@Entity
@Table(name = "service_info")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class ServiceInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

//    @ManyToOne(fetch = FetchType.LAZY)
    @ManyToOne
    @JoinColumn(name = "service_id")
    private Service service;

    private String service_info_detail;
}
