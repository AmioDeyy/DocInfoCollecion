package amio;

import javax.swing.*;
import java.sql.*;


public class DB {

    private Connection con;
    private Statement st;

    public DB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/doctorlist", "root", "");
            st = con.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void RegisterInsert(String queryInsert) {


        try {
            st.executeUpdate(queryInsert);
            System.out.println(queryInsert);
            JOptionPane.showMessageDialog(null, "Information Updated Successfully");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Update not Completed!!");
        }
    }
}