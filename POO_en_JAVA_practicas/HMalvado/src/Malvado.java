public class Malvado extends Villano{
     private boolean  extraterrestre;

    public Malvado (int e, String n, boolean extraterrestre){
        super(e,n);
        this.extraterrestre=extraterrestre ;
    }

    public boolean getExtraterreste(){
        return extraterrestre;
    }
}