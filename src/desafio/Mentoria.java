package desafio;

import java.sql.Date;
import java.time.LocalDate;

import javax.xml.crypto.Data;

public class Mentoria {
    private String titulo;
    private String descricao;
    private LocalDate data;

    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }


    @Override
    public String toString() {
        return "Mentoria [titulo=" + titulo + ", descricao=" + descricao + ", cargaHoraria=" + data + "]";
    }

    
}
