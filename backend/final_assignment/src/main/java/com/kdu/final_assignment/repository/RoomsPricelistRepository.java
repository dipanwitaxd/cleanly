package com.kdu.final_assignment.repository;

import com.kdu.final_assignment.model.ExtrasPricelist;
import com.kdu.final_assignment.model.RoomsPricelist;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RoomsPricelistRepository extends CrudRepository<RoomsPricelist, Integer> {

    @Query(value = "select * from rooms_pricelist", nativeQuery = true)
    public List<RoomsPricelist> getRoomsPricelist();
}
