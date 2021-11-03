public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        System.out.println("El producto esta compuesto por la Fecha y  se le agrega la hora: \n");

        Fecha f1 = new Fecha(12,05,2021);
        Hora  h1 = new Hora(10,05);
        Compra c1 = new Compra(2534,f1);
        c1.agregarHora(h1);
        System.out.println(c1.toString());

        System.out.println("\nEl producto esta compuesto por la Fecha y NO se le agrega la hora:\n");

        Fecha f2 = new Fecha(12,05,2021);
        //Hora  h2 = new Hora(10,30);
        Compra c2 = new Compra(2534,f2);
        //c2.agregarHora(h2);
        System.out.println(c2.toString());



    }
}
