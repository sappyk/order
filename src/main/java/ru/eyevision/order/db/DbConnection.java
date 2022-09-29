package ru.eyevision.order.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    /**
     * PostgreSQL db connection
     * @return Connection to db
     */

    //  Database credentials
    static final String DB_URL = "jdbc:postgresql://localhost:5432/orders";
    static final String USER = "postgres";
    static final String PASS = "postgres";

    public static Connection connectPostgreSQL() throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        return DriverManager.getConnection(DB_URL,USER,PASS);
    }
}