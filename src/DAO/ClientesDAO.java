package DAO;

import Models.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClientesDAO {
    private String filename;
    private List<Cliente> clientes = new ArrayList<>();

    public ClientesDAO() {
        this.filename = "usuarios.txt";
    }
}
