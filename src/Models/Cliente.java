package Models;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private Long idCliente;
    private String nome;
    private List<Feedback> mensagemsFeeback = new ArrayList<>();

    public Cliente(Long id, String nome) {
        this.idCliente = id;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + idCliente +
                ", nome='" + nome + '\'' +
                ", mensagemsFeeback=" + mensagemsFeeback +
                '}';
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Feedback> getMensagemsFeeback() {
        return mensagemsFeeback;
    }

    public void setMensagemsFeeback(List<Feedback> mensagemsFeeback) {
        this.mensagemsFeeback = mensagemsFeeback;
    }
}
