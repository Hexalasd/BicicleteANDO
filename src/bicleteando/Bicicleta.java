package bicleteando;

public class Bicicleta {
    private String modelo;
    private String modo; // "urbano", "montaña", "electrica"
    private double distanciaRecorrida; // en km
    private double velocidadPromedio;  // en km/h
    private int cambiosActuales;       // 1 a 7
    private double presionNeumaticos;  // PSI (25.0 es ideal)
    
    public Bicicleta(String modelo, String modo) {
        this.modelo = modelo;
        // COMPLETAR:
        // 1. Solo permite los 3 modos de bicicleta permitidos, sino carga urbano
        this.modo = modo;
        this.distanciaRecorrida = 0;
        this.velocidadPromedio = 0;
        this.cambiosActuales = 3;
        this.presionNeumaticos = 25.0;
    }
    
    public void registrarViaje(double km, double tiempoHoras) {
        // COMPLETAR:
        // 1. Sumar los km al total de distanciaRecorrida
        // 2. Calcular velocidad del viaje actual: km / tiempoHoras
        // 3. Calcular nuevo promedio: (velocidadPromedio + nuevaVelocidad) / 2
        // 4. Restar 0.5 PSI cada 5 km recorridos (puede usar km / 5 * 0.5)
    }
    
    public boolean tocaPrimerService() {
        // COMPLETAR:
        // Si es eléctrica y recorrió más de 500 km, necesita service. 
        //Las bicicletas comunes necesitan service a los 300km.
        return false;
    }
    
    public boolean necesitaInflado() {
        // COMPLETAR:
        // Si presión es menor a 20 PSI, retornar true
        return false;
    }
    
    public void setCambiosActuales(int nuevoCambio) {
        // COMPLETAR:
        // Solo aceptar entre 1 y 7
        // Si es válido, cambiar cambiosActuales
    }
    
    public void setPresionNeumaticos(double presionNeumaticos) {
        // COMPLETAR:
        // Solo aceptar entre 0 y 70
        // Si es válido, cambiar presionNeumaticos
    }
    
    @Override
    public String toString() {
        // COMPLETAR: retornar descripción como:
        // "EcoRider (eléctrica) - 22.0 km - Vel. Prom.: 23.1 km/h - Cambios: 4 - PSI: 22.5"
        return "";
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModo() {
        return modo;
    }

    public double getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public double getVelocidadPromedio() {
        return velocidadPromedio;
    }

    public int getCambiosActuales() {
        return cambiosActuales;
    }

    public double getPresionNeumaticos() {
        return presionNeumaticos;
    }
    
    
    
}
