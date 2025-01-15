package repository;

import java.util.List;

public interface GenericRepository<T> {
    T create(T entity);
    T findById(int id);
    List<T> findAll();
    T update(T entity);
    boolean deleteById(int id);
}
