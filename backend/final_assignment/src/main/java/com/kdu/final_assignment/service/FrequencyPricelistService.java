package com.kdu.final_assignment.service;

import com.kdu.final_assignment.model.ExtrasPricelist;
import com.kdu.final_assignment.model.FrequencyPricelist;
import com.kdu.final_assignment.repository.FrequencyPricelistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FrequencyPricelistService {

    @Autowired
    private FrequencyPricelistRepository frequencyPricelistRepository;

    public List<FrequencyPricelist> getFrequencyPricelist() {
        List<FrequencyPricelist> frequencyPricelist = null;
        try {
            frequencyPricelist = this.frequencyPricelistRepository.getFrequencyPricelist();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return frequencyPricelist;
    }

    public FrequencyPricelist getFrequencyPricelistByFrequency(String frequency) {
        FrequencyPricelist frequencyPricelist = null;
        try {
            frequencyPricelist = this.frequencyPricelistRepository.getFrequencyPricelistByFrequency(frequency);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return frequencyPricelist;
    }
}
