package pe.edu.upeu.sysventas.model;

import lombok.Getter;
import lombok.Setter;
import pe.edu.upeu.enums.Menus;
import pe.edu.upeu.enums.TipoTab;
@Getter
@Setter
public class Acceso {
    String idAcceso;
    String urlAcceso;
    String menuItemNombre;
    Menus menuNombre;
    TipoTab nombreTab;
}
