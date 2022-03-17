
package redsuelva.genadorInformes.mapper;

import java.util.HashMap;
import java.util.List;
import redsuelva.genadorInformes.pojo.BaseInforme;


public class OutBaseInformeMapper {
    
    private List<BaseInforme> listBaseInforme;
    HashMap<Long,String> listResult;

    public List<BaseInforme> getListBaseInforme() {
        return listBaseInforme;
    }

    public void setListBaseInforme(List<BaseInforme> listBaseInforme) {
        this.listBaseInforme = listBaseInforme;
    }

    public HashMap<Long, String> getListResult() {
        return listResult;
    }

    public void setListResult(HashMap<Long, String> listResult) {
        this.listResult = listResult;
    }
    
    
}
