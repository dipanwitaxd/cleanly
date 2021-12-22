package com.kdu.final_assignment.repository;

import com.kdu.final_assignment.model.ExtrasPricelist;
import com.kdu.final_assignment.model.TypePricelist;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TypePricelistRepository extends CrudRepository<TypePricelist, Integer> {

    @Query(value = "select * from type_pricelist", nativeQuery = true)
    public List<TypePricelist> getTypePricelist();

    @Query(value = "select * from type_pricelist where cleaning_type= :type", nativeQuery = true)
    public TypePricelist getTypePricelistByType(@Param("type") String type);
}
