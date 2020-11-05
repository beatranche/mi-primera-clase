public class TarjetaSim{
    
    // Nombre de la compañía que la gestiona
    private String compañiaTelefonica;
    // Numero de minutos disponibles
    private int minutosDisponibles;
    // Dispone de tegnología 5g
    private boolean cincoG;
    
    /**
     * Crea una tarjeta SIM
     */
    public TarjetaSim(int tarifaMinutosDisponibles, boolean tecnologiaCincoG){
        minutosDisponibles = tarifaMinutosDisponibles;
        cincoG = tecnologiaCincoG;
    
    }
    
    /**
     * Devuelve la compañía que gestiona la tarjea
     */
    public String getCompañiaTelefonica(){
        return compañiaTelefonica;
    }
    
    /**
     * Devuelve los minutos disponibles
     */
    public int getMinutosDisponibles(){
        return minutosDisponibles;
    }
    
    /**
     * Indica si la tarjeta dispone de tecnoñogía 5g
     */
    public boolean getCincoG(){
        return cincoG;
    }
    
    /**
     * Cambia la compañía telefónica
     */
    public String setCompañiaTelefonica(String nuevaCompañia){
        return nuevaCompañia;
    }
    
    /**
     * Incrementa los minutos disponibles
     */
    public void minutosExtra(int cantidadMinutos){
        minutosDisponibles += cantidadMinutos; 
    }
    
    /**
     * Opción de disponer de tecnología 5g
     */
    public void opcionCincoG(){
        if (cincoG == true){
        cincoG = false;
        }
        else{
        cincoG = true;
        }
    }
    
    /**
     * Imprime por pantalla los detalles de la tarjeta
     */
    public void imprimeDetalles(){
        System.out.println("La tarjeta pertenece a la compañía " + compañiaTelefonica + " Dispone de " + minutosDisponibles + " minutos. " + "Tecnología 5g: " + cincoG);
    }
}
