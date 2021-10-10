public class Empleado {
    private String nombre;
    protected double salario;

    public Empleado (String _nombre,double _salario){
        this.nombre = _nombre;
        this.salario =_salario;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
       return this.nombre ;
    }

    public void setSalario(double salario){
        this.salario= salario;
    }
    public double getSalario(){
        return this.salario;
    }

    public void aumentarSalario(){
        salario *= 1.05;
    } 





}
