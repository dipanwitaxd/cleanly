package com.kdu.final_assignment.service;

import com.kdu.final_assignment.dto.BookingDetails;
import com.kdu.final_assignment.dto.ExtrasDetails;
import com.kdu.final_assignment.dto.RoomTypeDetails;
import com.kdu.final_assignment.model.*;
import com.kdu.final_assignment.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private TypePricelistService typePricelistService;

    @Autowired
    private FrequencyPricelistService frequencyPricelistService;

    @Autowired
    private RoomsPricelistService roomsPricelistService;

    @Autowired
    private ExtrasPricelistService extrasPricelistService;

    // TODO: get pricing and calculate amount
    public Double calculateAmount(Booking booking) {
//        TypePricelist cleaning_pricelist = this.typePricelistService.getTypePricelistByType(booking.getType());
//        FrequencyPricelist frequency_pricelist = this.frequencyPricelistService.getFrequencyPricelistByFrequency(booking.getFrequency());
//        List<RoomsPricelist> rooms_pricelist = this.roomsPricelistService.getRoomsPricelist();
//        List<ExtrasPricelist> extras_pricelist = this.extrasPricelistService.getExtrasPricelist();
//
//        Map<String, Double> roomTypePricingMap = new HashMap<String, Double>();
//        Map<String, Double> extrasPricingMap = new HashMap<String, Double>();
//        double amount = 0.0;
//
//        rooms_pricelist.forEach(room -> {
//            roomTypePricingMap.put(room.getRoom_type(), room.getPrice());
//        });
//
//        extras_pricelist.forEach(extra -> {
//            extrasPricingMap.put(extra.getExtras_type(), extra.getPrice());
//        });
//
//        amount += cleaning_pricelist.getPrice();
//        amount += frequency_pricelist.getPrice();
////        booking.getRoom_type().forEach(room-> {
////            String type = room.getRoom_type();
////            int roomCount = room.getRoom_count();
////            amount += (roomTypePricingMap.get(type)*roomCount);
////        });
//
//        for(RoomType room : booking.getRoom_type()) {
//            String type = room.getRoom_type();
//            int roomCount = room.getRoom_count();
//            amount += (roomTypePricingMap.get(type)*roomCount);
//        }
//
////        booking.getExtras().forEach(extra -> {
////
////        });
//
//        for(Extras extra : booking.getExtras()) {
//            String extras = extra.getExtras_type();
//            amount += extrasPricingMap.get(extras);
//        }

        return 0.0;
    }

    public List<BookingDetails> getBookingsByUsername(String username) {
        List<Booking> bookings = this.bookingRepository.getBookingsByUsername(username);
        List<BookingDetails> bookingsDetail = new ArrayList<>();
        bookings.forEach(booking -> {
            BookingDetails tempBookingDetail = new BookingDetails();
            tempBookingDetail.setBooking_timestamp(booking.getBooking_timestamp());
            tempBookingDetail.setType(booking.getType());
            tempBookingDetail.setFrequency(booking.getFrequency());
            List<RoomTypeDetails> roomTypes = new ArrayList<>();
            List<ExtrasDetails> extrasDetails = new ArrayList<>();
            booking.getRoom_type().forEach(room -> {
                RoomTypeDetails tempRoomDetail = new RoomTypeDetails();
                tempRoomDetail.setId(room.getId());
                tempRoomDetail.setRoom_type(room.getRoom_type());
                tempRoomDetail.setCount(room.getRoom_count());
                roomTypes.add(tempRoomDetail);
            });
            booking.getExtras().forEach(extra -> {
                ExtrasDetails tempExtraDetail = new ExtrasDetails();
                tempExtraDetail.setId(extra.getId());
                tempExtraDetail.setExtra(extra.getExtras_type());
                extrasDetails.add(tempExtraDetail);
            });
            tempBookingDetail.setRooms(roomTypes);
            tempBookingDetail.setExtras(extrasDetails);

            tempBookingDetail.setDate_booked_for(booking.getDate_booked_for());
            tempBookingDetail.setBooking_time_period(booking.getBooking_time_period());
            tempBookingDetail.setBooking_start_time(booking.getBooking_start_time());
            tempBookingDetail.setBooking_amount(booking.getBooking_amount());
            tempBookingDetail.setSpecial_requirements(booking.getSpecial_requirements());
            bookingsDetail.add(tempBookingDetail);
        });
        return bookingsDetail;
    }

    public String addBooking(Booking booking) {
        System.out.println(booking);
        Booking tempBooking = this.bookingRepository.save(booking);
        System.out.println(tempBooking);
        if(tempBooking == null) {
            return "Booking unsuccessful";
        }
        tempBooking.getRoom_type().forEach(roomType -> {
            roomType.setBooking(tempBooking);
        });
        tempBooking.getExtras().forEach(extras -> {
            extras.setBooking(tempBooking);
        });
//        tempBooking.setBooking_amount(calculateAmount(tempBooking));
        this.bookingRepository.save(tempBooking);
        return "Booking Successful";
    }
}
