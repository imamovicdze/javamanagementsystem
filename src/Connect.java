import java.sql.*;
import javax.swing.JOptionPane;

public class Connect {
    
    Connection conn = null;
    
    public static Connection getCon() {
        
      /*  try {
            
            Class.forName("java.sql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/management", "root", "");
            
            return conn;
            
        } catch (ClassNotFoundException | SQLException e) {
            
                JOptionPane.showMessageDialog(null, e);
                return null;
                
        }
    } */
      
          
        try {
            
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Admin\\Documents\\NetBeansProjects\\javamanagementsystem\\db\\management.sqlite");
            
            return conn;
            
        } catch (ClassNotFoundException | SQLException e) {
            
            JOptionPane.showMessageDialog(null, e);
            return null;
            
        }
    }   
}
