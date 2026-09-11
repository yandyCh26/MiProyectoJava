package pe.edu.upeu.service.impl;

import lombok.RequiredArgsConstructor;
import pe.edu.upeu.repository.ICrudGenericoRepository;
import pe.edu.upeu.repository.UnidadMedidaRepository;
import pe.edu.upeu.sysventas.model.UnidMedida;
@RequiredArgsConstructor
public class UnidadMedidaServiceImp extends CrudGenericoServiceImp<UnidMedida, Long> implements IUnidadMedidaService{
    private final UnidadMedidaRepository unidadMedidaRepository;
    @Override
    protected ICrudGenericoRepository<UnidMedida, Long> getRepo() {
        return unidadMedidaRepository;
    }
}
