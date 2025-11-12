package db;
import java.sql.*;

public class DB {

    public static Connection getConnection() throws Exception{
        String driver = "com.mysql.cj.jdbc.Driver";
        Class.forName(driver);

        String user = "root";
        String senha = "1234";
        String urlBanco = "jdbc:mysql://localhost:3306/sistemabancario";

        return DriverManager.getConnection(urlBanco, user, senha);
    }

    public static void closeConnection(Connection conn) throws Exception{
        conn.close();
    }

    public static void closeConnection(Connection conn, Statement st) throws Exception{
        conn.close();
        st.close();
    }

    public static void closeConnection(Connection conn, Statement st, ResultSet rs) throws Exception{
        conn.close();
        st.close();
        rs.close();
    }
}