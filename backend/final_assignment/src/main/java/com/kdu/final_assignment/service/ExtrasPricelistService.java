package com.kdu.final_assignment.service;

import com.kdu.final_assignment.model.ExtrasPricelist;
import com.kdu.final_assignment.model.Testimonial;
import com.kdu.final_assignment.repository.ExtrasPricelistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExtrasPricelistService {

    @Autowired
    private ExtrasPricelistRepository extrasPricelistRepository;

    public List<ExtrasPricelist> getExtrasPricelist() {
        List<ExtrasPricelist> extrasPricelist = null;
        try {
            extrasPricelist = this.extrasPricelistRepository.getExtrasPricelist();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return extrasPricelist;
    }
}
