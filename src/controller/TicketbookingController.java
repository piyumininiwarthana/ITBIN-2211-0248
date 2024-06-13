/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Ticket;
import view.TicketbookingView;
/**
 *
 * @author HP
 */
public class TicketbookingController {
    private TicketbookingView view;

    public TicketbookingController(TicketbookingView view) {
        this.view = view;
    }

    public void saveTicketData(Ticket ticket) {
        // Code to save ticket data to the database
    }

    public void loadFlightTableData() {
        // Code to fetch and display flight table data
    }
    
    
}
