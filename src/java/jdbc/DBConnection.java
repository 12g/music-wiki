/*
 * Copyright (C) 2017 benjamin
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author benjamin
 */
public class DBConnection {
    private static Connection conexion;
    private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URI = "jdbc:mysql://localhost/DEJ_Music";
    private static final String DB_USER = "root"; //cambiar si es necesario
    private static final String DB_PASS = ""; //cambiar si es necesario
       
    /** 
     * Obtiene (o crea) la instancia existente del objeto de conexión a BD. 
     * Este método puede ser usado en cualquier lugar de la aplicación donde sea 
     * visible (esto es, que tenga el import requerido).
     * @return El objeto Connection genérico usado como conexión a la BD.
     * @throws SQLException Si hay errores de conexión a la BD.
     */
    public static Connection getInstance() throws SQLException, ClassNotFoundException {
        if (conexion == null || conexion.isClosed()){
            conexion = getConexion();
        }
        return conexion;
    }
    
    private static Connection getConexion() throws SQLException, ClassNotFoundException {
        try {
            Class.forName(DB_DRIVER);
            return DriverManager.getConnection(DB_URI, DB_USER, DB_PASS);
        
        } catch (SQLException ex) {            
            throw new SQLException(ex);
        } catch (ClassNotFoundException ex) {            
            throw ex;
        }
        
    }
}
