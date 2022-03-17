/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package redsuelva.genadorInformes.business;

import java.util.List;
import redsuelva.genadorInformes.pojo.BaseInforme;

/**
 *
 * @author erickson.vergara
 */
public interface IActualizarBusiness {
    
    public void  actualizarArchivoInBD(List<BaseInforme> baseInforme);
    
}
