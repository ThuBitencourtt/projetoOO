package org.edu.catolicasc.projetooo.dados;

import java.util.Objects;
import java.util.logging.Logger;

/**
 * Representa um aluno
 * @author thuani.bittencourtt
 */
public class Aluno {
    private String matricula;
    private String nome;
    private String fone;
    private static final Logger LOG = Logger.getLogger(Aluno.class.getName());

    public Aluno() {
        LOG.fine("Criando um aluno vazio");
    }

    public Aluno(String matricula, String nome, String fone) {
        LOG.fine("Criando um aluno com dados " + matricula);
        this.matricula = matricula;
        this.nome = nome;
        this.fone = fone;
    }
    
    

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.matricula);
        hash = 29 * hash + Objects.hashCode(this.nome);
        hash = 29 * hash + Objects.hashCode(this.fone);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.fone, other.fone)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", nome=" + nome + ", fone=" + fone + '}';
    }
    
    
}
