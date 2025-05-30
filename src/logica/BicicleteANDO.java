package logica;

import java.util.Scanner;

import java.util.ArrayList;

public class BicicleteANDO {

    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Usuario> usuarios = new ArrayList<>();
        int cantUsuarios;
        int edadUsuarios;
        String nombreUsuarios;
        ArrayList<Bicicleta> bicicletas = new ArrayList<>();
        int cantBicis;
        String modeloBicis;
        String modoBicis;
        int numIndiceBici;
        
        //sirve para ingresar bicis
        System.out.print("Ingrese la cantidad de bicicletas que quiere crear: ");
        cantBicis = scanner.nextInt();
        
        for (int i = 0; i < cantBicis; i++){
            System.out.println("Bicicleta n. "+(i+1)+":");
            System.out.print("Ingrese modelo: ");
            modeloBicis = scanner.next();
            System.out.print("Ingrese modo: ");
            modoBicis = scanner.next();
            
            bicicletas.add(new Bicicleta(modeloBicis, modoBicis));
            System.out.print("\n");
        }
        
        System.out.println("\n"); //para que no quede pegado
        
        //sirve para ingresar usuarios
        System.out.print("Ingrese la cantidad de usuarios que quiere crear: ");
        cantUsuarios = scanner.nextInt();
        
        for (int i = 0; i < cantUsuarios; i++){
            System.out.println("Usuario n. "+(i+1)+":");
            System.out.print("Nombre del usuario:");
            nombreUsuarios = scanner.next();
            System.out.print("Edad del usuario:");
            edadUsuarios = scanner.nextInt();
            System.out.print("Numero de ingreso de la bicicleta: ");
            numIndiceBici = scanner.nextInt();
            
            usuarios.add(new Usuario(nombreUsuarios, edadUsuarios, bicicletas.get(numIndiceBici-1)));
            System.out.println("\n");
        }

        
        
         
        
       
        // Crear una bicicleta eléctrica
        Bicicleta bici1 = new Bicicleta("EcoRider", "electrica");

        // Crear un usuario
        Usuario usuario1 = new Usuario("Sofia", 17, bici1); 

        // Poner el casco
        usuario1.ponerCasco();

        // Hacer un primer viaje de 10 km en 0.5 h (20 km/h)
        System.out.println("Primer viaje");
        usuario1.hacerViaje(10, 0.5);
        System.out.println("(Debe devolver 20.0) Velocidad promedio: " + usuario1.getBici().getVelocidadPromedio()); 
        //mentira, devuelve 10

        // Hacer un segundo viaje de 12 km en 0.5 h (24 km/h)
        System.out.println("Segundo viaje");
        usuario1.hacerViaje(12, 0.5);
        System.out.println("(Debe devolver 22.0) Velocidad promedio: " + usuario1.getBici().getVelocidadPromedio());
        System.out.println("(Debe devolver 22.0) Distancia recorrida: " + usuario1.getBici().getDistanciaRecorrida());

        // Sacar el casco
        usuario1.sacarCasco();

        // Hacer un tercer viaje de 15 km en 1 h (15 km/h) (que no lo hace porque se saca el casco)
        System.out.println("Tercer viaje");
        usuario1.hacerViaje(15, 1);
        System.out.println("(Debe devolver 22.0) Distancia recorrida: " + usuario1.getBici().getDistanciaRecorrida());

        // Poner el casco
        usuario1.ponerCasco();

        // Hacer un cuarto viaje de 40 km en 0.25 h (10 km/h)
        System.out.println("Cuarto viaje");
        usuario1.hacerViaje(40, 0.25);
        System.out.println("(Debe devolver 62.0) Distancia recorrida: " + usuario1.getBici().getDistanciaRecorrida());

        System.out.print("(Debe devolver 18.8) Presion de los neumaticos: ");
        System.out.println(usuario1.getBici().getPresionNeumaticos());

        // Revisar sugerencias de mantenimiento
        System.out.println("\nRevision de la bicicleta:");
        System.out.println("(Debe devolver Inflar!): " + usuario1.revisarBicicleta());

        // Mostrar estado general (toString)
        System.out.println("Estado general:");
        System.out.println(usuario1);

 
        }

}
