package servicii;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import obiecte.Capitol;
import obiecte.ContinutCapitol;
import obiecte.Intrebare;

public class DataBaseConnection {

	private Connection connect = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;

	public void connectToDataBase() throws Exception {
		try {
			// this will load the MySQL driver, each DB has its own driver
			Class.forName("com.mysql.jdbc.Driver");
			// setup the connection with the DB.
			connect = DriverManager.getConnection("jdbc:mysql://localhost/manualinteractiv?"+ "user=root&password=password");
		}
		finally {}
	}

	public ArrayList<Capitol> getCapitole() {
		// statements allow to issue SQL queries to the database
		try {
			statement = connect.createStatement();
			// resultSet gets the result of the SQL query
			resultSet = statement.executeQuery("select * from manualinteractiv.capitole");
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		ResultSet result = resultSet;
		ArrayList<Capitol> capitole = new ArrayList<Capitol>();
		try {
			while (result.next()) {
				int id = result.getInt("id");
				String numeCapitol = result.getString("numecapitol");

				Capitol capitol = new Capitol(id, numeCapitol);
				capitole.add(capitol);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return capitole;	
	}
	
	public ArrayList<ContinutCapitol> getContinutCapitole() {
		// statements allow to issue SQL queries to the database
		try {
			statement = connect.createStatement();
			// resultSet gets the result of the SQL query
			resultSet = statement.executeQuery("select * from manualinteractiv.continutcapitol");
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		ResultSet result = resultSet;
		ArrayList<ContinutCapitol> continutCapitole = new ArrayList<ContinutCapitol>();
		try {
			while (result.next()) {
				int id = result.getInt("id");
				int idCapitol = result.getInt("idcapitol");
				String numeCapitol = result.getString("numecapitol");

				ContinutCapitol continutCapitol = new ContinutCapitol(id, idCapitol, numeCapitol);
				continutCapitole.add(continutCapitol);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return continutCapitole;	
	}
	
	public ArrayList<Intrebare> getIntrebari() {
		// statements allow to issue SQL queries to the database
		try {
			statement = connect.createStatement();
			// resultSet gets the result of the SQL query
			resultSet = statement.executeQuery("select * from manualinteractiv.intrebari");
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		ResultSet result = resultSet;
		ArrayList<Intrebare> intrebari = new ArrayList<Intrebare>();
		try {
			while (result.next()) {
				int id = result.getInt("id");
				int idCapitol = result.getInt("idcapitol");
				String textIntrebare = result.getString("intrebare");

				Intrebare intrebare = new Intrebare(id, idCapitol, textIntrebare);
				intrebari.add(intrebare);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return intrebari;	
	}
}