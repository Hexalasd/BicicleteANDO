package logica;

public class Usuario {

    private String nombre;
    private int edad;
    private Bicicleta bici;
    private boolean cascoPuesto;

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
         // 1. Verificar si el casco está puesto 
        //    Si no está, mostrar mensaje y no permitir el viaje ESTA
        // 2. Si está puesto, registrar el viaje en la bicicleta
        //    usando el método registrarViaje() 
    if (cascoPuesto) {
        bici.registrarViaje(km, tiempoHoras);
    } else {
        System.out.println("No se puede realizar el viaje: el casco no esta puesto");
    }
    }
 // 1. Verificar si la bicicleta necesita inflado
    public String revisarBicicleta() {
        String mensaje ="";
        if(bici.necesitaInflado()){
            mensaje += "inflar!!";
            
        }
        // 2. Verificar si la bicicleta necesita service
        if(bici.tocaPrimerService()){
            mensaje += "nececita servicio";
        }
        return "";
        
    }

    @Override
    public String toString() {
        // Mostrar resumen de bici y advertencias si necesita inflado o carga
        String estado =nombre + " (" + edad + "): " + bici.getModelo() + " (" + bici.getModo() + ") - " +
                        bici.getDistanciaRecorrida() + " km - PSI: " + bici.getPresionNeumaticos();
        String advertencia =revisarBicicleta();
        if(bici.necesitaInflado()){
            advertencia = "inflar!!";
        }
      
        //logica para que no se duplique el mensaje de advertencia usando ya el metodo de revisarBicicleta
        if(!advertencia.isEmpty()){
            estado = advertencia ;
        }
            return estado; 
        
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
