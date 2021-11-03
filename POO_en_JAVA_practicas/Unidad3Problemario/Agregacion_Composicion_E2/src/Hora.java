public class Hora {
    private int Hora;
    private int minuto;

    public Hora(int h,int m){
    this.Hora = h;
    this.minuto =m;
    }
    
    @Override
    public String toString() {
        return Hora+"/"+minuto+"\n";
    }
    
}
