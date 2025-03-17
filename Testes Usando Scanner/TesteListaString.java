import java.util.Scanner;

public class TesteListaString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaArrayString lista = new ListaArrayString(4);

        System.out.println("Digite 3 nomes para adicionar à lista:");
        for (int i = 0; i < 3; i++) {
            lista.adicionar(scanner.nextLine());
        }

        lista.imprimirLista();

        System.out.println("Digite a posição do nome a ser removido:");
        lista.remover(scanner.nextInt());

        lista.imprimirLista();
        scanner.close();
    }
}
