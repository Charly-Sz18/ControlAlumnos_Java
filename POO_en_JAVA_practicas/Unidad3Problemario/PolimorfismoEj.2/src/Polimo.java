import java.util.ArrayList;

public class Polimo {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        
        ArrayList<Figura>listaF =new ArrayList<>();

        listaF.add(new Cuadrado("cuadrado",20));
        listaF.add(new Triangulo("Triangulo",10,5));
        listaF.add(new Cuadrado("cuadrado",10));
        listaF.add(new Triangulo("Triangulo",4,5));
        listaF.add(new Cuadrado("cuadrado",15));
        listaF.add(new Triangulo("Triangulo",4,3));

        for (int i = 0; i < listaF.size(); i++) {
            listaF.get(i).pide_Datos();
            listaF.get(i).imprime_Area();
        }



        
        

      

         
       
        

    }
}
