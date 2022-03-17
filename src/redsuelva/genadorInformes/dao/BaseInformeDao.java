package redsuelva.genadorInformes.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import redsuelva.genadorInformes.config.ConexionConfig;
import redsuelva.genadorInformes.controllers.CargueArchivosController;
import redsuelva.genadorInformes.pojo.BaseInforme;

public class BaseInformeDao implements ICrud {

    ConexionConfig conexionConfig;

    public BaseInformeDao(ConexionConfig conexionConfig) {
        this.conexionConfig = conexionConfig;
    }

    @Override
    public void save(Object t) {
        BaseInforme baseInforme = (BaseInforme) t;

        //INSERT INTO proyecto_movistar.base_informe (`MES DE ASIGNACION`,`Fecha asig`,`Fecha cierre`,OPERACIÓN,FACTURADOR,ALIADO,`NOMBRE CAMPAÑA`,FOCO,`COD CUENTA`,TIPO_IDENT,NUM_IDENT,`SEGMENTO CUENTA`,`CARTERA  ASIGNADA`,`DIAS MORA  ASIGNADA`,`RANGO DE MORA ASIGNADA`,`PRODUCTOS ASIGNADOS FIJA`,`MEZCLA PRODUCTOS FIJA`,DES_ESTADO,`CICLO DE FACTURACION`,ANTIGUEDAD,RIESGO,FIBRA,CONVERGENTES,CIUDAD,DEPARTAMENTO,REGION,`ESTADO DE RECUPERO`,ACCION,`RESULTADO ACCION`,`CANT LLAMADAS`,`CANT IVR`,`CANT SMS`,`CANT EMAIL`,CONTACTABILIDAD,CIERRE,`CONTINUA CON EL SERVICIO`,`MOTIVO NO PAGO NIVEL 1`,`MOTIVO NO PAGO NIVEL 2`,`MOTIVO NO PAGO NIVEL 2 OPCIONES`,OBSERVACION,`TELEFONO GESTION`,`% DE DESCUENTO DE CARTERA (Cond 100%)`,`VALOR DE DESCUENTO`,`TIPO DE NEGOCIACION`,`ACEPTA BENEFICIO`,`ACEPTA CONDONACION`,`DOWNGRADE MOVIL`,`COD DESCUENTO PLAN`,`DESC CARGOS BASICOS`,`APOYO FIDELIZACION`,EXTRADATOS,`AGENDAMIENTO EQUIPO`,`TIENE SERVICIOS  CON OTRO OPERADOR  SI /NO`,`QUE OPERADOR`,`META PRODUCTOS %`,`META PRODUCTOS Q`,`META RECAUDO  %`,`META RECAUDO  $`,PAGO,`FECHA PAGO`,`PRODUCTOS RECUPERADOS`,`CUENTAS RECUPERADOS`,`VALOR RECUPERADO`,`EFECTIVIDAD PRODUCTOS`,`EFECTVIIDAD CUENTAS`,`EFECTIVIDAD RECAUDO`,`CARTERA  ACTUAL`,`DIAS MORA  ACTUAL`,`RANGO DE MORA ACTUAL`,`GESTION ISLA DE LOCALIZACION`,`FECHA DE ACUERDO DE PAGO`,`CUMPLIMIENTO PROMESA`,`FECHA DE AJUSTE`,`ESTADO DE AJUSTES`)
        //VALUES (NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL)
        String SQL = "INSERT INTO proyecto_movistar.base_informe (`MES DE ASIGNACION`, `Fecha asig`, `Fecha cierre`, `OPERACIÓN`, `FACTURADOR`, `ALIADO`,"
                + " `NOMBRE CAMPAÑA`, `FOCO`, `COD CUENTA`, `TIPO_IDENT`, `NUM_IDENT`, `SEGMENTO CUENTA`, `CARTERA  ASIGNADA`, `DIAS MORA  ASIGNADA`,"
                + " `RANGO DE MORA ASIGNADA`, `PRODUCTOS ASIGNADOS FIJA`, `MEZCLA PRODUCTOS FIJA`, `DES_ESTADO`, `CICLO DE FACTURACION`, `ANTIGUEDAD`,"
                + " `RIESGO`, `FIBRA`, `CONVERGENTES`, `CIUDAD`, `DEPARTAMENTO`, `REGION`, `ESTADO DE RECUPERO`, `ACCION`, `RESULTADO ACCION`,"
                + " `CANT LLAMADAS`, `CANT IVR`, `CANT SMS`, `CANT EMAIL`, `CONTACTABILIDAD`, `CIERRE`, `CONTINUA CON EL SERVICIO`, `MOTIVO NO PAGO NIVEL 1`,"
                + " `MOTIVO NO PAGO NIVEL 2`, `MOTIVO NO PAGO NIVEL 2 OPCIONES`, `OBSERVACION`, `TELEFONO GESTION`, `% DE DESCUENTO DE CARTERA (Cond 100%)`,"
                + " `VALOR DE DESCUENTO`, `TIPO DE NEGOCIACION`, `ACEPTA BENEFICIO`, `ACEPTA CONDONACION`, `DOWNGRADE MOVIL`, `COD DESCUENTO PLAN`,"
                + " `DESC CARGOS BASICOS`, `APOYO FIDELIZACION`, `EXTRADATOS`, `AGENDAMIENTO EQUIPO`, `TIENE SERVICIOS  CON OTRO OPERADOR  SI /NO`,"
                + " `QUE OPERADOR`, `META PRODUCTOS %`, `META PRODUCTOS Q`, `META RECAUDO  %`, `META RECAUDO  $`, `PAGO`, `FECHA PAGO`, `PRODUCTOS RECUPERADOS`,"
                + " `CUENTAS RECUPERADOS`, `VALOR RECUPERADO`, `EFECTIVIDAD PRODUCTOS`, `EFECTVIIDAD CUENTAS`, `EFECTIVIDAD RECAUDO`, `CARTERA  ACTUAL`,"
                + " `DIAS MORA  ACTUAL`, `RANGO DE MORA ACTUAL`, `GESTION ISLA DE LOCALIZACION`, `FECHA DE ACUERDO DE PAGO`, `CUMPLIMIENTO PROMESA`, `FECHA DE AJUSTE`,"
                + " `ESTADO DE AJUSTES`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        long id = 0;

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {

            conn = this.conexionConfig.conectarMySQL();

            pstmt = conn.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);

            pstmt.setString(1, baseInforme.getMes_de_asignacion());

            if (baseInforme.getFecha_asig() != null) {
                pstmt.setDate(2, new java.sql.Date(baseInforme.getFecha_asig().getTime()));
            }else{
             pstmt.setDate(2,null);
            }

            if (baseInforme.getFecha_cierre() != null) {
                pstmt.setDate(3, new java.sql.Date(baseInforme.getFecha_cierre().getTime()));
            }else{
             pstmt.setDate(3,null);
            }

            pstmt.setString(4, baseInforme.getOperacion());
            pstmt.setString(5, baseInforme.getFacturador());
            pstmt.setString(6, baseInforme.getAliado());
            pstmt.setString(7, baseInforme.getNombre_campaña());
            pstmt.setString(8, baseInforme.getFoco());
            pstmt.setString(9, baseInforme.getCod_cuenta());
            pstmt.setString(10, baseInforme.getTipo_ident());
            pstmt.setString(11, baseInforme.getNum_ident());
            pstmt.setString(12, baseInforme.getSegmento_cuenta());
            pstmt.setLong(13, baseInforme.getCartera_asignada());
            pstmt.setInt(14, baseInforme.getDias_mora_asignada());
            pstmt.setInt(15, baseInforme.getRango_de_mora_asignada());
            pstmt.setInt(16, baseInforme.getProductos_asignados_fija());
            pstmt.setString(17, baseInforme.getMezcla_productos_fija());
            pstmt.setString(18, baseInforme.getDes_estado());
            pstmt.setInt(19, baseInforme.getCiclo_de_facturacion());
            pstmt.setString(20, baseInforme.getAntiguedad());
            pstmt.setString(21, baseInforme.getRiesgo());
            pstmt.setString(22, baseInforme.getFibra());
            pstmt.setString(23, baseInforme.getConvergentes());
            pstmt.setString(24, baseInforme.getCiudad());
            pstmt.setString(25, baseInforme.getDepartamento());
            pstmt.setString(26, baseInforme.getRegion());
            pstmt.setString(27, baseInforme.getEstado_de_recupero());
            pstmt.setString(28, baseInforme.getAccion());
            pstmt.setString(29, baseInforme.getResultado_accion());
            pstmt.setInt(30, baseInforme.getCant_llamadas());
            pstmt.setInt(31, baseInforme.getCant_ivr());
            pstmt.setInt(32, baseInforme.getCant_sms());
            pstmt.setInt(33, baseInforme.getCant_email());
            pstmt.setString(34, baseInforme.getContactabilidad());
            pstmt.setString(35, baseInforme.getCierre());
            pstmt.setString(36, baseInforme.getContinua_con_el_servicio());
            pstmt.setString(37, baseInforme.getMotivo_no_pago_nivel_1());
            pstmt.setString(38, baseInforme.getMotivo_no_pago_nivel_2());
            pstmt.setString(39, baseInforme.getMotivo_no_pago_nivel_2_opciones());
            pstmt.setString(40, baseInforme.getObservacion());
            pstmt.setString(41, baseInforme.getTelefono_gestion());
            pstmt.setString(42, baseInforme.getPorc_de_descuento_de_cartera_cond_100());
            pstmt.setInt(43, baseInforme.getValor_de_descuento());
            pstmt.setString(44, baseInforme.getTipo_de_negociacion());
            pstmt.setString(45, baseInforme.getAcepta_beneficio());
            pstmt.setString(46, baseInforme.getAcepta_condonacion());
            pstmt.setString(47, baseInforme.getDowngrade_movil());
            pstmt.setString(48, baseInforme.getCod_descuento_plan());
            pstmt.setString(49, baseInforme.getDesc_cargos_basicos());
            pstmt.setString(50, baseInforme.getApoyo_fidelizacion());
            pstmt.setString(51, baseInforme.getExtradatos());
            pstmt.setString(52, baseInforme.getAgendamiento_equipo());
            pstmt.setString(53, baseInforme.getTiene_servicios_con_otro_operador_si_no());
            pstmt.setString(54, baseInforme.getQue_operador());
            pstmt.setString(55, baseInforme.getMeta_productos_porc());
            pstmt.setString(56, baseInforme.getMeta_productos_q());
            pstmt.setString(57, baseInforme.getMeta_recaudo_porc());
            pstmt.setInt(58, baseInforme.getMeta_recaudo_$());
            pstmt.setInt(59, baseInforme.getPago());

            if (baseInforme.getFecha_pago() != null) {
                pstmt.setDate(60, new java.sql.Date(baseInforme.getFecha_pago().getTime()));
            } else {
                pstmt.setDate(60, null);
            }

            pstmt.setInt(61, baseInforme.getProductos_recuperados());
            pstmt.setInt(62, baseInforme.getCuentas_recuperados());
            pstmt.setInt(63, baseInforme.getValor_recuperado());
            pstmt.setString(64, baseInforme.getEfectividad_productos());
            pstmt.setString(65, baseInforme.getEfectviidad_cuentas());
            pstmt.setString(66, baseInforme.getEfectividad_recaudo());
            pstmt.setInt(67, baseInforme.getCartera_actual());
            pstmt.setInt(68, baseInforme.getDias_mora_actual());
            pstmt.setInt(69, baseInforme.getRango_de_mora_actual());
            pstmt.setString(70, baseInforme.getGestion_isla_de_localizacion());

            if (baseInforme.getFecha_de_acuerdo_de_pago() != null) {
                pstmt.setDate(71, new java.sql.Date(baseInforme.getFecha_de_acuerdo_de_pago().getTime()));
            } else {
                pstmt.setDate(71, null);
            }

            pstmt.setString(72, baseInforme.getCumplimiento_promesa());

            if (baseInforme.getFecha_de_ajuste() != null) {
                pstmt.setDate(73, new java.sql.Date(baseInforme.getFecha_de_ajuste().getTime()));
            } else {
                pstmt.setDate(73, null);
            }

            pstmt.setString(74, baseInforme.getEstado_de_ajustes());

            int affectedRows = pstmt.executeUpdate();
            // check the affected rows 
            if (affectedRows > 0) {

            }
        } catch (SQLException ex) {
            Logger.getLogger(CargueArchivosController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            this.closeAll(conn, pstmt, null);
        }

    }

