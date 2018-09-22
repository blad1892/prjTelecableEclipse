package repositorio;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
public class ConexionDB {
	
	private static Connection conexion=null;
	private static String db = "telecableDb"; // Nombre de BD.
	private static String usuario = "root"; // Usuario de BD.
	private static String contracena = ""; // Password de BD.
	private static String driver = "com.mysql.jdbc.Driver";
	private static String server = "jdbc:mysql://localhost/" + db;


public void MySQLConnection(String user, String pass, String db_name) throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + db_name, user, pass);
            JOptionPane.showMessageDialog(null, "Se ha iniciado la conexión con el servidor de forma exitosa");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }



public static void conectar() {
	try {
		Class.forName(driver);
		conexion = DriverManager.getConnection(server, usuario, contracena);
	} catch (Exception e) {
        String error=(String) JOptionPane.showInputDialog("Error al conectar", null);
		e.printStackTrace();
	}
}

private static void cerrar(Statement st) {
	if (st != null) {
		try {
			st.close();
		} catch (Exception e) {
			String error = (String) JOptionPane.showInputDialog("Error: no poisible serrar la conexion");
		}
	}

}
private static Statement conexion() {
	Statement st = null;
	try {
		st = (Statement) conexion.createStatement();
	} catch (SQLException e) {
	     String error=(String) JOptionPane.showInputDialog("Error: Conexión incorrecta.");
		e.printStackTrace();
	}
	return st;
}
}

