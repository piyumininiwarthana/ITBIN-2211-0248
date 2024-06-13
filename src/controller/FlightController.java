/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import dao.FlightDAO;
import java.util.List;
import model.Dashboard;
import model.ManageFlight;

/**
 *
 * @author HP
 */
public class FlightController {
    private FlightDAO flightDAO;

    public FlightController() {
        flightDAO = new FlightDAO();
    }

    public void displayAllFlights() {
        List<Dashboard.Flight> flights = flightDAO.getAllFlights();
        // Display flights in the UI or perform other operations
        for (Dashboard.Flight flight : flights) {
            System.out.println(flight.getFlightCode() + ": " + flight.getDeparture() + " to " + flight.getDestination());
        }
    }
    
}
