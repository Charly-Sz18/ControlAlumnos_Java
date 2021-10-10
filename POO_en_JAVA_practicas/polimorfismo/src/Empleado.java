public class Empleado {
    private String nombre;
    protected double salario;

    public Empleado(){}
    
    public Empleado (String nombre, double salario){
        this.nombre = nombre;
        this.salario = salario; 
    }

    public Empleado(String nombre){
       this.nombre = nombre;
       this.salario = 0.0;

    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public double getSalario(){
        return salario;
    }

    public void aumentarSalario(){
        salario *=  1.05;  
      }


}
