package com.kdu.final_assignment.dto;

import lombok.*;
import java.util.List;

// Custom class for returning the services
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class ServiceDetails {
    private Integer id;

    private String service_heading;

    private String service_heading_highlighted;

    private String service_image_url;

    private List<ServiceInfoDetails> service_info;
}
