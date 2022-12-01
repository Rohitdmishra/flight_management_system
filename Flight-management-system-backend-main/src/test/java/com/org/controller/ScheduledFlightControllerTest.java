package com.org.controller;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.org.model.Airport;
import com.org.model.Flight;
import com.org.model.Schedule;
import com.org.model.ScheduledFlight;
import com.org.service.ScheduledFlightService;

import java.math.BigInteger;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(classes = {ScheduledFlightController.class})
@ExtendWith(SpringExtension.class)
class ScheduledFlightControllerTest {
    @Autowired
    private ScheduledFlightController scheduledFlightController;

    @MockBean
    private ScheduledFlightService scheduledFlightService;

    /**
     * Method under test: {@link ScheduledFlightController#addScheduledFlight(ScheduledFlight)}
     */
    @Test
    void testAddScheduledFlight() throws Exception {
        Airport airport = new Airport();
        airport.setAirportCode("Airport Code");
        airport.setAirportLocation("Airport Location");
        airport.setAirportName("Airport Name");
        airport.setDstnAirport("Dstn Airport");
        airport.setSrcAirport("Src Airport");

        Flight flight = new Flight();
        flight.setCarrierName("Carrier Name");
        flight.setFlightModel("Flight Model");
        flight.setFlightNo(BigInteger.valueOf(42L));
        flight.setSeatCapacity(1);

        Schedule schedule = new Schedule();
        schedule.setArrDateTime("2020-03-01");
        schedule.setDeptDateTime("2020-03-01");
        schedule.setScheduleId(BigInteger.valueOf(42L));

        ScheduledFlight scheduledFlight = new ScheduledFlight();
        scheduledFlight.setAirport(airport);
        scheduledFlight.setAvailableSeats(1);
        scheduledFlight.setFlight(flight);
        scheduledFlight.setSchedule(schedule);
        scheduledFlight.setScheduleFlightId(BigInteger.valueOf(42L));
        when(scheduledFlightService.addScheduledFlight((ScheduledFlight) any())).thenReturn(scheduledFlight);

        Airport airport1 = new Airport();
        airport1.setAirportCode("Airport Code");
        airport1.setAirportLocation("Airport Location");
        airport1.setAirportName("Airport Name");
        airport1.setDstnAirport("Dstn Airport");
        airport1.setSrcAirport("Src Airport");

        Flight flight1 = new Flight();
        flight1.setCarrierName("Carrier Name");
        flight1.setFlightModel("Flight Model");
        flight1.setFlightNo(BigInteger.valueOf(42L));
        flight1.setSeatCapacity(1);

        Schedule schedule1 = new Schedule();
        schedule1.setArrDateTime("2020-03-01");
        schedule1.setDeptDateTime("2020-03-01");
        schedule1.setScheduleId(BigInteger.valueOf(42L));

        ScheduledFlight scheduledFlight1 = new ScheduledFlight();
        scheduledFlight1.setAirport(airport1);
        scheduledFlight1.setAvailableSeats(1);
        scheduledFlight1.setFlight(flight1);
        scheduledFlight1.setSchedule(schedule1);
        scheduledFlight1.setScheduleFlightId(BigInteger.valueOf(42L));
        String content = (new ObjectMapper()).writeValueAsString(scheduledFlight1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/scheduledFlight/add")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(scheduledFlightController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().isCreated())
                .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
                .andExpect(MockMvcResultMatchers.content().string("Scheduled Flight added successfully!"));
    }

    /**
     * Method under test: {@link ScheduledFlightController#viewAllScheduledFlights()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testViewAllScheduledFlights() {
    (new ScheduledFlightController()).viewAllScheduledFlights().iterator();
    }

    /**
     * Method under test: {@link ScheduledFlightController#deleteBookingByID(BigInteger)}
     */
    @Test
    void testDeleteBookingByID() throws Exception {
        when(scheduledFlightService.removeScheduledFlight((BigInteger) any())).thenReturn("Remove Scheduled Flight");
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/scheduledFlight/delete/{id}",
                BigInteger.valueOf(42L));
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(scheduledFlightController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().isCreated())
                .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
                .andExpect(MockMvcResultMatchers.content().string("Deleted scheduled flight Successfully!"));
    }

    /**
     * Method under test: {@link ScheduledFlightController#searchByID(BigInteger)}
     */
    @Test
    void testSearchByID() throws Exception {
        Airport airport = new Airport();
        airport.setAirportCode("Airport Code");
        airport.setAirportLocation("Airport Location");
        airport.setAirportName("Airport Name");
        airport.setDstnAirport("Dstn Airport");
        airport.setSrcAirport("Src Airport");

        Flight flight = new Flight();
        flight.setCarrierName("Carrier Name");
        flight.setFlightModel("Flight Model");
        flight.setFlightNo(BigInteger.valueOf(42L));
        flight.setSeatCapacity(1);

        Schedule schedule = new Schedule();
        schedule.setArrDateTime("2020-03-01");
        schedule.setDeptDateTime("2020-03-01");
        schedule.setScheduleId(BigInteger.valueOf(42L));

        ScheduledFlight scheduledFlight = new ScheduledFlight();
        scheduledFlight.setAirport(airport);
        scheduledFlight.setAvailableSeats(1);
        scheduledFlight.setFlight(flight);
        scheduledFlight.setSchedule(schedule);
        scheduledFlight.setScheduleFlightId(BigInteger.valueOf(42L));
        when(scheduledFlightService.viewScheduledFlight((BigInteger) any())).thenReturn(scheduledFlight);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/scheduledFlight/search/{id}",
                BigInteger.valueOf(42L));
        MockMvcBuilders.standaloneSetup(scheduledFlightController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"scheduleFlightId\":42,\"flight\":{\"flightNo\":42,\"carrierName\":\"Carrier Name\",\"flightModel\":\"Flight"
                                        + " Model\",\"seatCapacity\":1},\"availableSeats\":1,\"schedule\":{\"scheduleId\":42,\"deptDateTime\":\"2020-03-01\""
                                        + ",\"arrDateTime\":\"2020-03-01\"},\"airport\":{\"airportCode\":\"Airport Code\",\"airportLocation\":\"Airport"
                                        + " Location\",\"airportName\":\"Airport Name\",\"srcAirport\":\"Src Airport\",\"dstnAirport\":\"Dstn Airport\"}}"));
    }
}

