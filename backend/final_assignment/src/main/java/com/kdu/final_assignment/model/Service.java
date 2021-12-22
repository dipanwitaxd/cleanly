package com.kdu.final_assignment.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "services")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String service_heading;

    private String service_heading_highlighted;

    private String service_image_url;

    @OneToMany(mappedBy = "service", cascade = CascadeType.ALL)
    private List<ServiceInfo> service_info = new ArrayList<>();

}
