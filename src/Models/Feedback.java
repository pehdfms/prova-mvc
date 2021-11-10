package Models;

public class Feedback {
    private Long idFeedback;
    private String mensagem;

    public Feedback(Long idFeedback, String mensagem) {
        this.idFeedback = idFeedback;
        this.mensagem = mensagem;
    }

    @Override
    public String toString() {
        return mensagem;
    }

    public Long getIdFeedback() {
        return idFeedback;
    }

    public void setIdFeedback(Long idFeedback) {
        this.idFeedback = idFeedback;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
