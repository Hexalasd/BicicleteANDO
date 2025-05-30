package logica;

public class Bicicleta {
    private String modelo;
    private String modo; // "urbano", "montaña", "electrica"
    private double distanciaRecorrida; // en km
    private double velocidadPromedio;  // en km/h
    private int cambiosActuales;       // 1 a 7
    private double presionNeumaticos;  // PSI (25.0 es ideal)
    private double nuevaVelocidad;
    
    public Bicicleta(String modelo, String modo) {
        this.modelo = modelo;
        if ((modo.equalsIgnoreCase("montaña") || modo.equalsIgnoreCase("urbano") || modo.equalsIgnoreCase("electrica"))){
            this.modo = modo;
        }
        else{
            this.modo = "urbano";
        }
        this.distanciaRecorrida = 0;
        this.velocidadPromedio = 0;
        this.cambiosActuales = 3;
        this.presionNeumaticos = 25.0;
        this.nuevaVelocidad = 0;
        
        //COMPLETAR
        //1. solo premite los 3 modos de bivicleta premitidos, si no, carga "urbano"
        
    }
    
    public void registrarViaje(double km, double tiempoHoras) {
        //para probar que ande, lo dejo por las dudas
        /*System.out.println("km: " + km + " tiempoHoras: " + tiempoHoras);
        this.nuevaVelocidad = km / tiempoHoras;
        System.out.println("Nueva velocidad calculada: " + nuevaVelocidad);
        */
        
        //el metodo
        this.distanciaRecorrida += km;
        this.nuevaVelocidad = km/tiempoHoras; //no da bien el el primer viaje, perso dsp si
        if(velocidadPromedio == 0){
            this.velocidadPromedio  =nuevaVelocidad;
        }else{
            this.velocidadPromedio = (velocidadPromedio+nuevaVelocidad)/2;
        }
        
        this.presionNeumaticos -= km/5 * 0.5;
        
        // 1. Sumar los km al total de distanciaRecorrida ESTA
        // 2. Calcular velocidad del viaje actual: km / tiempoHoras ESTA
        // 3. Calcular nuevo promedio: (velocidadPromedio + nuevaVelocidad) / 2 ESTA
        // 4. Restar 0.5 PSI cada 5 km recorridos (puede usar km / 5 * 0.5) ESTA
    }
    
    public boolean tocaPrimerService() {
        // Si es eléctrica y recorrió más de 500 km, necesita service.  ESTA
        //Las bicicletas comunes necesitan service a los 300km. ESTA
        if("electrica".equals(modelo) && distanciaRecorrida > 500){
            return true;
        }
        else{
            if(distanciaRecorrida > 300){
                return true;
            }
            else{
                return false;
            }
        }
    }
    
    public boolean necesitaInflado() {
        return presionNeumaticos < 20;
        // COMPLETAR:
        // Si presión es menor a 20 PSI, retornar true ESTA
        
    }
    
    public void setCambiosActuales(int nuevoCambio) {
        if (nuevoCambio <= 7 && nuevoCambio >= 1){
            cambiosActuales = nuevoCambio;
        }
        
        // COMPLETAR:
        // Solo aceptar entre 1 y 7 ESTA
        // Si es válido, cambiar cambiosActuales ESTA
    }
    
    public void setPresionNeumaticos(double presionNeumaticos) {
        if (presionNeumaticos <= 70  && presionNeumaticos >= 0){
            this.presionNeumaticos = presionNeumaticos;
        }
        
       
        // Solo aceptar entre 0 y 70  ESTA
        // Si es válido, cambiar presionNeumaticos ESTA
    }

    @Override
  public String toString() {
        return this.modelo + " (" + this.modo + ") - " + String.format("%.1f", this.distanciaRecorrida) + " km - Vel. Prom.: " +
                String.format("%.1f", this.velocidadPromedio) + " km/h - Cambios: " + this.cambiosActuales +
                " - PSI: " + String.format("%.1f", this.presionNeumaticos);
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
