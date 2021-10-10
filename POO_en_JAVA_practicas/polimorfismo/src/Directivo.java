public class Directivo extends Empleado{
    private String nombreSecretaria;

    public Directivo(String e, double n, String nombreSecretaria){
             super(e, salario);
             this.nombreSecretaria = nombreSecretaria;
    }
   
    @Override
    public void aumentarSalario(){
        this.salario *=1.10;
    }

    public  String getNombreSecretaria(){
        return nombreSecretaria;
    }

    
}
