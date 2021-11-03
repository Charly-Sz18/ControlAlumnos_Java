public class VillanoDeUltratumba extends Villano implements SerDeUltratumba{
     private String legion;

     public VillanoDeUltratumba(String n, int e,String legion){
         super(n,e);
         this.legion=legion;
     }

     @Override
     public void asustar(){
         System.out.println("Buuuuuuuuuuu!");
     }

     @Override
     public void gritar(){
         System.out.println("Uaaaaaaaaay!!!!");
     }


    }