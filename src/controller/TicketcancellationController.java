/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import model.TicketcancellationModel;
import view.TiicketcancellationView;

/**
 *
 * @author HP
 */
public class TicketcancellationController {
    private TiicketcancellationView view;
    private TicketcancellationModel model;

    public TicketcancellationController(TiicketcancellationView view) {
        this.view = view;
        this.model = new TicketcancellationModel();
    }

    public void cancelTicket(String ticketId) {
        try {
            model.cancelTicket(ticketId);
            view.showCancellationSuccessMessage();
        } catch (Exception e) {
            view.showErrorMessage(e.getMessage());
        }
    
    }
}
