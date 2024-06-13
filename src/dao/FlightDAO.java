/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.util.ArrayList;
import java.util.List;
import model.Dashboard.Flight;
import model.ManageFlight;

/**
 *
 * @author HP
 */
public class FlightDAO {
    private List<Flight> flights;

    public FlightDAO() {
        flights = new ArrayList<>();
        // Initialize flights or load from database
    }

    public List<Flight> getAllFlights() {
        // Retrieve all flights from the database or in-memory list
        return flights;
    }

    public void insertFlight(ManageFlight flight) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateFlight(ManageFlight flight) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void deleteFlight(String flightCode) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
