package com.kdu.final_assignment.service;

import com.kdu.final_assignment.model.ExtrasPricelist;
import com.kdu.final_assignment.model.RoomsPricelist;
import com.kdu.final_assignment.repository.RoomsPricelistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomsPricelistService {

    @Autowired
    private RoomsPricelistRepository roomsPricelistRepository;

    public List<RoomsPricelist> getRoomsPricelist() {
        List<RoomsPricelist> roomsPricelist = null;
        try {
            roomsPricelist = this.roomsPricelistRepository.getRoomsPricelist();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return roomsPricelist;
    }
}
