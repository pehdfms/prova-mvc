package Models;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private Long idCliente;
    private String nome;
    private List<Feedback> mensagensFeedback = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(Long id, String nome) {
        this.idCliente = id;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente ID " + idCliente + ": " + nome + " | Feedbacks: " + mensagensFeedback;
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

    public List<Feedback> getMensagensFeedback() {
        return mensagensFeedback;
    }

    public void setMensagensFeedback(List<Feedback> mensagensFeedback) {
        this.mensagensFeedback = mensagensFeedback;
    }

    public void addFeedback(Feedback feedback) {
        this.mensagensFeedback.add(feedback);
    }
}
