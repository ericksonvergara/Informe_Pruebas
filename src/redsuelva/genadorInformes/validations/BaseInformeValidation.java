package redsuelva.genadorInformes.validations;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class BaseInformeValidation {

    public static boolean isvalidDateFormate(String date , String formater) {
        boolean correcto = false;

        try {
            //Formato de fecha (día/mes/año)
            SimpleDateFormat formatoFecha = new SimpleDateFormat(formater);
            formatoFecha.setLenient(false);
            //Comprobación de la fecha
            formatoFecha.parse(date);
            correcto = true;
        } catch (ParseException e) {
            //Si la fecha no es correcta, pasará por aquí
            correcto = false;
        }

        return correcto;
    }

}
