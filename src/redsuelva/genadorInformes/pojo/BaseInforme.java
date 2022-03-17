
package redsuelva.genadorInformes.pojo;


import java.util.Date;

public class BaseInforme {
    String mes_de_asignacion;	
    private java.util.Date fecha_asig;
    private java.util.Date fecha_cierre;
    String operacion;
    String facturador;
    String aliado;
    String nombre_campaña;
    String foco;
    String cod_cuenta;
    String tipo_ident;	
    String num_ident;
    String segmento_cuenta;
    long cartera_asignada;
    int dias_mora_asignada;
    int rango_de_mora_asignada;
    int productos_asignados_fija;
    String mezcla_productos_fija;
    String des_estado;
    int ciclo_de_facturacion;
    String antiguedad;
    String riesgo;
    String fibra;
    String convergentes;
    String ciudad;
    String departamento;
    String region;
    String estado_de_recupero;
    String accion;
    String resultado_accion;
    int cant_llamadas;
    int cant_ivr;
    int cant_sms;
    int cant_email;
    String contactabilidad;
    String cierre;
    String continua_con_el_servicio;
    String motivo_no_pago_nivel_1;
    String motivo_no_pago_nivel_2;
    String motivo_no_pago_nivel_2_opciones;
    String observacion;
    String telefono_gestion;
    String porc_de_descuento_de_cartera_cond_100;
    int valor_de_descuento;
    String tipo_de_negociacion;
    String acepta_beneficio;
    String acepta_condonacion;
    String downgrade_movil;
    String cod_descuento_plan;
    String desc_cargos_basicos;
    String apoyo_fidelizacion;
    String extradatos;
    String agendamiento_equipo;
    String tiene_servicios_con_otro_operador_si_no;
    String que_operador;
    String meta_productos_porc;
    String meta_productos_q;
    String meta_recaudo_porc;
    int meta_recaudo_$;
    int pago;
    private java.util.Date fecha_pago;
    int productos_recuperados;
    int cuentas_recuperados;
    int valor_recuperado;
    String efectividad_productos;
    String efectviidad_cuentas;
    String efectividad_recaudo;
    int cartera_actual;
    int dias_mora_actual;
    int rango_de_mora_actual;
    String gestion_isla_de_localizacion;
    private java.util.Date fecha_de_acuerdo_de_pago;
    String cumplimiento_promesa;
    private java.util.Date fecha_de_ajuste;
    String estado_de_ajustes;

    public void setMes_de_asignacion(String mes_de_asignacion) {
        this.mes_de_asignacion = mes_de_asignacion;
    }

    public void setFecha_asig(Date fecha_asig) {
        this.fecha_asig = fecha_asig;
    }

