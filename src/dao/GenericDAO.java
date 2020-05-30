package dao;

public interface GenericDAO<T> {
    
    public void create(T t);
    
    public void update(T t);
    
    public void delete(int id);
    
}
