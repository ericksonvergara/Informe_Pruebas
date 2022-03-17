/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package redsuelva.genadorInformes.business.impl;

import java.util.List;
import redsuelva.genadorInformes.business.IActualizarBusiness;
import redsuelva.genadorInformes.business.ICargueGeneralBusiness;
import redsuelva.genadorInformes.config.ConexionConfig;
import redsuelva.genadorInformes.dao.BaseInformeDao;
import redsuelva.genadorInformes.pojo.BaseInforme;

/**
 *
 * @author erickson.vergara
 */
public class ActualizarBusineesimpl implements IActualizarBusiness{
    
    ConexionConfig conexionConfig;
    
    BaseInformeDao baseInformeDao;
    
    
    public ActualizarBusineesimpl (ConexionConfig conexionConfig){
        this.conexionConfig = conexionConfig;
    }
    
    
    public void actualizaArchivoInBD(List<BaseInforme> lista){
        
        
        for(BaseInforme u : lista){
        baseInformeDao = new BaseInformeDao(this.conexionConfig);
        baseInformeDao.update(u);
        }
    }

    @Override
    public void actualizarArchivoInBD(List<BaseInforme> baseInforme) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
