import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        ArrayList<Animal>lista = new ArrayList<Animal>();


        lista.add(new Gato("Gato"));
        lista.add(new Perro("Perro"));

        for (int i = 0; i < lista.size(); i++) {

          System.out.println(lista.get(i).getNombre());
          lista.get(i).habla();
            
        }




    }
}
