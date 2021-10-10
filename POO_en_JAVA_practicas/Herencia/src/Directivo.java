public class Directivo extends Empleado{
    private String nombreSecretaria;

    public Directivo(String nombre, double salario,String nombreSecretaria){
        super(nombre, salario);
        this.nombreSecretaria=nombreSecretaria;
    }

    @Override
    public void aumentarSalario(){
        this.salario *= 1.10;
    }
}