    public void setFecha_cierre(Date fecha_cierre) {
        this.fecha_cierre = fecha_cierre;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public void setFacturador(String facturador) {
        this.facturador = facturador;
    }

    public void setAliado(String aliado) {
        this.aliado = aliado;
    }

    public void setNombre_campaña(String nombre_campaña) {
        this.nombre_campaña = nombre_campaña;
    }

    public void setFoco(String foco) {
        this.foco = foco;
    }

    public void setCod_cuenta(String cod_cuenta) {
        this.cod_cuenta = cod_cuenta;
    }

    public void setTipo_ident(String tipo_ident) {
        this.tipo_ident = tipo_ident;
    }

    public void setNum_ident(String num_ident) {
        this.num_ident = num_ident;
    }

    public void setSegmento_cuenta(String segmento_cuenta) {
        this.segmento_cuenta = segmento_cuenta;
    }

    public void setCartera_asignada(long cartera_asignada) {
        this.cartera_asignada = cartera_asignada;
    }

    public void setDias_mora_asignada(int dias_mora_asignada) {
        this.dias_mora_asignada = dias_mora_asignada;
    }

    public void setRango_de_mora_asignada(int rango_de_mora_asignada) {
        this.rango_de_mora_asignada = rango_de_mora_asignada;
    }

    public void setProductos_asignados_fija(int productos_asignados_fija) {
        this.productos_asignados_fija = productos_asignados_fija;
    }

    public void setMezcla_productos_fija(String mezcla_productos_fija) {
        this.mezcla_productos_fija = mezcla_productos_fija;
    }

    public void setDes_estado(String des_estado) {
        this.des_estado = des_estado;
    }

    public void setCiclo_de_facturacion(int ciclo_de_facturacion) {
        this.ciclo_de_facturacion = ciclo_de_facturacion;
    }

    public void setAntiguedad(String antiguedad) {
        this.antiguedad = antiguedad;
    }

    public void setRiesgo(String riesgo) {
        this.riesgo = riesgo;
    }

    public void setFibra(String fibra) {
        this.fibra = fibra;
    }

    public void setConvergentes(String convergentes) {
        this.convergentes = convergentes;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setEstado_de_recupero(String estado_de_recupero) {
        this.estado_de_recupero = estado_de_recupero;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public void setResultado_accion(String resultado_accion) {
        this.resultado_accion = resultado_accion;
    }

    public void setCant_llamadas(int cant_llamadas) {
        this.cant_llamadas = cant_llamadas;
    }

    public void setCant_ivr(int cant_ivr) {
        this.cant_ivr = cant_ivr;
    }

    public void setCant_sms(int cant_sms) {
        this.cant_sms = cant_sms;
    }

    public void setCant_email(int cant_email) {
        this.cant_email = cant_email;
    }

    public void setContactabilidad(String contactabilidad) {
        this.contactabilidad = contactabilidad;
    }

    public void setCierre(String cierre) {
        this.cierre = cierre;
    }

    public void setContinua_con_el_servicio(String continua_con_el_servicio) {
        this.continua_con_el_servicio = continua_con_el_servicio;
    }

    public void setMotivo_no_pago_nivel_1(String motivo_no_pago_nivel_1) {
        this.motivo_no_pago_nivel_1 = motivo_no_pago_nivel_1;
    }

    public void setMotivo_no_pago_nivel_2(String motivo_no_pago_nivel_2) {
        this.motivo_no_pago_nivel_2 = motivo_no_pago_nivel_2;
    }

    public void setMotivo_no_pago_nivel_2_opciones(String motivo_no_pago_nivel_2_opciones) {
        this.motivo_no_pago_nivel_2_opciones = motivo_no_pago_nivel_2_opciones;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public void setTelefono_gestion(String telefono_gestion) {
        this.telefono_gestion = telefono_gestion;
    }

    public void setPorc_de_descuento_de_cartera_cond_100(String porc_de_descuento_de_cartera_cond_100) {
        this.porc_de_descuento_de_cartera_cond_100 = porc_de_descuento_de_cartera_cond_100;
    }

    public void setValor_de_descuento(int valor_de_descuento) {
        this.valor_de_descuento = valor_de_descuento;
    }

    public void setTipo_de_negociacion(String tipo_de_negociacion) {
        this.tipo_de_negociacion = tipo_de_negociacion;
    }

    public void setAcepta_beneficio(String acepta_beneficio) {
        this.acepta_beneficio = acepta_beneficio;
    }

    public void setAcepta_condonacion(String acepta_condonacion) {
        this.acepta_condonacion = acepta_condonacion;
    }

    public void setDowngrade_movil(String downgrade_movil) {
        this.downgrade_movil = downgrade_movil;
    }

    public void setCod_descuento_plan(String cod_descuento_plan) {
        this.cod_descuento_plan = cod_descuento_plan;
    }

    public void setDesc_cargos_basicos(String desc_cargos_basicos) {
        this.desc_cargos_basicos = desc_cargos_basicos;
    }

    public void setApoyo_fidelizacion(String apoyo_fidelizacion) {
        this.apoyo_fidelizacion = apoyo_fidelizacion;
    }

    public void setExtradatos(String extradatos) {
        this.extradatos = extradatos;
    }

    public void setAgendamiento_equipo(String agendamiento_equipo) {
        this.agendamiento_equipo = agendamiento_equipo;
    }

    public void setTiene_servicios_con_otro_operador_si_no(String tiene_servicios_con_otro_operador_si_no) {
        this.tiene_servicios_con_otro_operador_si_no = tiene_servicios_con_otro_operador_si_no;
    }

    public void setQue_operador(String que_operador) {
        this.que_operador = que_operador;
    }

    public void setMeta_productos_porc(String meta_productos_porc) {
        this.meta_productos_porc = meta_productos_porc;
    }

    public void setMeta_productos_q(String meta_productos_q) {
        this.meta_productos_q = meta_productos_q;
    }

    public void setMeta_recaudo_porc(String meta_recaudo_porc) {
        this.meta_recaudo_porc = meta_recaudo_porc;
    }

    public void setMeta_recaudo_$(int meta_recaudo_$) {
        this.meta_recaudo_$ = meta_recaudo_$;
    }

    public void setPago(int pago) {
        this.pago = pago;
    }

    public void setFecha_pago(Date fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public void setProductos_recuperados(int productos_recuperados) {
        this.productos_recuperados = productos_recuperados;
    }

    public void setCuentas_recuperados(int cuentas_recuperados) {
        this.cuentas_recuperados = cuentas_recuperados;
    }

    public void setValor_recuperado(int valor_recuperado) {
        this.valor_recuperado = valor_recuperado;
    }

    public void setEfectividad_productos(String efectividad_productos) {
        this.efectividad_productos = efectividad_productos;
    }

    public void setEfectviidad_cuentas(String efectviidad_cuentas) {
        this.efectviidad_cuentas = efectviidad_cuentas;
    }

    public void setEfectividad_recaudo(String efectividad_recaudo) {
        this.efectividad_recaudo = efectividad_recaudo;
    }

    public void setCartera_actual(int cartera_actual) {
        this.cartera_actual = cartera_actual;
    }

    public void setDias_mora_actual(int dias_mora_actual) {
        this.dias_mora_actual = dias_mora_actual;
    }

    public void setRango_de_mora_actual(int rango_de_mora_actual) {
        this.rango_de_mora_actual = rango_de_mora_actual;
    }

    public void setGestion_isla_de_localizacion(String gestion_isla_de_localizacion) {
        this.gestion_isla_de_localizacion = gestion_isla_de_localizacion;
    }

    public void setFecha_de_acuerdo_de_pago(Date fecha_de_acuerdo_de_pago) {
        this.fecha_de_acuerdo_de_pago = fecha_de_acuerdo_de_pago;
    }

    public void setCumplimiento_promesa(String cumplimiento_promesa) {
        this.cumplimiento_promesa = cumplimiento_promesa;
    }

    public void setFecha_de_ajuste(Date fecha_de_ajuste) {
        this.fecha_de_ajuste = fecha_de_ajuste;
    }

    public void setEstado_de_ajustes(String estado_de_ajustes) {
        this.estado_de_ajustes = estado_de_ajustes;
    }

    public String getMes_de_asignacion() {
        return mes_de_asignacion;
    }

    public Date getFecha_asig() {
        return fecha_asig;
    }

    public Date getFecha_cierre() {
        return fecha_cierre;
    }

    public String getOperacion() {
        return operacion;
    }

    public String getFacturador() {
        return facturador;
    }

    public String getAliado() {
        return aliado;
    }

    public String getNombre_campaña() {
        return nombre_campaña;
    }

    public String getFoco() {
        return foco;
    }

    public String getCod_cuenta() {
        return cod_cuenta;
    }

    public String getTipo_ident() {
        return tipo_ident;
    }

    public String getNum_ident() {
        return num_ident;
    }

    public String getSegmento_cuenta() {
        return segmento_cuenta;
    }

    public long getCartera_asignada() {
        return cartera_asignada;
    }

    public int getDias_mora_asignada() {
        return dias_mora_asignada;
    }

    public int getRango_de_mora_asignada() {
        return rango_de_mora_asignada;
    }

    public int getProductos_asignados_fija() {
        return productos_asignados_fija;
    }

    public String getMezcla_productos_fija() {
        return mezcla_productos_fija;
    }

    public String getDes_estado() {
        return des_estado;
    }

    public int getCiclo_de_facturacion() {
        return ciclo_de_facturacion;
    }

    public String getAntiguedad() {
        return antiguedad;
    }

    public String getRiesgo() {
        return riesgo;
    }

    public String getFibra() {
        return fibra;
    }

    public String getConvergentes() {
        return convergentes;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getRegion() {
        return region;
    }

    public String getEstado_de_recupero() {
        return estado_de_recupero;
    }

    public String getAccion() {
        return accion;
    }

    public String getResultado_accion() {
        return resultado_accion;
    }

    public int getCant_llamadas() {
        return cant_llamadas;
    }

    public int getCant_ivr() {
        return cant_ivr;
    }

    public int getCant_sms() {
        return cant_sms;
    }

    public int getCant_email() {
        return cant_email;
    }

    public String getContactabilidad() {
        return contactabilidad;
    }

    public String getCierre() {
        return cierre;
    }

    public String getContinua_con_el_servicio() {
        return continua_con_el_servicio;
    }

    public String getMotivo_no_pago_nivel_1() {
        return motivo_no_pago_nivel_1;
    }

    public String getMotivo_no_pago_nivel_2() {
        return motivo_no_pago_nivel_2;
    }

    public String getMotivo_no_pago_nivel_2_opciones() {
        return motivo_no_pago_nivel_2_opciones;
    }

    public String getObservacion() {
        return observacion;
    }

    public String getTelefono_gestion() {
        return telefono_gestion;
    }

    public String getPorc_de_descuento_de_cartera_cond_100() {
        return porc_de_descuento_de_cartera_cond_100;
    }

    public int getValor_de_descuento() {
        return valor_de_descuento;
    }

    public String getTipo_de_negociacion() {
        return tipo_de_negociacion;
    }

    public String getAcepta_beneficio() {
        return acepta_beneficio;
    }

    public String getAcepta_condonacion() {
        return acepta_condonacion;
    }

    public String getDowngrade_movil() {
        return downgrade_movil;
    }

    public String getCod_descuento_plan() {
        return cod_descuento_plan;
    }

    public String getDesc_cargos_basicos() {
        return desc_cargos_basicos;
    }

    public String getApoyo_fidelizacion() {
        return apoyo_fidelizacion;
    }

    public String getExtradatos() {
        return extradatos;
    }

    public String getAgendamiento_equipo() {
        return agendamiento_equipo;
    }

    public String getTiene_servicios_con_otro_operador_si_no() {
        return tiene_servicios_con_otro_operador_si_no;
    }

    public String getQue_operador() {
        return que_operador;
    }

    public String getMeta_productos_porc() {
        return meta_productos_porc;
    }

    public String getMeta_productos_q() {
        return meta_productos_q;
    }

    public String getMeta_recaudo_porc() {
        return meta_recaudo_porc;
    }

    public int getMeta_recaudo_$() {
        return meta_recaudo_$;
    }

    public int getPago() {
        return pago;
    }

    public Date getFecha_pago() {
        return fecha_pago;
    }

    public int getProductos_recuperados() {
        return productos_recuperados;
    }

    public int getCuentas_recuperados() {
        return cuentas_recuperados;
    }

    public int getValor_recuperado() {
        return valor_recuperado;
    }

    public String getEfectividad_productos() {
        return efectividad_productos;
    }

    public String getEfectviidad_cuentas() {
        return efectviidad_cuentas;
    }

    public String getEfectividad_recaudo() {
        return efectividad_recaudo;
    }

    public int getCartera_actual() {
        return cartera_actual;
    }

    public int getDias_mora_actual() {
        return dias_mora_actual;
    }

    public int getRango_de_mora_actual() {
        return rango_de_mora_actual;
    }

    public String getGestion_isla_de_localizacion() {
        return gestion_isla_de_localizacion;
    }

    public Date getFecha_de_acuerdo_de_pago() {
        return fecha_de_acuerdo_de_pago;
    }

    public String getCumplimiento_promesa() {
        return cumplimiento_promesa;
    }

    public Date getFecha_de_ajuste() {
        return fecha_de_ajuste;
    }

    public String getEstado_de_ajustes() {
        return estado_de_ajustes;
    }
    
    
}
