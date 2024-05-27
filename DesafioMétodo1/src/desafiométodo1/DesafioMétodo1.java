package desafiométodo1;

public class DesafioMétodo1 {

    public static void tabuada(int a) {

        for (int i = 1; i <= 10; i++) {
            System.out.print(a + "x" + i + "= ");

            System.out.println(a * i);

        }

    }

    public static void main(String[] args) {

        tabuada(5);

    }

}
