package com.org.controller;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.org.model.Booking;
import com.org.service.BookingService;

import java.math.BigInteger;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(classes = {BookingController.class})
@ExtendWith(SpringExtension.class)
class BookingControllerTest {
    @Autowired
    private BookingController bookingController;

    @MockBean
    private BookingService bookingService;

    /**
     * Method under test: {@link BookingController#addBooking(Booking)}
     */
    @Test
    void testAddBooking() throws Exception {
        when((ResponseEntity<Object>) bookingService.createBooking((Booking) any()))
                .thenReturn(new ResponseEntity<>(HttpStatus.CONTINUE));

        Booking booking = new Booking();
        booking.setBookingDate("2020-03-01");
        booking.setBookingId(BigInteger.valueOf(42L));
        booking.setNoOfPassengers(1);
        String content = (new ObjectMapper()).writeValueAsString(booking);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/booking/createBooking")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(bookingController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().isCreated())
                .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
                .andExpect(MockMvcResultMatchers.content().string("Booking added Successfully!"));
    }

    /**
     * Method under test: {@link BookingController#readAllBookings()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testReadAllBookings() {
        (new BookingController()).readAllBookings().iterator();
    }

    /**
     * Method under test: {@link BookingController#deleteBookingByID(BigInteger)}
     */
    @Test
    void testDeleteBookingByID() throws Exception {
        when(bookingService.deleteBooking((BigInteger) any())).thenReturn("Delete Booking");
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/booking/deleteBooking/{id}",
                BigInteger.valueOf(42L));
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(bookingController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().isCreated())
                .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
                .andExpect(MockMvcResultMatchers.content().string("Booking Deleted Successfully!"));
    }

    /**
     * Method under test: {@link BookingController#modifyBooking(Booking)}
     */
    @Test
    void testModifyBooking() throws Exception {
        Booking booking = new Booking();
        booking.setBookingDate("2020-03-01");
        booking.setBookingId(BigInteger.valueOf(42L));
        booking.setNoOfPassengers(1);
        when(bookingService.updateBooking((Booking) any())).thenReturn(booking);

        Booking booking1 = new Booking();
        booking1.setBookingDate("2020-03-01");
        booking1.setBookingId(BigInteger.valueOf(42L));
        booking1.setNoOfPassengers(1);
        String content = (new ObjectMapper()).writeValueAsString(booking1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.put("/booking/updateBooking")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(bookingController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().isCreated())
                .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
                .andExpect(MockMvcResultMatchers.content().string("Updated Booking Successfully!"));
    }

    /**
     * Method under test: {@link BookingController#searchBookingByID(BigInteger)}
     */
    @Test
    void testSearchBookingByID() throws Exception {
        when((ResponseEntity<Object>) bookingService.findBookingById((BigInteger) any()))
                .thenReturn(new ResponseEntity<>(HttpStatus.CONTINUE));
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/booking/searchBooking/{id}",
                BigInteger.valueOf(42L));
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(bookingController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().is(100));
    }
}

