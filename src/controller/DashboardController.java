/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.Dashboard;
import view.Login;
import view.ManageFlight;
import view.ManagepassengerView;
import view.TicketbookingView;
import view.TiicketcancellationView;
/**
 *
 * @author HP
 */
   
public class DashboardController {
    private   Dashboard dashboard;
    

    /**
     *
     * @param dashboard
     */
    public DashboardController(Dashboard dashboard) {
        this.dashboard = dashboard;
        this.dashboard.addManageFlight(new ManageFlight());
        this.dashboard.addManagepassengerView(new ManagepassengerView());
        this.dashboard.addTicketbookingView(new TicketbookingView());
        this.dashboard.addTiicketcancellation(new TiicketcancellationView());
    }

    private static class TicketbookingButtonListener {

        public TicketbookingButtonListener() {
        }
    }

    private static class addBackButtonListener extends BackButtonListener {

        public addBackButtonListener() {
        }
    }

    class BackButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Login login = new Login();
            login.setVisible(true);
            dashboard.dispose();
        }
    }

    class ManageFlightButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            ManageFlight manageFlight = new ManageFlight();
            manageFlight.setVisible(true);
            dashboard.dispose();
        }
    }

    class ManagePassengerButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            ManagepassengerView managePassenger = new ManagepassengerView();
            managePassenger.setVisible(true);
            dashboard.dispose();
        }
    }

    class TicketBookingButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            TicketbookingView ticketBooking = new TicketbookingView();
            ticketBooking.setVisible(true);
            dashboard.dispose();
        }
    }

    class TicketCancellationButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            TiicketcancellationView ticketCancellation = new TiicketcancellationView();
            ticketCancellation.setVisible(true);
            dashboard.dispose();
        }
    }
}

    

