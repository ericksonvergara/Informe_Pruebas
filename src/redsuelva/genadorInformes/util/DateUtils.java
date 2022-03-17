
package redsuelva.genadorInformes.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateUtils {
    
    public static final String formaterBasic = "dd/MM/yyyy";
    
    public static final String formater = "yyyy-MM-dd HH:mm:ss";
    
     public static LocalDateTime getDateLocalTime(String fecha, String formater) {
    	return LocalDateTime.parse(fecha, DateTimeFormatter.ofPattern(formater));
    }
     
      public static Date convert(String fecha, String formater) throws ParseException {
          Date date =new SimpleDateFormat(formater).parse(fecha);  
    	return  date  ;
    }
     
}
