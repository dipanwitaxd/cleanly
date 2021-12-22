package com.kdu.final_assignment.repository;

import com.kdu.final_assignment.model.Booking;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookingRepository extends CrudRepository<Booking, Integer> {

    @Query(value = "select * from bookings where username= :username", nativeQuery = true)
    public List<Booking> getBookingsByUsername(@Param("username") String username);
}
