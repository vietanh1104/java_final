/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalproject.Models;

import Shared.Configuration;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Acer
 */
public class DbConnect {
    public static Connection getConnection()throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = null;
        
        if (Configuration.dbtype == "mysql"){
            return connection = DriverManager.getConnection(  
                    "jdbc:mysql://localhost/" + Configuration.dbname,Configuration.user,
                    Configuration.password);
        }
        return DriverManager.getConnection("jdbc:sqlserver://localhost;databasename=QLPT;user=root;password=;encrypt=false");
    }
    public static void closeConnection(Connection connection) {
		if(connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}  
}