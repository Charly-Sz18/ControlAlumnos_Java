public class Compra {
    private int claveTransaccion;
    private Fecha fecha;
    private Hora hora;

    public Compra(int CT,Fecha F){
        this.claveTransaccion = CT;
        this.fecha = F;
    }

    public void agregarHora(Hora ho){
        this.hora=ho;
    }

    @Override
    public String toString() {
        if (hora != null){
            return "clave de transacción: "+ claveTransaccion +"\nFecha: "+ fecha + "\nHora: "+ hora;
        }
        else{
            return "clave de transacción: "+ claveTransaccion +"\nFecha: "+ fecha ;
        } 
    }

    








}
