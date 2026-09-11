package pe.edu.upeu.service;

import pe.edu.upeu.repository.CategoriaRepository;
import pe.edu.upeu.repository.ICrudGenericoRepository;
import pe.edu.upeu.service.impl.CrudGenericoServiceImp;
import pe.edu.upeu.sysventas.model.Categoria;

public class CategoriaServiceImp extends CrudGenericoServiceImp<Categoria, Long> implements ICategoriaService {
    private final CategoriaRepository categoriaRepository;

    public CategoriaServiceImp(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    @Override
    protected ICrudGenericoRepository<Categoria, Long> getRepo() {
        return categoriaRepository;
    }
}
