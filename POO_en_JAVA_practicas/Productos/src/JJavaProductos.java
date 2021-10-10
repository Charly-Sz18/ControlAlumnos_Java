import java.util.ArrayList;

public class JJavaProductos {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        ArrayList<Tproductos> list = new ArrayList<Tproductos>();

        list.add(new Pfrescos("1000","China", 2001));
        list.add(new Pfrescos("1001", "Argentina", 2002));
        list.add(new Prefrigerados("1080", "America", 20000000));
        list.add(new Prefrigerados("2d1080", "America", 20000000));
        list.add(new Prefrigerados("1080wqqq", "America", 20000000));
        list.add(new CPagua("md23", "nueva zelanda", 200000, 30));
        list.add(new CPagua("md2332", "nueva zelanda", -25, 30));
        list.add(new CPnitrogeno("ii2mn3n4", "India", -22, "criogénicos"));

        System.out.println("informacion Productos Frescos: \n");
     for (int i = 0; i < 2;  i++) {

        System.out.println("Numero de Lote: "+ list.get(i).getNlote() + "\nPais de origen: "+ list.get(i).getPais() + "\nAño de envasado:"+ ((Pfrescos)list.get(i)).getAño()+ "\n\n");
         
     }

     System.out.println("informacion Productos Refrigerados: \n");
     for (int i = 2; i < 5;  i++) {

        System.out.println("Numero de Lote: "+ list.get(i).getNlote() + "\nPais de origen: "+ list.get(i).getPais() + "\nCodigo alimentaria: "+((Prefrigerados)list.get(i)).getCodigoOrga() + "\n");
         
     }
     
         System.out.println("informacion Productos Congelados: \nPor agua:");

     for (int i = 5; i < 7;  i++) {

        System.out.println("Numero de Lote: "+ list.get(i).getNlote() + "\nPais de origen: " + list.get(i).getPais() + "\nTemperatura mantenimiento recomendada: "+ ((CPagua)list.get(i)).getTemp() + "\nSalinidad por litro de agua: " + ((CPagua)list.get(i)).getSal()+"\n");
         
     }
        System.out.println("Por Nitrogeno: \n");
     System.out.println("Numero de Lote: "+ list.get(7).getNlote() + "\nPais de origen: " + list.get(7).getPais() + "\nTemperatura mantenimiento recomendada: "+ ((CPnitrogeno)list.get(7)).getTemp() + "\nMetodo de congelación: " + ((CPnitrogeno)list.get(7)).getMetodo() + "\n");
        

    }
}
