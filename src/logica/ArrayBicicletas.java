package logica;

import java.util.ArrayList;

public class ArrayBicicletas {
     public static int cont = 0;

     public static ArrayList<Bicicleta> listaBicicletas = new ArrayList<>();
     
     public static void agregarBicicleta(Bicicleta b){
         listaBicicletas.add(b);
     }
     public static ArrayList<Bicicleta>getBicicleta(){
         return listaBicicletas;
     }
     
}
