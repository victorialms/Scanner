import java.util.Scanner;

public class TestePilha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pilha pilha = new Pilha(5);

        System.out.println("Digite 3 números para empilhar:");
        for (int i = 0; i < 3; i++) {
            pilha.push(scanner.nextInt());
        }

        pilha.imprimirPilha();
        System.out.println("Topo da pilha: " + pilha.peek());

        System.out.println("Removendo elemento do topo: " + pilha.pop());
        pilha.imprimirPilha();
        scanner.close();
    }
}
