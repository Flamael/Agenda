package dao;

import java.util.List;

public interface GenericDAO<T> {
    
    public void create(T t);
    
    public void update(T t);
    
    public void delete(int id);
    
}
