package webanime.controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class DBConnection {
    private final String serverName = "DESKTOP-EF4NTR8";      
    private final String dbName     = "LaptrinhWeb";
    private final String portNumber = "1433";
    private final String instance   = "";               
    private final String userID     = "sa";
    private final String password   = "Tam3072005@";

    public Connection getConnection() throws Exception {
        String server = (instance == null || instance.trim().isEmpty())
                ? (serverName + ":" + portNumber)
                : (serverName + "\\" + instance);

        String url = "jdbc:sqlserver://" + server
                   + ";databaseName=" + dbName
                   + ";encrypt=true;trustServerCertificate=true"
                   + ";loginTimeout=10";

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url, userID, password);
    }

 
}
