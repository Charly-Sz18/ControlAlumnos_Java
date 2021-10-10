public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Directivo gerentePlanta = new Directivo ("jose",10. ,"siri");
        gerentePlanta.aumentarSalario();
        System.out.println("el salario de : " + gerentePlanta.getNombre()+" es "+ gerentePlanta.getSalario());

    }
}
