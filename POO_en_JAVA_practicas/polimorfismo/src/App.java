import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
       /* Directivo gerentePlanta = new Directivo("Jose", 10, "Siri");

        gerentePlanta.aumentarSalario();

        System.out.println("El salario de " +
         gerentePlanta.getNombre() + " es " + gerentePlanta.getSalario());

        Empleado obrero = new Empleado("jose2",10);

        obrero.aumentarSalario();

        System.out.println("El salario de " +
        obrero.getNombre() + " es " + obrero.getSalario());*/

        Empleado a = new Directivo("Juan",10, "siri"); //up casting

        a.aumentarSalario();// llama al metodo del directivo 

        //((Directivo)a).getNombreSecretaria();//down casting  explicito.


        System.out.println("el nombre " + a.getNombre() +" su salario es :" + a.getSalario());
        System.out.println(((Directivo)a).getNombreSecretaria());
        Empleado [] lisEmpleados = new Empleado [2];

        lisEmpleados [0]= new Empleado ("juan", 100);
        lisEmpleados [1]= new Directivo ("Jose", 100, "siri");
        
        for (int i = 0 ; i<2 ; i++){
            lisEmpleados[i].aumentarSalario();
            System.out.println(lisEmpleados[i].getNombre() + " "+lisEmpleados[i].getSalario());
        }


        ArrayList<Empleado> listadeEmpleados = new ArrayList <Empleado>();

        listadeEmpleados.add(new Empleado("Juan", 100));
        listadeEmpleados.add (new Directivo("jose", 100, "siri2"));

        for (int i =0 ; i < listadeEmpleados.size(); i++){
            listadeEmpleados.get(i).aumentarSalario();//polimorfismo
            System.out.println(listadeEmpleados.get(i).getNombre()+ " " + listadeEmpleados.get(i).getSalario());
        }







    }
}
