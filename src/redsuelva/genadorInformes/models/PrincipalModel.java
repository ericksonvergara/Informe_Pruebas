
package redsuelva.genadorInformes.models;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import redsuelva.genadorInformes.business.ICargueGeneralBusiness;
import redsuelva.genadorInformes.business.impl.CargueGeneralBusinessImpl;
import redsuelva.genadorInformes.config.ConexionConfig;
import redsuelva.genadorInformes.controllers.CargueArchivosController;
import redsuelva.genadorInformes.exceptions.InformeException;
import redsuelva.genadorInformes.util.PropertiesUtil;
import redsuelva.genadorInformes.util.ViewUtil;
import redsuelva.genadorInformes.views.CargueArchivosView;


public class PrincipalModel {
    
    // VIEWS
    CargueArchivosView  cargueArchivosView;
    
    // CONTROLLERS
    CargueArchivosController cargueArchivosController;
    
    //CONEXIONES BD
    ConexionConfig conexionConfig;
    
    // PROPERTIES
    Properties properties;
    
    // BUSINESS
    ICargueGeneralBusiness cargueGeneralBusiness;
    
    
    public void init(){
        
        try {
            properties =  PropertiesUtil.get();
            
        conexionConfig =  new ConexionConfig(properties);
 
        
        cargueGeneralBusiness = new CargueGeneralBusinessImpl(conexionConfig);
        
        cargueArchivosView = new CargueArchivosView();
        cargueArchivosView.setVisible(true);
        cargueArchivosController =  new CargueArchivosController(cargueArchivosView,this.properties ,cargueGeneralBusiness );
            
            
        } catch (InformeException ex) {
            ViewUtil.showBasic(ex.getMsjUser(), "INFORME APP ",ViewUtil.ERROR_MESSAGE );
        }
    }
    
    /*
    Metodo controla cons cambios de las vista por el usuario
    */
    public void changeView(String nameView){
        
    }
    
    
}
