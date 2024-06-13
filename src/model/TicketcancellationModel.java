/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author HP
 */
public class TicketcancellationModel {
    public void cancelTicket(String ticketId) throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/studentdb", "root", "");
            String sql = "DELETE FROM `ticketbooking` WHERE id=?";
            PreparedStatement ptst = con.prepareStatement(sql);
            ptst.setString(1, ticketId);
            ptst.executeUpdate();
            con.close();
        } catch (Exception e) {
            throw e;
        }
    }
    
    
}
