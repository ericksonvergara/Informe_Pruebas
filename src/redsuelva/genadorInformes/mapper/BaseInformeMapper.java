package redsuelva.genadorInformes.mapper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.Properties;
import redsuelva.genadorInformes.enums.PropertiesEnum;

import redsuelva.genadorInformes.pojo.BaseInforme;
import redsuelva.genadorInformes.util.DateUtils;
import redsuelva.genadorInformes.validations.BaseInformeValidation;

public class BaseInformeMapper {
       
    

    public static OutBaseInformeMapper mapper(File file ,Properties p ) throws FileNotFoundException, ParseException {

        List<BaseInforme> listBaseInforme =  new ArrayList<BaseInforme>();
        
        HashMap<Long,String> listResult =  new HashMap<>();
        
        
        
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         
         fr = new FileReader (file);
         br = new BufferedReader(fr);

         // Lectura del fichero
         String linea;
         
         Long numLinea = 0L;
         
         boolean isFirtsLine = false;
         while((linea=br.readLine())!=null){
             
             if( isFirtsLine== false){
                 isFirtsLine = true;
                 continue;
             }
             
             BaseInforme baseInforme = new BaseInforme();
             
             linea = linea.replaceAll("\n", "");
             
              String [] values = linea.split(p.getProperty(PropertiesEnum.caracterSeparador.name()));
              
              if( values.length != 74){
                  listResult.put(numLinea,"Linea con numero de columnas invalido #columnas : "+values.length );
                  continue;
              }
              
              //MES DE ASIGNACION
              baseInforme.setMes_de_asignacion(values[0]);
              
              //Fecha asig
              if( BaseInformeValidation.isvalidDateFormate(values[1] , DateUtils.formaterBasic ) ){
                  baseInforme.setFecha_asig(DateUtils.convert(values[1],DateUtils.formaterBasic)  );
              }
              
              //Fecha cierre
              if( BaseInformeValidation.isvalidDateFormate(values[2] , DateUtils.formaterBasic ) ){
                  baseInforme.setFecha_cierre(DateUtils.convert(values[2],DateUtils.formaterBasic)  );
              }
              
              baseInforme.setOperacion(values[3]);
              baseInforme.setFacturador(values[4]);
              baseInforme.setAliado(values[5]);
              baseInforme.setNombre_campaña(values[6]);
              baseInforme.setFoco(values[7]);
              baseInforme.setCod_cuenta(values[8]);
              baseInforme.setTipo_ident(values[9]);
              baseInforme.setNum_ident(values[10]);
              baseInforme.setSegmento_cuenta(values[11]);
              baseInforme.setCartera_asignada(Long.parseLong(values[12])); //*
              baseInforme.setDias_mora_asignada(Integer.parseInt(values[13]));
              baseInforme.setRango_de_mora_asignada(Integer.parseInt(values[14]));
              
               if( values[14] != null &&  !values[14].isEmpty())
              baseInforme.setProductos_asignados_fija( Integer.parseInt(values[14])  );
              
              baseInforme.setMezcla_productos_fija(values[16]);
              baseInforme.setDes_estado(values[17]);
              
              if( values[18] != null &&  !values[18].isEmpty())
              baseInforme.setCiclo_de_facturacion(Integer.parseInt(values[18]));
              
              baseInforme.setAntiguedad(values[19]);
              baseInforme.setRiesgo(values[20]);
              baseInforme.setFibra(values[21]);
              baseInforme.setConvergentes(values[22]);
              baseInforme.setCiudad(values[23]);
              baseInforme.setDepartamento(values[24]);
              baseInforme.setRegion(values[25]);
              baseInforme.setEstado_de_recupero(values[26]);
              
              baseInforme.setAccion(values[27]);
              
              baseInforme.setResultado_accion(values[28]);
              
                if( values[29] != null &&  !values[29].isEmpty())
              baseInforme.setCant_llamadas(Integer.parseInt(values[29]));
              
              if( values[30] != null &&  !values[30].isEmpty())
              baseInforme.setCant_ivr(Integer.parseInt(values[30]));
              
              if( values[31] != null &&  !values[31].isEmpty())
              baseInforme.setCant_sms(Integer.parseInt(values[31]));
              
              if( values[32] != null &&  !values[32].isEmpty())
              baseInforme.setCant_email(Integer.parseInt(values[32]));
              
              
              baseInforme.setContactabilidad(values[33]);
              baseInforme.setCierre(values[34]);
              baseInforme.setContinua_con_el_servicio(values[35]);
              baseInforme.setMotivo_no_pago_nivel_1(values[36]);
              baseInforme.setMotivo_no_pago_nivel_2(values[37]);
              baseInforme.setMotivo_no_pago_nivel_2_opciones(values[38]);
              baseInforme.setObservacion(values[39]);
              baseInforme.setTelefono_gestion(values[40]);
              baseInforme.setPorc_de_descuento_de_cartera_cond_100(values[41]);
              
              if( values[42] != null &&  !values[42].isEmpty())
              baseInforme.setValor_de_descuento(Integer.parseInt(values[42]));
              
              baseInforme.setTipo_de_negociacion(values[43]);
              baseInforme.setAcepta_beneficio(values[44]);
              baseInforme.setAcepta_condonacion(values[45]);
              baseInforme.setDowngrade_movil(values[46]);
              baseInforme.setCod_descuento_plan(values[47]);
              baseInforme.setDesc_cargos_basicos(values[48]);
              baseInforme.setApoyo_fidelizacion(values[49]);
              baseInforme.setExtradatos(values[50]);
              baseInforme.setAgendamiento_equipo(values[51]);
              baseInforme.setTiene_servicios_con_otro_operador_si_no(values[52]);
              baseInforme.setQue_operador(values[53]);
              baseInforme.setMeta_productos_porc(values[54]);
              baseInforme.setMeta_productos_q(values[55]);
              baseInforme.setMeta_recaudo_porc(values[56]);
              
              if( values[57] != null &&  !values[57].isEmpty())
              baseInforme.setMeta_recaudo_$(Integer.parseInt(values[57]));
              
              if( values[58] != null &&  !values[58].isEmpty())
              baseInforme.setPago(Integer.parseInt(values[58]));
              
              //FECHA PAGO
              if( BaseInformeValidation.isvalidDateFormate(values[59] , DateUtils.formaterBasic ) ){
                  baseInforme.setFecha_pago(DateUtils.convert(values[59], DateUtils.formaterBasic));
              }
              
              if( values[60] != null &&  !values[60].isEmpty())
              baseInforme.setProductos_recuperados(Integer.parseInt(values[60]));
              if( values[61] != null &&  !values[61].isEmpty())
              baseInforme.setCuentas_recuperados(Integer.parseInt(values[61]));
              if( values[62] != null &&  !values[62].isEmpty())
              baseInforme.setValor_recuperado(Integer.parseInt(values[62]));
              
              baseInforme.setEfectividad_productos(values[63]);
              baseInforme.setEfectviidad_cuentas(values[64]);
              baseInforme.setEfectividad_recaudo(values[65]);
              
              if( values[66] != null &&  !values[66].isEmpty())
              baseInforme.setCartera_actual(Integer.parseInt(values[66]));
              
              if( values[67] != null &&  !values[67].isEmpty())
              baseInforme.setDias_mora_actual(Integer.parseInt(values[67]));
              
              
              if( values[68] != null &&  !values[68].isEmpty())
              baseInforme.setRango_de_mora_actual(Integer.parseInt(values[68]));
              
              baseInforme.setGestion_isla_de_localizacion(values[69]);
              
              //FECHA DE ACUERDO DE PAGO
              if( BaseInformeValidation.isvalidDateFormate(values[70] , DateUtils.formaterBasic ) ){
                  baseInforme.setFecha_de_acuerdo_de_pago(DateUtils.convert(values[70], DateUtils.formaterBasic));
              }
              
              baseInforme.setCumplimiento_promesa(values[71]);
              
              //FECHA DE AJUSTES
              if( BaseInformeValidation.isvalidDateFormate(values[72] , DateUtils.formaterBasic ) ){
                  baseInforme.setFecha_de_ajuste(DateUtils.convert(values[72], DateUtils.formaterBasic));
              }
              
              
              baseInforme.setEstado_de_ajustes(values[73]);
                        
              listBaseInforme.add(baseInforme);
            
              
              numLinea++;
         }
           
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
     
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
   
      OutBaseInformeMapper out = new OutBaseInformeMapper();
      out.setListBaseInforme(listBaseInforme);
      out.setListResult(listResult);
        
        return out;

    }


}
