package jrout.tutorial.jdbc.maven;

import java.sql.*;

/**
 * Created by jrout on 5/31/16.
 */
public class JDBCProgramMaven {
    public static void main(String[] args) {

        Connection con = null;
        ResultSet rs = null;
        Statement stmt = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.2.6:1521/XE","HR","HR");
            stmt = con.createStatement();

            rs = stmt.executeQuery("select e.first_name, e.LAST_NAME , d.department_name , l.POSTAL_CODE " +
                    "from EMPLOYEES e " +
                    "join DEPARTMENTS d on d.department_id = e.DEPARTMENT_ID " +
                    "join LOCATIONS l on l.LOCATION_ID = d.LOCATION_ID " +
                    "where l.POSTAL_CODE = 'OX9 9ZB'");

            while(rs.next()){
                System.out.println(rs.getString("first_name") + "\t"+ rs.getString(2) +"\t" + rs.getString(3) +"\t" + rs.getString(4));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(con != null){
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
