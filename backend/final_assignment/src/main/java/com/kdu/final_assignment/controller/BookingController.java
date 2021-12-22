package com.kdu.final_assignment.controller;

import com.kdu.final_assignment.dto.BookingDetails;
import com.kdu.final_assignment.dto.BookingUser;
import com.kdu.final_assignment.model.Booking;
import com.kdu.final_assignment.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@Validated
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @CrossOrigin
    @GetMapping("/booking/")
    public ResponseEntity getBookingsByUsername(String username) {
        List<BookingDetails> bookings = this.bookingService.getBookingsByUsername(username);
        if(bookings == null) {
            return new ResponseEntity<>("No bookings found", HttpStatus.OK);
        }
        return new ResponseEntity<>(bookings, HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping("/booking")
    public ResponseEntity addBookingByUsername(@NotNull @RequestBody Booking booking) {
        String addStatus = this.bookingService.addBooking(booking);
        return new ResponseEntity<>(addStatus, HttpStatus.OK);
    }

}
