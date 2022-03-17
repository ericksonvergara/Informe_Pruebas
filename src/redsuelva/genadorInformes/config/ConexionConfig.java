/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package redsuelva.genadorInformes.config;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import redsuelva.genadorInformes.enums.PropertiesEnum;


public class ConexionConfig {
    
 
    //
    
   private Properties p;
    
    public ConexionConfig(Properties _p) {
        p = _p;
    }

    public Connection conectarMySQL() {
        Connection con = null;
        String url = 
                this.p.getProperty(PropertiesEnum.driverConexion.name()) + 
                this.p.getProperty(PropertiesEnum.hostname.name()) + ":" + this.p.getProperty(PropertiesEnum.port.name())    +"/"+
                this.p.getProperty(PropertiesEnum.database.name())       +
                "?useSSL="  +
                this.p.getProperty(PropertiesEnum.useSSL.name());
         
        
        try {
            Class.forName(this.p.getProperty(PropertiesEnum.driver.name()));
            con = (Connection) DriverManager.getConnection(url,
                    this.p.getProperty(PropertiesEnum.username.name()),
                    this.p.getProperty(PropertiesEnum.password.name()));
            
            
   
            
        } catch(ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        
        return con;
    }
    
}
