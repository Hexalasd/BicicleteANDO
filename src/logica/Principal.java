/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.ArrayList;

public class Principal {
     public static ArrayList<Bicicleta> listaBicicletas = new ArrayList<>();
     
     public static void agregarBicicleta(Bicicleta b){
         listaBicicletas.add(b);
     }
     public static ArrayList<Bicicleta>getBicicleta(){
         return listaBicicletas;
     }
     
}
