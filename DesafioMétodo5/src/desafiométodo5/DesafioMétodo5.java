package desafiométodo5;


public class DesafioMétodo5 {

    
    public static String name (String a,String b){
      String c;
        boolean equal = a.equalsIgnoreCase(b);
        if(equal = true){
            c = "Os nomes são iguais";
        }else{
            c = "Os nomes não são iguais";
        }
    
    return c;
    }
    
    
    
    public static void main(String[] args) {
        
        System.out.println(name("Hihihiha","hihihiha"));
    
    }
    
}
