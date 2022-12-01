package com.org.controller;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.org.model.Passenger;
import com.org.service.PassengerService;

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

@ContextConfiguration(classes = {PassengerController.class})
@ExtendWith(SpringExtension.class)
class PassengerControllerTest {
    @Autowired
    private PassengerController passengerController;

    @MockBean
    private PassengerService passengerService;

    /**
     * Method under test: {@link PassengerController#updatePassenger(Passenger)}
     */
    @Test
    void testUpdatePassenger() throws Exception {
        Passenger passenger = new Passenger();
        passenger.setLuggage(1);
        passenger.setPassengerAge(1);
        passenger.setPassengerName("Passenger Name");
        passenger.setPassengerUIN(BigInteger.valueOf(42L));
        passenger.setPnrNumber(BigInteger.valueOf(42L));
        when(passengerService.updatePassenger((Passenger) any())).thenReturn(passenger);

        Passenger passenger1 = new Passenger();
        passenger1.setLuggage(1);
        passenger1.setPassengerAge(1);
        passenger1.setPassengerName("Passenger Name");
        passenger1.setPassengerUIN(BigInteger.valueOf(42L));
        passenger1.setPnrNumber(BigInteger.valueOf(42L));
        String content = (new ObjectMapper()).writeValueAsString(passenger1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.put("/passenger/updatePassenger")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(passengerController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().isCreated())
                .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
                .andExpect(MockMvcResultMatchers.content().string("Updated Passenger Successfully!"));
    }

    /**
     * Method under test: {@link PassengerController#addPassenger(Passenger)}
     */
    @Test
    void testAddPassenger() throws Exception {
        when((ResponseEntity<Object>) passengerService.createPassenger((Passenger) any()))
                .thenReturn(new ResponseEntity<>(HttpStatus.CONTINUE));

        Passenger passenger = new Passenger();
        passenger.setLuggage(1);
        passenger.setPassengerAge(1);
        passenger.setPassengerName("Passenger Name");
        passenger.setPassengerUIN(BigInteger.valueOf(42L));
        passenger.setPnrNumber(BigInteger.valueOf(42L));
        String content = (new ObjectMapper()).writeValueAsString(passenger);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/passenger/createPassenger")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(passengerController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().isCreated())
                .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
                .andExpect(MockMvcResultMatchers.content().string("Passenger Created Successfully!"));
    }

    /**
     * Method under test: {@link PassengerController#readAllUsers()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testReadAllUsers() {
       (new PassengerController()).readAllUsers().iterator();
    }

    /**
     * Method under test: {@link PassengerController#deleteBookingByID(BigInteger)}
     */
    @Test
    void testDeleteBookingByID() throws Exception {
        when(passengerService.deletePassenger((BigInteger) any())).thenReturn("Delete Passenger");
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/passenger/deletePassenger/{pnr}",
                BigInteger.valueOf(42L));
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(passengerController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().isCreated())
                .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
                .andExpect(MockMvcResultMatchers.content().string("Deleted Passenger Successfully!"));
    }
}

