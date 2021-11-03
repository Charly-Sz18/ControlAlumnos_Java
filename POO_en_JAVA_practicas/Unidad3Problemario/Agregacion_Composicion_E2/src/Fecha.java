public class Fecha {
    private int  dia;
    private int mes;
    private int anio;

    public Fecha(int d,int m, int a){
        this.dia = d;
        this.mes = m;
        this.anio = a;
    }

    @Override
    public String toString() {
        return dia+"/"+mes+"/"+ anio +"\n";
    }
    
}
