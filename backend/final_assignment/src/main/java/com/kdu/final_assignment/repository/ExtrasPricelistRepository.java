package com.kdu.final_assignment.repository;

import com.kdu.final_assignment.model.ExtrasPricelist;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ExtrasPricelistRepository extends CrudRepository<ExtrasPricelist, Integer> {

    @Query(value = "select * from extras_pricelist", nativeQuery = true)
    public List<ExtrasPricelist> getExtrasPricelist();
}
