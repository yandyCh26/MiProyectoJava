package pe.edu.upeu.service.impl;

import lombok.RequiredArgsConstructor;
import pe.edu.upeu.repository.ICrudGenericoRepository;
import pe.edu.upeu.sysventas.model.Producto;
@RequiredArgsConstructor
public class ProductoServiceImp extends CrudGenericoServiceImp<Producto, Long> implements IProductoService{
    @Override
    protected ICrudGenericoRepository<Producto, Long> getRepo() {
        return null;
    }
}
