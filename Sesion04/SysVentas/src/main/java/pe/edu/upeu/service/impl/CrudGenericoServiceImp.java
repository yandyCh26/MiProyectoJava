package pe.edu.upeu.service.impl;

import pe.edu.upeu.exception.ModelNotFoundException;
import pe.edu.upeu.repository.ICrudGenericoRepository;
import pe.edu.upeu.service.ICrudGenericoService;

import java.util.List;

public abstract class CrudGenericoServiceImp<T, ID>implements ICrudGenericoService<T, ID> {
    protected abstract ICrudGenericoRepository<T, ID> getRepo();

    @Override
    public T save(T t) {
        return getRepo().save(t);
    }

    @Override
    public T update(ID id, T t) {
        if (!getRepo().existsByID(id)){
            throw new ModelNotFoundException("ID no existe: "+id);
        }
        return getRepo();
    }

    @Override
    public List<T> findAll() {
        return getRepo().findAll();
    }

    @Override
    public T findById(ID id) {
        return getRepo().findById().orElseThrow(()->new ModelNotFoundException("El id no existe:"+id));
        return null;
    }

    @Override
    public void delete(ID id) {
        if (!getRepo().existsByID(id)){
            throw new ModelNotFoundException("ID no existe: "+id);
        }
        getRepo().deleteById(id);
    }
}
