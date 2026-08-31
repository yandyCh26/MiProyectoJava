package pe.edu.upeu.claseinterna;

public class ClaseExt {
    class ClaIntuno{
        void saludo(){
            System.out.println("Soyy clase interna uno");
        }
    }
    class ClaIntDos{
        static void saludo(){
            System.out.println("Soy clase Interna dos");
        }
        static void mostrarInformacion(){
            System.out.println("Los metodos staticos se pueden llamar de forma directa");
        }
    }
    public static void main(String[] args){
        ClaseExt ce=new ClaseExt();
        ClaIntuno cIU=ce.new ClaIntuno();
        cIU.saludo();
        ClaIntDos cID=ce.new ClaIntDos();
        cID.saludo();
        ClaIntDos.mostrarInformacion();
    }
}
