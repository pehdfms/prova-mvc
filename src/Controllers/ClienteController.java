package Controllers;

import DAO.ClientesDAO;
import Models.Cliente;

import java.util.List;

public class ClienteController {
    private ClientesDAO dao = new ClientesDAO();

    public boolean addCliente(Cliente cliente) {
        return dao.addCliente(cliente);
    }

    public List<Cliente> getModels() {
        return dao.getClientes();
    }

    public Cliente getById(Long id) {
        return dao.getById(id);
    }
}
