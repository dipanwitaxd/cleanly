package com.kdu.final_assignment.repository;

import com.kdu.final_assignment.model.ExtrasPricelist;
import com.kdu.final_assignment.model.FrequencyPricelist;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FrequencyPricelistRepository extends CrudRepository<FrequencyPricelist, Integer> {

    @Query(value = "select * from frequency_pricelist", nativeQuery = true)
    public List<FrequencyPricelist> getFrequencyPricelist();

    @Query(value = "select * from frequency_pricelist where frequency= :frequency", nativeQuery = true)
    public FrequencyPricelist getFrequencyPricelistByFrequency(@Param("frequency") String frequency);
}
