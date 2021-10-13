public class Tproductos {
    
 protected String  Nlote;
 protected String pais;

 public Tproductos(){}

 public Tproductos(String  lote, String pais){
    this.Nlote = lote;
    this.pais = pais;
 }

 public void setNlote(String lote){
     this.Nlote = lote;
 }

 public void setpais(String pais){
     this.pais = pais;
 }

 public String getNlote(){
     return Nlote;
 }

 public String getPais(){
     return pais;
 }





}
