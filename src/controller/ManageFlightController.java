/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author HP
 */

import dao.FlightDAO;
import model.ManageFlight;
import java.util.List;
import model.Dashboard;

public class ManageFlightController {
    private FlightDAO flightDAO;

    public ManageFlightController() {
        flightDAO = new FlightDAO();
    }

    public List<Dashboard.Flight> getAllFlights() throws Exception {
        return flightDAO.getAllFlights();
    }

    public void addFlight(ManageFlight flight) throws Exception {
        flightDAO.insertFlight(flight);
    }

    public void updateFlight(ManageFlight flight) throws Exception {
        flightDAO.updateFlight(flight);
    }

    public void deleteFlight(String flightCode) throws Exception {
        flightDAO.deleteFlight(flightCode);
    }
}
