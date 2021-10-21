public class Pronostico_tiempo {
    private double temperatura;
    private String condicion_cielo;

    public Pronostico_tiempo(double temp, String cielo){
        this.temperatura = temp;
        this.condicion_cielo = cielo;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
    public void setCondicion(String condicion_cielo) {
        this.condicion_cielo = condicion_cielo;
    }
    public double getTemperatura() {
        return temperatura;
    }
    public String getCondicion() {
        return condicion_cielo;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        final Pronostico_tiempo other = (Pronostico_tiempo) obj;
        return temperatura == other.temperatura && condicion_cielo == other.condicion_cielo;
    }

    public Pronostico_tiempo temperaturaPredeterminada(){
        double T = 70;
        String con = "Soleada";
        return (new Pronostico_tiempo(T,con));
    }

    public Pronostico_tiempo convertiraTCelsius(){
        double T = (temperatura - 32) * 5/9;
        return(new Pronostico_tiempo(T,condicion_cielo));
    }

    public void  verificar_clima(){

        if (temperatura > 32 && condicion_cielo == "nevando"){
            
            System.out.println("Clima inconsistente"+"\n");
    
        }
        else{
            if (temperatura < 32 && condicion_cielo == "lluvioso"){
                
                 System.out.println("Clima inconsistente "+"\n");
                
            }
            else{
                System.out.println("Clima Consistente"+"\n");
            }

        }

    }


    @Override
    public String toString(){
        return "Temperatura: " + temperatura + "°F"+ "  Clima: " + condicion_cielo;
    }


}
