package com.org.controller;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.org.model.Flight;
import com.org.service.FlightService;

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

@ContextConfiguration(classes = {FlightController.class})
@ExtendWith(SpringExtension.class)
class FlightControllerTest {
    @Autowired
    private FlightController flightController;

    @MockBean
    private FlightService flightService;

    /**
     * Method under test: {@link FlightController#addFlight(Flight)}
     */
    @Test
    void testAddFlight() throws Exception {
        when((ResponseEntity<Object>) flightService.addFlight((Flight) any()))
                .thenReturn(new ResponseEntity<>(HttpStatus.CONTINUE));

        Flight flight = new Flight();
        flight.setCarrierName("Carrier Name");
        flight.setFlightModel("Flight Model");
        flight.setFlightNo(BigInteger.valueOf(42L));
        flight.setSeatCapacity(1);
        String content = (new ObjectMapper()).writeValueAsString(flight);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/flight/addFlight")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(flightController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().isCreated())
                .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
                .andExpect(MockMvcResultMatchers.content().string("Flight added Successfully!"));
    }

    /**
     * Method under test: {@link FlightController#viewAllFlight()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testViewAllFlight() {
       (new FlightController()).viewAllFlight().iterator();
    }

    /**
     * Method under test: {@link FlightController#viewFlight(BigInteger)}
     */
    @Test
    void testViewFlight() throws Exception {
        Flight flight = new Flight();
        flight.setCarrierName("Carrier Name");
        flight.setFlightModel("Flight Model");
        flight.setFlightNo(BigInteger.valueOf(42L));
        flight.setSeatCapacity(1);
        when(flightService.viewFlight((BigInteger) any())).thenReturn(flight);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/flight/viewFlight/{id}",
                BigInteger.valueOf(42L));
        MockMvcBuilders.standaloneSetup(flightController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"flightNo\":42,\"carrierName\":\"Carrier Name\",\"flightModel\":\"Flight Model\",\"seatCapacity\":1}"));
    }

    /**
     * Method under test: {@link FlightController#modifyFlight(Flight)}
     */
    @Test
    void testModifyFlight() throws Exception {
        Flight flight = new Flight();
        flight.setCarrierName("Carrier Name");
        flight.setFlightModel("Flight Model");
        flight.setFlightNo(BigInteger.valueOf(42L));
        flight.setSeatCapacity(1);
        when(flightService.modifyFlight((Flight) any())).thenReturn(flight);

        Flight flight1 = new Flight();
        flight1.setCarrierName("Carrier Name");
        flight1.setFlightModel("Flight Model");
        flight1.setFlightNo(BigInteger.valueOf(42L));
        flight1.setSeatCapacity(1);
        String content = (new ObjectMapper()).writeValueAsString(flight1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.put("/flight/updateFlight")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(flightController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().isCreated())
                .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
                .andExpect(MockMvcResultMatchers.content().string("Updated Flight Successfully!"));
    }

    /**
     * Method under test: {@link FlightController#removeFlight(BigInteger)}
     */
    @Test
    void testRemoveFlight() throws Exception {
        when(flightService.removeFlight((BigInteger) any())).thenReturn("Remove Flight");
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/flight/deleteFlight/{id}",
                BigInteger.valueOf(42L));
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(flightController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().isCreated())
                .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
                .andExpect(MockMvcResultMatchers.content().string("Deleted Flight Successfully!"));
    }
}

