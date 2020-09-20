package gr.ots.managementOrg.dao;

import gr.ots.managementOrg.constants.Constants;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

// Need Changes
public class InsertTable {
    public static void main(String[] args) throws Exception {
        Class.forName(Constants.JDBC_DRIVER);

        Connection conn = DriverManager.getConnection(Constants.DB_URL, Constants.USER, Constants.PASS);
        Statement stmt = conn.createStatement();


        String sql;
        sql= "Use "+Constants.DB_SCHEMA;
        stmt.executeUpdate(sql);


        String query1 = "INSERT INTO Management (name, address, location, description) VALUES ('OTS', 'Christou', 'Sid 26', 'Databases')";
        String query2 = "INSERT INTO Department (name, managmement_id) VALUES ('Sales',1)";
        String query3 = "INSERT INTO SubDepartment (name, department_id) VALUES ('SubSales', 1)";
        String query4 = "INSERT INTO JobInfo (name, roleDescription, numberEmp, management_id) VALUES ('Engineer', 'Software Engineer', 2, 1)";

        stmt.executeUpdate(query1);
        stmt.executeUpdate(query2);
        stmt.executeUpdate(query3);
        stmt.executeUpdate(query4);





//        String queryFormat = "INSERT INTO Player (username, password) VALUES ('Spyros-%s', 'password-%s')";
//        for (int i = 1; i <= 10; i++) {
//            String query = String.format(queryFormat, i, i);
//            stmt.executeUpdate(query);
//        }


        conn.close();
    }
}
