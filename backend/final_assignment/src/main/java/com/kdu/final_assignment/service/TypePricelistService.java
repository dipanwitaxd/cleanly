package com.kdu.final_assignment.service;

import com.kdu.final_assignment.model.ExtrasPricelist;
import com.kdu.final_assignment.model.TypePricelist;
import com.kdu.final_assignment.repository.TypePricelistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypePricelistService {

    @Autowired
    private TypePricelistRepository typePricelistRepository;

    public List<TypePricelist> getTypePricelist() {
        List<TypePricelist> typePricelist = null;
        try {
            typePricelist = this.typePricelistRepository.getTypePricelist();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return typePricelist;
    }

    public TypePricelist getTypePricelistByType(String type) {
        TypePricelist typePricelist = null;
        try {
            typePricelist = this.typePricelistRepository.getTypePricelistByType(type);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return typePricelist;
    }
}
