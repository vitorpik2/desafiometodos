package desafiométodo3;

public class DesafioMétodo3 {

    public static void palavras(String a, String b) {
        boolean equal = a.equals(b);
        boolean equalIgnore = a.equalsIgnoreCase(b);
        System.out.println(a + " e " + b + " são iguais? ");
        System.out.println("");
        System.out.print("contando maiúsculas e minúsculas: ");

        System.out.println(equal);
        System.out.println("");
        System.out.print("sem contar maiúsculas e minúsculas: ");

        System.out.println(equalIgnore);

    }

    public static void main(String[] args) {
        palavras("Hello", "hello");
    }

}
