
package redsuelva.genadorInformes.dao;


public interface ICrud <T> {
    
    void save(T t);
    void update(T t);
    void delete (T t);
    void find (T t);
    
    
    
}
