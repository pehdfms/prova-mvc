package Views;

import Controllers.ClienteController;
import Models.Cliente;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ClienteView {
    private ClienteController controller = new ClienteController();

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
                    listarClientes();
                    break;
                case 2:
                    selecionarCliente();
                    break;
                case 3:
                    cadastrarCliente();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Escolha invalida! Tente novamente.");
                    break;
            }
        }
    }

    private void listarClientes() {
        List<Cliente> clientes = controller.getModels();

        if (clientes.size() == 0) System.out.println("Nao existem clientes cadastrados.");

        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    private void menuMensagens(Cliente cliente) {
        Scanner ler = new Scanner(System.in);

        while (true) {
            System.out.println("--- Cliente Selecionado ---");
            System.out.println(cliente);

            System.out.println("1 - Listar Mensagens");
            System.out.println("2 - Cadastrar Mensagem");
            System.out.println("3 - Confirmar");

            Integer escolha = ler.nextInt();
            ler.nextLine();

            switch (escolha) {
                case 1:
                    System.out.println(cliente.getMensagensFeedback());
                    break;
                case 2:
                    System.out.println("Escreva uma nova mensagem:");
                    controller.addFeedback(cliente, ler.nextLine());
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Escolha invalida!");
                    break;
            }
        }
    }

    private void selecionarCliente() {
        if (controller.getModels().size() == 0) {
            System.out.println("Nao existem clientes cadastrados.");
            return;
        }

        Scanner ler = new Scanner(System.in);

        System.out.println("--- Selecionar Cliente ---");
        listarClientes();

        System.out.println("Selecione um id:");
        Long escolha = ler.nextLong();

        Cliente cliente = controller.getById(escolha);
        if (cliente == null) {
            System.out.println("Cliente com este ID nao existe.");
            return;
        }

        menuMensagens(cliente);
    }

    private void cadastrarCliente() {
        Scanner ler = new Scanner(System.in);
        Cliente novo = new Cliente();

        System.out.println("--- Cadastrar Cliente ---");

        System.out.println("Digite o ID do cliente:");
        novo.setIdCliente(ler.nextLong());
        ler.nextLine();

        System.out.println("Digite o nome do cliente:");
        novo.setNome(ler.nextLine());

        if (!controller.addCliente(novo)) {
            System.out.println("Id ja esta na lista, tente novamente.");
        }
    }
}
