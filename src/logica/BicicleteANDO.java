package logica;

import bicleteando.Bicicleta;

public class BicicleteANDO {

    public static void main(String[] args) {
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

        // Hacer un segundo viaje de 12 km en 0.5 h (24 km/h)
        System.out.println("Segundo viaje");
        usuario1.hacerViaje(12, 0.5);
        System.out.println("(Debe devolver 22.0) Velocidad promedio: " + usuario1.getBici().getVelocidadPromedio());
        System.out.println("(Debe devolver 22.0) Distancia recorrida: " + usuario1.getBici().getDistanciaRecorrida());

        // Sacar el casco
        usuario1.sacarCasco();

        // Hacer un tercer viaje de 15 km en 1 h (15 km/h)
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

        // Mostrar estado general
        System.out.println("Estado general:");
        System.out.println(usuario1);
    }

}
