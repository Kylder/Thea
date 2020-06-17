package Conexion;

import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
	
	public void conectar() {
		
	}
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			DriverManager.getConnection("jdbc:mysql://localhost:3306/db_uni","root","root");
			System.out.println("Conectado");
		} catch (ClassNotFoundException e) {
			System.out.println("Error de Controlador");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Error en la conexion");
			e.printStackTrace();
		}
		
	}
}
