package desafiométodo4;

public class DesafioMétodo4 {

    public static void menor(int a, int b) {

        System.out.print("o menor número entre " + a + " e " + b + " é: ");

        if (a < b) {
            System.out.println(a);
        } else if( b < a) {
            System.out.println(b);
        }else{
            System.out.println("não tem, são iguais");
        }

    }



public static void main(String[] args) {
        
        menor(9,7);
        
        
        
    }
    
}
