
package redsuelva.genadorInformes.controllers;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import redsuelva.genadorInformes.business.ICargueGeneralBusiness;
import redsuelva.genadorInformes.business.impl.ActualizarBusineesimpl;
import redsuelva.genadorInformes.mapper.BaseInformeMapper;
import redsuelva.genadorInformes.mapper.OutBaseInformeMapper;
import redsuelva.genadorInformes.pojo.BaseInforme;
import redsuelva.genadorInformes.util.ViewUtil;
import redsuelva.genadorInformes.views.CargueArchivosView;


public class CargueArchivosController {

    CargueArchivosView view;
    
    Properties p;
    
   OutBaseInformeMapper outMapper;
    
    
    ICargueGeneralBusiness cargueGeneralBusiness;
    ICargueGeneralBusiness actualizarBusiness;
    
    public CargueArchivosController(CargueArchivosView _view , Properties _p , ICargueGeneralBusiness _cargueGeneralBusiness) {
        this.view = _view;
        this.p = _p;
        this.cargueGeneralBusiness = _cargueGeneralBusiness;
        
        this.view.getCargar_lbl().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {                
                try {
                    cargarArchivoTempora();
                } catch (ParseException ex) {
                    Logger.getLogger(CargueArchivosController.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
            }
        });
        
         this.view.getBtn_cargar().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CargarArchivoInDb();
            }
        });
         
         
         this.view.getUpdatePagos_lbl().addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                try {
                    actualizarArchivoTemporal();
                } catch (ParseException ex) {
                    Logger.getLogger(CargueArchivosController.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
     });
        
    
         this.view.getBtn_UpdatePagos().addMouseListener(new java.awt.event.MouseAdapter() {
             public void mouseClicked(java.awt.event.MouseEvent evt){
                 ActualizarArchivoInBD();
             }
             
             
         });
    }       
    
    private void CargarArchivoInDb(){              
        cargueGeneralBusiness.cargarArchivoInBD(this.outMapper.getListBaseInforme());     
        
    }
    
    private void ActualizarArchivoInBD(){              
        actualizarBusiness.actualizarArchivoInBD(this.outMapper.getListBaseInforme());     
        
    }
    
    
       
    /*
    Cargar los datos del archivo csv en memoria temporal
    */
    private void cargarArchivoTempora() throws ParseException{
        JFileChooser selectorArchivos = new JFileChooser();
        selectorArchivos.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        // indica cual fue la accion de usuario sobre el jfilechooser
        int resultado = selectorArchivos.showSaveDialog(this.view);

        if (resultado != JFileChooser.CANCEL_OPTION) {

            File archivo = selectorArchivos.getSelectedFile();
            
              //TODO: AGREGAR LAS REGLAS DE NEGOCIO PARA VALIDAR EL ARCHIVO
              //1.EL ARCHIVO NO DEBE PESAR MAS DE 2 MB,
              //2. EL NOMBRE DEL ARCHIVO DEBE DE EMPEZAR CON general
            if ((archivo == null) || (archivo.getName().equals(""))) {
             
            } else {
                this.view.getTextFielNameFileGeneral().setText(archivo.getName());
                
                try {
                    
                     this.outMapper =  BaseInformeMapper.mapper(archivo,this.p );
                    
                    ViewUtil.showBasic("Se ha cargado exitosamente el archivo","CARGA DE ARCHIVOS", ViewUtil.INFORMATION_MESSAGE );
                    
                    
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(CargueArchivosController.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
        
        System.out.print("hola desde cargar base de datos temporal");
    }
    
    
    
    private void actualizarArchivoTemporal() throws ParseException{
         JFileChooser selectorArchivos = new JFileChooser();
        selectorArchivos.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        // indica cual fue la accion de usuario sobre el jfilechooser
        int resultado = selectorArchivos.showSaveDialog(this.view);

        if (resultado != JFileChooser.CANCEL_OPTION) {

            File archivo = selectorArchivos.getSelectedFile();
            
              //TODO: AGREGAR LAS REGLAS DE NEGOCIO PARA VALIDAR EL ARCHIVO
              //1.EL ARCHIVO NO DEBE PESAR MAS DE 2 MB,
              //2. EL NOMBRE DEL ARCHIVO DEBE DE EMPEZAR CON general
            if ((archivo == null) || (archivo.getName().equals(""))) {
             
            } else {
                this.view.getTextFileNameUpdatePagos().setText(archivo.getName());
                
                try {
                    
                     this.outMapper =  BaseInformeMapper.mapper(archivo,this.p );
                    
                    ViewUtil.showBasic("Se ha cargado exitosamente el archivo","CARGA DE ARCHIVOS", ViewUtil.INFORMATION_MESSAGE );
                    
                    
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(CargueArchivosController.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
        
        System.out.print("hola desde cargar base de datos temporal");
        
    }
           
}
