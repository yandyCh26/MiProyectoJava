package pe.edu.upeu.enums;

import lombok.Getter;

@Getter
import lombok.Getter;


public enum DiasSemana {
    DOMINGO ("Domingo"),
    LUNES (),
    MARTES (),
    MIERCOLES (),
    SABADO (),

    String nombreDia;

    DiasSemana(String nombreDia){
        this.nombreDia=nombreDia;
    }
}
