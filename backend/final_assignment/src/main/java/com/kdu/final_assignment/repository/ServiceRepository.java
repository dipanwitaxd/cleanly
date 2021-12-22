package com.kdu.final_assignment.repository;

import com.kdu.final_assignment.model.Service;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ServiceRepository extends CrudRepository<Service, Integer> {

    @Query(value = "select * from services", nativeQuery = true)
    public List<Service> getServices();
}
