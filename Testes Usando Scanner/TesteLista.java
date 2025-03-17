import java.util.Scanner;

public class TesteLista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaArray lista = new ListaArray(5);

        System.out.println("Digite 3 números para adicionar à lista:");
        for (int i = 0; i < 3; i++) {
            lista.adicionar(scanner.nextInt());
        }

        lista.imprimirLista();

        System.out.println("Digite a posição para remover:");
        lista.remover(scanner.nextInt());

        lista.imprimirLista();
        scanner.close();
    }
}
