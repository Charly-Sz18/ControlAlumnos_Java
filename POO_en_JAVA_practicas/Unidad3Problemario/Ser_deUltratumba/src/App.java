import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");

        ArrayList<Villano> listM = new ArrayList<Villano>();

        listM.add(new Villano( "juan",10));
        listM.add(new VillanoDeUltratumba ( "Jose" ,250, "inmortales"));
        listM.add(new VillanoDeUltratumba( "venemerito" ,100, "inmortales"));

       // System.out.println(" Nombre: " + listM.get(0).getNombre() + " Edad: " + listM.get(0).getEdad());
         
        for (int index = 0; index < listM.size(); index++) {
            listM.get(index).asustar();
            listM.get(index).gritar();
        }
    }
}
