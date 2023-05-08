package ejemplo.guia.poo2;

public class EjemploGuiaPoo2 {

    public static void main(String[] args) {
        
        servicio s =  new servicio();
        persona p = new persona();
       
        //llamamos al servicio
        s.mostrarPersona(p);
    }

}
