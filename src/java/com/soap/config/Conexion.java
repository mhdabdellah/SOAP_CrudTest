package com.soap.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    Connection conectar = null;

    // Librería de MySQL
    public String driver = "com.mysql.jdbc.Driver";
    // Nombre de la base de datos
    public String database = "BDSOAP";
    // Host
    public String hostname = "localhost";
    // Puerto
    public String port = "3306";
    // Ruta de nuestra base de datos
    public String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database;
    // Nombre de usuario
    public String username = "root";
    // Clave de usuario
    public String password = "";

    public Connection conectar() {
        try {
            Class.forName(driver);
            conectar = DriverManager.getConnection(url, username, password);
            System.out.println("CONECTADO");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al conectar: " + e.getMessage());
        }

        return conectar;
    }    
}