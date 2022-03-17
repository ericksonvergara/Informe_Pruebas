
package redsuelva.genadorInformes.business;

import java.util.List;
import redsuelva.genadorInformes.pojo.BaseInforme;


public interface ICargueGeneralBusiness {
    
   public void  cargarArchivoInBD(List<BaseInforme> baseInforme); 

    public void actualizarArchivoInBD(List<BaseInforme> listBaseInforme);
   
   
    
}

           
