package desafio;

import java.sql.Date;
import java.time.LocalDate;

import javax.xml.crypto.Data;

public class Mentoria extends Conteudo {

    private LocalDate data;

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalDate getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Mentoria { " + 
        "titulo = " + getTitulo() + '\'' + 
        ", descricao = " + '\'' + getDescricao() + '\'' + 
        ", data = " + data + "}"; 
    }
    
}
