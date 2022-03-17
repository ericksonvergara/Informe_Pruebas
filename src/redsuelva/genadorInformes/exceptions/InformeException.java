
package redsuelva.genadorInformes.exceptions;


public class InformeException extends Exception{
    
    ////MANEJO DE ARCHIVOS
    private String msjUser;

    public InformeException(String msjUser) {
        super();
        this.msjUser = msjUser;
    }

    public String getMsjUser() {
        return msjUser;
    }

    public void setMsjUser(String msjUser) {
        this.msjUser = msjUser;
    }

   
    
    
    
}
