import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");

        ArrayList<Villano> listM = new ArrayList<Villano>();

        listM.add(new Villano( 20 ,"juan "));
        listM.add(new Malvado ( 30 ,"jose", true));
        listM.add(new Malvado( 40 ,"jorge", false));

        System.out.println(" Nombre: " + listM.get(0).getNombre() + " Edad: " + listM.get(0).getEdad());

        for (int index = 1; index < listM.size(); index++) {
           // System.out.println(listM.get(index).getEdad()+" "+ listM.get(index).getNombre()+ " " + ((Malvado)listM.get(index)).getExtraterreste());// se hace el down cast pero no es recomendable pude que no tengan los mismo datos los siguientes
            System.out.println(" Nombre: "+ listM.get(index).getNombre() + " Edad: " + listM.get(index).getEdad());
        }

    }
}
