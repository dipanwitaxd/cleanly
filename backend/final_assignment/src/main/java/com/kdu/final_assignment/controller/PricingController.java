package com.kdu.final_assignment.controller;

import com.kdu.final_assignment.dto.Pricelist;
import com.kdu.final_assignment.model.ExtrasPricelist;
import com.kdu.final_assignment.model.FrequencyPricelist;
import com.kdu.final_assignment.model.RoomsPricelist;
import com.kdu.final_assignment.model.TypePricelist;
import com.kdu.final_assignment.service.ExtrasPricelistService;
import com.kdu.final_assignment.service.FrequencyPricelistService;
import com.kdu.final_assignment.service.RoomsPricelistService;
import com.kdu.final_assignment.service.TypePricelistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PricingController {

    @Autowired
    private TypePricelistService typePricelistService;

    @Autowired
    private FrequencyPricelistService frequencyPricelistService;

    @Autowired
    private RoomsPricelistService roomsPricelistService;

    @Autowired
    private ExtrasPricelistService extrasPricelistService;

    @CrossOrigin
    @GetMapping("/get_pricing")
    public ResponseEntity getPricing() {
        List<TypePricelist> cleaning_pricelist = this.typePricelistService.getTypePricelist();
        List<FrequencyPricelist> frequency_pricelist = this.frequencyPricelistService.getFrequencyPricelist();
        List<RoomsPricelist> rooms_pricelist = this.roomsPricelistService.getRoomsPricelist();
        List<ExtrasPricelist> extras_pricelist = this.extrasPricelistService.getExtrasPricelist();
        if(cleaning_pricelist == null || frequency_pricelist == null || rooms_pricelist == null || extras_pricelist == null) {
            return new ResponseEntity<>("Prices could not be fetched", HttpStatus.NOT_FOUND);
        }
        Pricelist pricelist = new Pricelist();
        pricelist.setCleaning_pricelist(cleaning_pricelist);
        pricelist.setFrequency_pricelist(frequency_pricelist);
        pricelist.setRooms_pricelist(rooms_pricelist);
        pricelist.setExtras_pricelist(extras_pricelist);
        return new ResponseEntity<>(pricelist, HttpStatus.OK);
    }
}
