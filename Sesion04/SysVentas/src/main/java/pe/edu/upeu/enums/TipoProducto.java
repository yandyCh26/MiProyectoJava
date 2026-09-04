package pe.edu.upeu.enums;

import lombok.Getter;

@Getter
public enum TipoProducto {
    PRODUCTO("Producto"),
    PREPARADO("Preparado"),
    SERVISIO("Servicio");

    String descripcion;
    TipoProducto(String descripcion){
        this.descripcion=descripcion;
    }
}
