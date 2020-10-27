
package br.com.alura.loja.modelo;

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;
import java.util.Iterator;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Projeto {
   
    private String nome;
    private long id;
    private int anoDeInicio;

    public Projeto() {
    }

    public Projeto(String nome, long id, int anoDeInicio) {
        this.nome = nome;
        this.id = id;
        this.anoDeInicio = anoDeInicio;
    }

    public String getNome() {
        return nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAnoDeInicio() {
        return anoDeInicio;
    }
    
    public String toXML() {
        return new XStream().toXML(this);
    }

    public String toJson() {
        return new Gson().toJson(this);
    }
    
}
