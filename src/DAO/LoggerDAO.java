package DAO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LoggerDAO {
    private String filename;

    public LoggerDAO() {
        this.filename = "log.txt";
    }

    public LoggerDAO(String filename) {
        this.filename = filename;
    }

    public void addMensagem(String mensagem) {
        try (FileWriter fw = new FileWriter(filename, true);
                BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(mensagem);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Nao foi possivel salvar log no arquivo.");
        }
    }
}
