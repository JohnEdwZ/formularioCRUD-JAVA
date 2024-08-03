package Modelo;

import java.sql.*;

public class PersonModel {
    private Connection connection;

    public PersonModel() {
        // Establecer conexión con la base de datos MySQL
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/nombre_basedatos", "usuario", "contraseña");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addPerson(String firstName, String lastName) {
        try {
            String query = "INSERT INTO personas (nombre, apellido) VALUES (?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, firstName);
            statement.setString(2, lastName);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Implementar métodos para CRUD (eliminar, actualizar, listar, etc.)
}

