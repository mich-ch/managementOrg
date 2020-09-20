package gr.ots.managementOrg.dao;

import gr.ots.managementOrg.constants.Constants;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteTable {
    public static void main(String[] args) throws Exception {
        Class.forName(Constants.JDBC_DRIVER);

        Connection conn = DriverManager.getConnection(Constants.DB_URL, Constants.USER, Constants.PASS);
        Statement stmt = conn.createStatement();

        String sql;
        sql= "Use "+Constants.DB_SCHEMA;
        stmt.executeUpdate(sql);


        String deleteQueryDepartment = "DELETE FROM Department WHERE id > 0";
        System.out.println("Deleted " + stmt.executeUpdate(deleteQueryDepartment) + " rows");

        String deleteQueryJobInfo = "DELETE FROM JobInfo WHERE id > 0";
        System.out.println("Deleted " + stmt.executeUpdate(deleteQueryJobInfo) + " rows");

        String deleteQueryManagement = "DELETE FROM Management WHERE id > 0";
        System.out.println("Deleted " + stmt.executeUpdate(deleteQueryManagement) + " rows");

        String deleteQuerySubDepartment = "DELETE FROM SubDepartment WHERE id > 0";
        System.out.println("Deleted " + stmt.executeUpdate(deleteQuerySubDepartment) + " rows");

        conn.close();
    }
}
