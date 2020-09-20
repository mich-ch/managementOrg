package gr.ots.managementOrg.dao;

import gr.ots.managementOrg.constants.Constants;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) throws Exception {
        Class.forName(Constants.JDBC_DRIVER);

        Connection conn = DriverManager.getConnection(Constants.DB_URL, Constants.USER, Constants.PASS);
        Statement stmt = conn.createStatement();

        String sql;
        sql = "Use " + Constants.DB_SCHEMA;
        stmt.executeUpdate(sql);

        // Department Table
        sql = "DROP TABLE IF EXISTS Management";
        stmt.executeUpdate(sql);
        sql = "create table Management (" +
                "id int PRIMARY KEY IDENTITY(1,1) , " +
                "name nVARCHAR(255), " +
                "address nVARCHAR(255), " +
                "description nVARCHAR(255), " +
                "location nVARCHAR(255) )";
        stmt.executeUpdate(sql);

        // Department Table
        sql = "DROP TABLE IF EXISTS Department";
        stmt.executeUpdate(sql);
        sql = "create table Department (" +
                "id int PRIMARY KEY IDENTITY(1,1) , " +
                "name nVARCHAR(255), " +
                "managmement_id int, " +
                "foreign key (managmement_id) references Management(id) )";
        stmt.executeUpdate(sql);

        // SubDepartment Table
        sql = "DROP TABLE IF EXISTS SubDepartment";
        stmt.executeUpdate(sql);
        sql = "create table SubDepartment (" +
                "id int PRIMARY KEY IDENTITY(1,1) , " +
                "name nVARCHAR(255), " +
                "department_id int, " +
                "foreign key (department_id) references Department(id) )";
        stmt.executeUpdate(sql);

        // JobInfo Table
        sql = "DROP TABLE IF EXISTS JobInfo";
        stmt.executeUpdate(sql);
        sql = "create table JobInfo (" +
                "id int PRIMARY KEY IDENTITY(1,1) , " +
                "name nVARCHAR(255), " +
                "roleDescription nVARCHAR(255), " +
                "numberEmp int, " +
                "subdepartment_id int, " +
                "department_id int, " +
                "management_id int, " +
                "foreign key (subdepartment_id) references SubDepartment(id), " +
                "foreign key (department_id) references Department(id), " +
                "foreign key (management_id) references Management(id) )";



        stmt.executeUpdate(sql);

        conn.close();
    }
}
