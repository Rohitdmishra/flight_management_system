package com.org.controller;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.org.model.Airport;
import com.org.service.AirportService;
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

@ContextConfiguration(classes = {AirportController.class})
@ExtendWith(SpringExtension.class)
class AirportControllerTest {
    @Autowired
    private AirportController airportController;

    @MockBean
    private AirportService airportService;

    /**
     * Method under test: {@link AirportController#viewAirport(String)}
     */
    @Test
    void testViewAirport() throws Exception {
        Airport airport = new Airport();
        airport.setAirportCode("Airport Code");
        airport.setAirportLocation("Airport Location");
        airport.setAirportName("Airport Name");
        airport.setDstnAirport("Dstn Airport");
        airport.setSrcAirport("Src Airport");
        when(airportService.viewAirport((String) any())).thenReturn(airport);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/airport/viewAirport/{id}", "42");
        MockMvcBuilders.standaloneSetup(airportController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"airportCode\":\"Airport Code\",\"airportLocation\":\"Airport Location\",\"airportName\":\"Airport Name\","
                                        + "\"srcAirport\":\"Src Airport\",\"dstnAirport\":\"Dstn Airport\"}"));
    }

    /**
     * Method under test: {@link AirportController#viewAllAirport()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testViewAllAirport() {

        (new AirportController()).viewAllAirport().iterator();
    }

    /**
     * Method under test: {@link AirportController#addAirport(Airport)}
     */
    @Test
    void testAddAirport() throws Exception {
        when((ResponseEntity<Object>) airportService.addAirport((Airport) any()))
                .thenReturn(new ResponseEntity<>(HttpStatus.CONTINUE));

        Airport airport = new Airport();
        airport.setAirportCode("Airport Code");
        airport.setAirportLocation("Airport Location");
        airport.setAirportName("Airport Name");
        airport.setDstnAirport("Dstn Airport");
        airport.setSrcAirport("Src Airport");
        String content = (new ObjectMapper()).writeValueAsString(airport);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/airport/addAirport")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(airportController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().isCreated())
                .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
                .andExpect(MockMvcResultMatchers.content().string("Airport added Successfully!"));
    }

    /**
     * Method under test: {@link AirportController#modifyAirport(Airport)}
     */
    @Test
    void testModifyAirport() throws Exception {
        Airport airport = new Airport();
        airport.setAirportCode("Airport Code");
        airport.setAirportLocation("Airport Location");
        airport.setAirportName("Airport Name");
        airport.setDstnAirport("Dstn Airport");
        airport.setSrcAirport("Src Airport");
        when(airportService.modifyAirport((Airport) any())).thenReturn(airport);

        Airport airport1 = new Airport();
        airport1.setAirportCode("Airport Code");
        airport1.setAirportLocation("Airport Location");
        airport1.setAirportName("Airport Name");
        airport1.setDstnAirport("Dstn Airport");
        airport1.setSrcAirport("Src Airport");
        String content = (new ObjectMapper()).writeValueAsString(airport1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.put("/airport/updateAirport")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(airportController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().isCreated())
                .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
                .andExpect(MockMvcResultMatchers.content().string("Updated Airport Successfully!"));
    }

    /**
     * Method under test: {@link AirportController#removeAirport(String)}
     */
    @Test
    void testRemoveAirport() throws Exception {
        when(airportService.removeAirport((String) any())).thenReturn("Remove Airport");
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/airport/deleteAirport/{id}", "42");
        MockMvcBuilders.standaloneSetup(airportController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
                .andExpect(MockMvcResultMatchers.content().string("Deleted Airport Successfully!"));
    }
}

