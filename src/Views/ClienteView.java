package Views;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ClienteView {
    public void menu() {
        Scanner ler = new Scanner(System.in);

        while (true) {
            System.out.println("--- Prova Menu Clientes ---");
            System.out.println("1 - Listar Clientes");
            System.out.println("2 - Selecionar Cliente");
            System.out.println("3 - Cadastrar Cliente");
            System.out.println("4 - Sair");

            Integer escolha;

            try {
                escolha = ler.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Escolha deve ser um numero inteiro!");
                continue;
            } finally {
                ler.nextLine();
            }

            switch (escolha) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    return;
            }
        }
    }
}
