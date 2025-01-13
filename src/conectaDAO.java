import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conectaDAO {
    public Connection connectDB() {
        Connection conn = null;

        try {
            String url = "jdbc:mysql://127.0.0.1:3306/sistemaleiloes";
            String user = "root";
            String password = "shepherdcom12";
            
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ConectaDAO: " + erro.getMessage());
        }
        
        return conn;
    }
}
