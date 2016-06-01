package jrout.tutorial.jdbc;

import java.sql.*;

/**
 * Created by jrout on 5/31/16.
 */
public class JDBCProgram {
    static Connection con = null;
    ResultSet rs = null;
    Statement stmt = null;
    PreparedStatement psmt = null;

    static {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.2.6:1521/XE","HR","HR");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        JDBCProgram program = new JDBCProgram();

//        program.statement("OX9 9ZB");
//        program.prepareStatement(100,"Steven");
        program.insertRowInDBAndRollBack(108,"Tanu");
    }

    public void statement(String postalCode){
        try {

            stmt = con.createStatement();

            rs = stmt.executeQuery("select e.first_name, e.LAST_NAME , d.department_name , l.POSTAL_CODE " +
                    "from EMPLOYEES e " +
                    "join DEPARTMENTS d on d.department_id = e.DEPARTMENT_ID " +
                    "join LOCATIONS l on l.LOCATION_ID = d.LOCATION_ID " +
                    "where l.POSTAL_CODE = '"+postalCode+"'");

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

    public void prepareStatement(int empId , String firstName) {

        try {
            psmt =  con.prepareStatement("select * from employees where employee_id = ? and first_name = ?");
            psmt.setInt(1, empId);
            psmt.setString(2,firstName);

            rs = psmt.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString(2) +" "+ rs.getString(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            if(con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public void addBatch() {
        try {
            con.setAutoCommit(false);
            Statement stmt = con.createStatement();

            String SQL = "INSERT INTO H2KTable " + "VALUES (107, 'Rita')";
            stmt.addBatch(SQL);

            String SQL2 = "INSERT INTO H2KTable " + "VALUES (105, 'Rita')";
            stmt.addBatch(SQL2);

            String SQL3 = "update H2KTable set name ='RAJA' where id = 102";
            stmt.addBatch(SQL3);

            int[] intArray = stmt.executeBatch();
            con.commit();
        } catch (SQLException se) {
            try {
                con.rollback();

            } catch (Exception exp) {
                exp.printStackTrace();
            }
        } finally {
            closeConnections(rs, stmt, con);
        }
    }


    public void insertRowInDBAndRollBack(int id, String name) {
        try {
            con.setAutoCommit(false);

            psmt = con.prepareStatement("insert into H2KTable values(?,?)");

            psmt.setInt(1, id);
            psmt.setString(2, name);

            int intValue = psmt.executeUpdate();

            System.out.println("JDBCProgram.insertRowInDBAndRollBack()"
                    + intValue);

            int i = 4 / 0; // Power went off..

            con.commit();
        } catch (Exception exp) {
            exp.printStackTrace();
            try {
                con.rollback();
            } catch (Exception exp1) {
                exp1.printStackTrace();
            }
        } finally {
            closeConnections(rs, stmt, con);
        }
    }

    public void insertRowInDB(int id, String name) {
        try {
            psmt = con.prepareStatement("insert into myExcel values(?,?)");
            psmt.setInt(1, id);
            psmt.setString(2, name);
            int intValue = 0;
            intValue = psmt.executeUpdate();
        } catch (SQLException exp) {
            exp.printStackTrace();
        } finally {
            closeConnections(rs, stmt, con);
        }
    }
    /**
     * API to close all open connections.
     */
    private void closeConnections(ResultSet rs, Statement stmt, Connection con) {
        try {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (Exception exp) {
            exp.printStackTrace();
        }
    }

}