    @Override
    public void update(Object t) {
        BaseInforme baseInforme = (BaseInforme) t;
            
            String SQL = "UPDATE `base_informe` SET `MES DE ASIGNACION`='?',`Fecha asig`='?',`Fecha cierre`='?',`OPERACIÓN`='?',`FACTURADOR`='?',`ALIADO`='?',"
                    + "`NOMBRE CAMPAÑA`='?',`FOCO`='?',`COD CUENTA`='?',`TIPO_IDENT`='?',`NUM_IDENT`='?',`SEGMENTO CUENTA`='?',`CARTERA  ASIGNADA`='?',"
                    + "`DIAS MORA  ASIGNADA`='?',`RANGO DE MORA ASIGNADA`='?',`PRODUCTOS ASIGNADOS FIJA`='?',`MEZCLA PRODUCTOS FIJA`='?',`DES_ESTADO`='?',"
                    + "`CICLO DE FACTURACION`='?',`ANTIGUEDAD`='?',`RIESGO`='?',`FIBRA`='?',`CONVERGENTES`='?',`CIUDAD`='?',`DEPARTAMENTO`='?',`REGION`='?',"
                    + "`ESTADO DE RECUPERO`='?',`ACCION`='?',`RESULTADO ACCION`='?',`CANT LLAMADAS`='?',`CANT IVR`='?',`CANT SMS`='?',`CANT EMAIL`='?',"
                    + "`CONTACTABILIDAD`='?',`CIERRE`='?',`CONTINUA CON EL SERVICIO`='?',`MOTIVO NO PAGO NIVEL 1`='?',`MOTIVO NO PAGO NIVEL 2`='?',"
                    + "`MOTIVO NO PAGO NIVEL 2 OPCIONES`='?',`OBSERVACION`='?',`TELEFONO GESTION`='?',`% DE DESCUENTO DE CARTERA (Cond 100%)`='?',"
                    + "`VALOR DE DESCUENTO`='?',`TIPO DE NEGOCIACION`='?',`ACEPTA BENEFICIO`='?',`ACEPTA CONDONACION`='?',`DOWNGRADE MOVIL`='?',"
                    + "`COD DESCUENTO PLAN`='?',`DESC CARGOS BASICOS`='?',`APOYO FIDELIZACION`='?',`EXTRADATOS`='?',`AGENDAMIENTO EQUIPO`='?',"
                    + "`TIENE SERVICIOS  CON OTRO OPERADOR  SI /NO`='?',`QUE OPERADOR`='?',`META PRODUCTOS %`='?',`META PRODUCTOS Q`='?',`META RECAUDO  %`='?',"
                    + "`META RECAUDO  $`='?',`PAGO`='?',`FECHA PAGO`='?',`PRODUCTOS RECUPERADOS`='?',`CUENTAS RECUPERADOS`='?',`VALOR RECUPERADO`='?',"
                    + "`EFECTIVIDAD PRODUCTOS`='?',`EFECTVIIDAD CUENTAS`='?',`EFECTIVIDAD RECAUDO`='?',`CARTERA  ACTUAL`='?',`DIAS MORA  ACTUAL`='?',"
                    + "`RANGO DE MORA ACTUAL`='?',`GESTION ISLA DE LOCALIZACION`='?',`FECHA DE ACUERDO DE PAGO`='?',`CUMPLIMIENTO PROMESA`='?',`FECHA DE AJUSTE`='?',"
                    + "`ESTADO DE AJUSTES`='?'";
            
            long id = 0;
            
            Connection conn = null;
            PreparedStatement pstmt = null;   
            
            
        try {
            conn = this.conexionConfig.conectarMySQL();
            
            pstmt = conn.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            
            pstmt.setString(1, baseInforme.getMes_de_asignacion());
            
            if (baseInforme.getFecha_asig() != null) {
                pstmt.setDate(2, new java.sql.Date(baseInforme.getFecha_asig().getTime()));
            }else{
             pstmt.setDate(2,null);
            }
            
            if (baseInforme.getFecha_asig() != null) {
                pstmt.setDate(3, new java.sql.Date(baseInforme.getFecha_cierre().getTime()));
            }else{
             pstmt.setDate(3,null);
            }
            
            pstmt.setString(4, baseInforme.getOperacion());
             pstmt.setString(5, baseInforme.getFacturador());
            pstmt.setString(6, baseInforme.getAliado());
            pstmt.setString(7, baseInforme.getNombre_campaña());
            pstmt.setString(8, baseInforme.getFoco());
            pstmt.setString(9, baseInforme.getCod_cuenta());
            pstmt.setString(10, baseInforme.getTipo_ident());
            pstmt.setString(11, baseInforme.getNum_ident());
            pstmt.setString(12, baseInforme.getSegmento_cuenta());
            pstmt.setLong(13, baseInforme.getCartera_asignada());
            pstmt.setInt(14, baseInforme.getDias_mora_asignada());
            pstmt.setInt(15, baseInforme.getRango_de_mora_asignada());
            pstmt.setInt(16, baseInforme.getProductos_asignados_fija());
            pstmt.setString(17, baseInforme.getMezcla_productos_fija());
            pstmt.setString(18, baseInforme.getDes_estado());
            pstmt.setInt(19, baseInforme.getCiclo_de_facturacion());
            pstmt.setString(20, baseInforme.getAntiguedad());
            pstmt.setString(21, baseInforme.getRiesgo());
            pstmt.setString(22, baseInforme.getFibra());
            pstmt.setString(23, baseInforme.getConvergentes());
            pstmt.setString(24, baseInforme.getCiudad());
            pstmt.setString(25, baseInforme.getDepartamento());
            pstmt.setString(26, baseInforme.getRegion());
            pstmt.setString(27, baseInforme.getEstado_de_recupero());
            pstmt.setString(28, baseInforme.getAccion());
            pstmt.setString(29, baseInforme.getResultado_accion());
            pstmt.setInt(30, baseInforme.getCant_llamadas());
            pstmt.setInt(31, baseInforme.getCant_ivr());
            pstmt.setInt(32, baseInforme.getCant_sms());
            pstmt.setInt(33, baseInforme.getCant_email());
            pstmt.setString(34, baseInforme.getContactabilidad());
            pstmt.setString(35, baseInforme.getCierre());
            pstmt.setString(36, baseInforme.getContinua_con_el_servicio());
            pstmt.setString(37, baseInforme.getMotivo_no_pago_nivel_1());
            pstmt.setString(38, baseInforme.getMotivo_no_pago_nivel_2());
            pstmt.setString(39, baseInforme.getMotivo_no_pago_nivel_2_opciones());
            pstmt.setString(40, baseInforme.getObservacion());
            pstmt.setString(41, baseInforme.getTelefono_gestion());
            pstmt.setString(42, baseInforme.getPorc_de_descuento_de_cartera_cond_100());
            pstmt.setInt(43, baseInforme.getValor_de_descuento());
            pstmt.setString(44, baseInforme.getTipo_de_negociacion());
            pstmt.setString(45, baseInforme.getAcepta_beneficio());
            pstmt.setString(46, baseInforme.getAcepta_condonacion());
            pstmt.setString(47, baseInforme.getDowngrade_movil());
            pstmt.setString(48, baseInforme.getCod_descuento_plan());
            pstmt.setString(49, baseInforme.getDesc_cargos_basicos());
            pstmt.setString(50, baseInforme.getApoyo_fidelizacion());
            pstmt.setString(51, baseInforme.getExtradatos());
            pstmt.setString(52, baseInforme.getAgendamiento_equipo());
            pstmt.setString(53, baseInforme.getTiene_servicios_con_otro_operador_si_no());
            pstmt.setString(54, baseInforme.getQue_operador());
            pstmt.setString(55, baseInforme.getMeta_productos_porc());
            pstmt.setString(56, baseInforme.getMeta_productos_q());
            pstmt.setString(57, baseInforme.getMeta_recaudo_porc());
            pstmt.setInt(58, baseInforme.getMeta_recaudo_$());
            pstmt.setInt(59, baseInforme.getPago());

            if (baseInforme.getFecha_pago() != null) {
                pstmt.setDate(60, new java.sql.Date(baseInforme.getFecha_pago().getTime()));
            } else {
                pstmt.setDate(60, null);
            }

            pstmt.setInt(61, baseInforme.getProductos_recuperados());
            pstmt.setInt(62, baseInforme.getCuentas_recuperados());
            pstmt.setInt(63, baseInforme.getValor_recuperado());
            pstmt.setString(64, baseInforme.getEfectividad_productos());
            pstmt.setString(65, baseInforme.getEfectviidad_cuentas());
            pstmt.setString(66, baseInforme.getEfectividad_recaudo());
            pstmt.setInt(67, baseInforme.getCartera_actual());
            pstmt.setInt(68, baseInforme.getDias_mora_actual());
            pstmt.setInt(69, baseInforme.getRango_de_mora_actual());
            pstmt.setString(70, baseInforme.getGestion_isla_de_localizacion());

            if (baseInforme.getFecha_de_acuerdo_de_pago() != null) {
                pstmt.setDate(71, new java.sql.Date(baseInforme.getFecha_de_acuerdo_de_pago().getTime()));
            } else {
                pstmt.setDate(71, null);
            }

            pstmt.setString(72, baseInforme.getCumplimiento_promesa());

            if (baseInforme.getFecha_de_ajuste() != null) {
                pstmt.setDate(73, new java.sql.Date(baseInforme.getFecha_de_ajuste().getTime()));
            } else {
                pstmt.setDate(73, null);
            }

            pstmt.setString(74, baseInforme.getEstado_de_ajustes());
            
             int affectedRows = pstmt.executeUpdate();
             // check the affected rows 
            if (affectedRows > 0) {
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(BaseInformeDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void find(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void closeAll(Connection con, PreparedStatement pstmt, ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
            if (pstmt != null) {
                pstmt.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(CargueArchivosController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
