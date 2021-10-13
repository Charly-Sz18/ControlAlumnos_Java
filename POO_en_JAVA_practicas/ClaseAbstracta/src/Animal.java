public abstract class Animal {
    private String Animal;

    public Animal(String animal){
        this.Animal = animal;
    }

    public void setNombre(String nombre){
        this.Animal = nombre;
    }
    public String getNombre(){
        return Animal;
    }

    public abstract void habla();
    
}
