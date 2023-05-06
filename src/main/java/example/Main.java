package example;

import java.io.IOException;

public class Main {
    public static void main (String[] args){
        LeerArchivos lectura = new LeerArchivos();
        try {
            lectura.metodoUno("Datos.txt");
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
