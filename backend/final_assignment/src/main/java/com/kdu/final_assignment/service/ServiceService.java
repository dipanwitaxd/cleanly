package com.kdu.final_assignment.service;

import com.kdu.final_assignment.dto.ServiceDetails;
import com.kdu.final_assignment.dto.ServiceInfoDetails;
import com.kdu.final_assignment.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceService {

    @Autowired
    private ServiceRepository serviceRepository;

    public List<ServiceDetails> getServices() {
        List<com.kdu.final_assignment.model.Service> services = null;
        List<ServiceDetails> serviceDetails = new ArrayList<>();
        try {
            services = this.serviceRepository.getServices();
            services.forEach(service -> {
                ServiceDetails tempService = new ServiceDetails();
                tempService.setId(service.getId());
                tempService.setService_heading(service.getService_heading());
                tempService.setService_heading_highlighted(service.getService_heading_highlighted());
                tempService.setService_image_url(service.getService_image_url());
                List<ServiceInfoDetails> serviceInfoDetails = new ArrayList<>();
                service.getService_info().forEach(service_info -> {
                    ServiceInfoDetails tempServiceInfoDetails = new ServiceInfoDetails();
                    tempServiceInfoDetails.setId(service_info.getId());
                    tempServiceInfoDetails.setService_details(service_info.getService_info_detail());
                    tempServiceInfoDetails.setService_id(service_info.getService().getId());
                    serviceInfoDetails.add(tempServiceInfoDetails);
                });
                tempService.setService_info(serviceInfoDetails);
                serviceDetails.add(tempService);
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        return serviceDetails;
    }

}
