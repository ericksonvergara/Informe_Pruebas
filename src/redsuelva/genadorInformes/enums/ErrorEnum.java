
package redsuelva.genadorInformes.enums;


public enum ErrorEnum {
    
    NO_EXISTE_ARCHIVO_PROPERTIES("No se econtro la ruta del archivo de configuracion"),
    
    ;
    
    
    
    public  String value;

    private ErrorEnum(String value) {
        this.value = value;
    }
    
    
    
}
