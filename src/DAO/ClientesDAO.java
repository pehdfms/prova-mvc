package DAO;

import Models.Cliente;
import Models.Feedback;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ClientesDAO {
    private String filename;
    private List<Cliente> clientes = new ArrayList<>();

    public ClientesDAO() {
        this.filename = "usuarios.txt";
    }

    public ClientesDAO(String filename) {
        this.filename = filename;
    }

    public void log(String mensagem) {
        try (FileWriter fw = new FileWriter(filename, true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(mensagem);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Nao foi possivel salvar log no arquivo.");
        }
    }

    public String mostrarCliente(Cliente cliente) {
        return cliente.getNome() + " (ID " + cliente.getIdCliente() + ") ";
    }

    public boolean idNaLista(Long id) {
        return getById(id) != null;
    }

    public Cliente getById(Long id) {
        for (Cliente cliente : clientes) {
            if (cliente.getIdCliente() == id.longValue()) return cliente;
        }

        return null;
    }

    public boolean addCliente(Cliente cliente) {
        if (idNaLista(cliente.getIdCliente())) return false;

        log(mostrarCliente(cliente) + "foi adicionado.");

        this.clientes.add(cliente);
        return true;
    }

    public void addFeedback(Cliente cliente, String feedback) {
        Feedback novoFeedback = new Feedback(4L, feedback);

        log(mostrarCliente(cliente) + "adicionou feedback: " + feedback);
        cliente.addFeedback(novoFeedback);
    }

    public List<Cliente> getClientes() {
        return this.clientes;
    }
}
