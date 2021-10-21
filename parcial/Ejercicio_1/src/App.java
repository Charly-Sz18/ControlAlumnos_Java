public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Racional f1 = new Racional(3,4);
        Racional f2 = new Racional(5,6);
        Racional f3 = new Racional(3,4);

        System.out.println("\n---Equals--");
        System.out.println("Evaluando: " + f1.toString()+ " = " + f2.toString());
        System.out.println(f1.equals(f2));
        System.out.println("Evaluando: " + f1.toString()+ " = " + f3.toString());
        System.out.println(f1.equals(f3)+"\n");


        System.out.println("Sumando: "+ f1.toString()+ " + " + f2.toString() );
        System.out.println(f1.Suma(f2)+"\n");

        System.out.println("Multiplicando: "+ f1.toString()+ " * " + f2.toString() );
        System.out.println(f1.Multiplicacion(f2)+"\n");

        System.out.println("Dividiendo: "+ f1.toString()+ " / " + f2.toString() );
        System.out.println(f1.Division(f2)+ "\n");
        
    }
}
