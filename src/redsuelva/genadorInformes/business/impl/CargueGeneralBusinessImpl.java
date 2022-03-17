
package redsuelva.genadorInformes.business.impl;

import java.util.List;
import redsuelva.genadorInformes.business.ICargueGeneralBusiness;
import redsuelva.genadorInformes.config.ConexionConfig;
import redsuelva.genadorInformes.dao.BaseInformeDao;
import redsuelva.genadorInformes.pojo.BaseInforme;


public class CargueGeneralBusinessImpl  implements ICargueGeneralBusiness{

    ConexionConfig conexionConfig;
    
    BaseInformeDao baseInformeDao;

    public CargueGeneralBusinessImpl(ConexionConfig conexionConfig) {
        this.conexionConfig = conexionConfig;
    }
    
    
    
    /*
    Se encarga de cargar la informacion a la base de datos
    validaciones de logica de negocios
    1. Se debe validar que la ciudad y el departamentos exsitan
    */
    public void cargarArchivoInBD(List<BaseInforme> lista) {
       
        
        
        for ( BaseInforme b :lista ){
         baseInformeDao = new BaseInformeDao(this.conexionConfig);
        baseInformeDao.save(b);
        }

        
    }
    
    /*
    
    }
    */

    @Override
    public void actualizarArchivoInBD(List<BaseInforme> lista2) {
        
        
        for(BaseInforme u : lista2){
        baseInformeDao = new BaseInformeDao(this.conexionConfig);
        baseInformeDao.update(u);
        }
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
