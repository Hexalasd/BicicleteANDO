package logica;

public class Usuario {

    private String nombre;
    private int edad;
    private Bicicleta bici;
    private boolean cascoPuesto;
    private Bicicleta bicicleta;

    public Usuario(String nombre, int edad, Bicicleta bici) {
        this.nombre = nombre;
        this.edad = edad;
        this.bici = bici;
        this.cascoPuesto = false;
    }

    public void ponerCasco() {
        cascoPuesto = true;
    }

    public void sacarCasco() {
        cascoPuesto = false;
    }

   public void hacerViaje(double km, double tiempoHoras) {
    if (cascoPuesto) {
        bici.registrarViaje(km, tiempoHoras);
    } else {
        System.out.println("No se puede realizar el viaje: el casco no esta puesto");
    }

        // COMPLETAR:
        // 1. Verificar si el casco está puesto 
        //    Si no está, mostrar mensaje y no permitir el viaje ESTA
        
        // 2. Si está puesto, registrar el viaje en la bicicleta
        //    usando el método registrarViaje() 

        // Pista:
        // - usar bici.registrarViaje(km, tiempoHoras);
        // - usar isCascoPuesto() para verificar si el casco está puesto
    }

    public String revisarBicicleta() {
        // COMPLETAR:
        // 1. Verificar si la bicicleta necesita inflado

        // 2. Verificar si la bicicleta necesita service
        // Pista:
        // - Usar bici.necesitaCarga(), bici.necesitaInflado(), etc.
        return "";
        
    }

    @Override
    public String toString() {
        // COMPLETAR:
        // Mostrar resumen de bici y advertencias si necesita inflado o carga
        // Ejemplo:
        // "Juan (17): EcoRider (eléctrica) - 30 km - PSI: 18.0 - Inflar! Necesita service!"
        return "";
    }

    public boolean isCascoPuesto() {
        return cascoPuesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Bicicleta getBici() {
        return bici;
    }

    public void setBici(Bicicleta bici) {
        this.bici = bici;
    }

    
}
