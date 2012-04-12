package org.onestepback;

import org.onestepback.FauxPreparedStatement;

public class Client {
    public static void main(String[] arg) {
        try {
            java.sql.PreparedStatement ps = new FauxPreparedStatement();
            ps.setInt(1, 123);
            java.sql.ResultSet result = ps.executeQuery();
            if (result == null) {
                System.out.println("Result is null");
            } else {
                System.out.println("Result: " + result.toString());
            }
        }
        catch(java.sql.SQLException ex) {
            System.out.println("Exception");
        }
    }
}
