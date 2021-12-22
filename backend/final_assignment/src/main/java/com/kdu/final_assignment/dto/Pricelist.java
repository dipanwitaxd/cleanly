package com.kdu.final_assignment.dto;

import com.kdu.final_assignment.model.*;
import lombok.*;
import java.util.List;

// Custom class that will be used for returning the pricing in the PricingController

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class Pricelist {
    private List<TypePricelist> cleaning_pricelist;

    private List<FrequencyPricelist> frequency_pricelist;

    private List<RoomsPricelist> rooms_pricelist;

    private List<ExtrasPricelist> extras_pricelist;

}

