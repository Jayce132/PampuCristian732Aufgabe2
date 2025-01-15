package repository;

import java.util.*;

public abstract class InMemoryRepository<T> implements GenericRepository<T> {
    protected Map<Integer, T> store = new HashMap<>();

    @Override
    public T create(T entity) {
        // Subclass must put it into 'store'
        return null;
    }

    @Override
    public T findById(int id) {
        return store.get(id);
    }

    @Override
    public List<T> findAll() {
        return new ArrayList<>(store.values());
    }

    @Override
    public T update(T entity) {
        // Subclass must handle the update logic
        return null;
    }

    @Override
    public boolean deleteById(int id) {
        return store.remove(id) != null;
    }
}
