package redsuelva.genadorInformes.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import redsuelva.genadorInformes.enums.ErrorEnum;
import redsuelva.genadorInformes.enums.PropertiesEnum;
import redsuelva.genadorInformes.exceptions.InformeException;

public class PropertiesUtil {
    
    private static final String path = "C:\\Users\\erickson.vergara\\Downloads\\Informe_pruebas\\configuracion.properties";

    public static Properties get() throws InformeException {

        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(new File(path)));

            System.out.println(properties.get( PropertiesEnum.driver.name()));
     
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new InformeException (ErrorEnum.NO_EXISTE_ARCHIVO_PROPERTIES.value);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;

    }

}
