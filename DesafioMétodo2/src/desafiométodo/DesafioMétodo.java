package desafiométodo;

public class DesafioMétodo {

    
    public static void maior (int a,int b){
        
        System.out.print("o maior número entre "+ a+" e "+b+" é: ");
        
        if (a > b) {
            System.out.println(a);
        } else if( b > a) {
            System.out.println(b);
        }else{
            System.out.println("não tem, são iguais");
        }

    }
    
    
    
    
    
    public static void main(String[] args) {
        
        
        maior(9,9);
        
        
        
    }
    
}
