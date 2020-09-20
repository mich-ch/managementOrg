package gr.ots.managementOrg;

import gr.ots.managementOrg.dao.CreateDB;
import gr.ots.managementOrg.dao.CreateTable;
import gr.ots.managementOrg.dao.*;

import java.sql.ResultSet;


public class ApiMain {
    public static void main(String[] args) throws Exception {
        CreateDB.main(args);
        CreateTable.main(args);
        InsertTable.main(args);
        DeleteTable.main(args);
    }
}
