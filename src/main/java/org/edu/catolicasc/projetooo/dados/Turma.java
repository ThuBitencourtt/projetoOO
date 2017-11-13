package org.edu.catolicasc.projetooo.dados;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Objects;
import java.util.logging.Logger;

/**
 * Representa uma turma
 * @author thuani.bittencourtt
 */
public class Turma {
    private String curso;
    private int ano;
    private int semestre;
    private HashMap<String, Aluno> alunos = new HashMap<>();
    private static final Logger LOG = Logger.getLogger(Turma.class.getName());

    public Turma() {
    }

    public Turma(String curso, int ano, int semestre) {
        this.curso = curso;
        this.ano = ano;
        this.semestre = semestre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public HashMap<String,Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(HashMap<String,Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.curso);
        hash = 79 * hash + this.ano;
        hash = 79 * hash + this.semestre;
        hash = 79 * hash + Objects.hashCode(this.alunos);
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
        final Turma other = (Turma) obj;
        if (this.ano != other.ano) {
            return false;
        }
        if (this.semestre != other.semestre) {
            return false;
        }
        if (!Objects.equals(this.curso, other.curso)) {
            return false;
        }
        if (!Objects.equals(this.alunos, other.alunos)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Turma{" + "curso=" + curso + ", ano=" + ano + ", semestre=" + semestre + ", alunos=" + alunos + '}';
    }
    
    public void incluirAluno( Aluno aluno ) {
        this.alunos.put(aluno.getMatricula(), aluno);
    }
    
    public Aluno procurarAluno( String matricula ) {
        return alunos.get(matricula);
    }
    
    public boolean excluirAluno(Aluno a) {
        return alunos.remove(a.getMatricula(), a);
    }
    
    public LinkedList<Aluno> getAlunosParaGravarNoDisco() {
        LinkedList<Aluno> values = new LinkedList<Aluno>(alunos.values());
        return values;
    }
    
    public void gravarAlunos() {
        LinkedList<Aluno> values = getAlunosParaGravarNoDisco();
        // fazer a lógica para gravasr os dados da lista no disco
    }
    
    public void lerAlunosDoDisco() {
        LinkedList<Aluno> values;
        // fazer a lógica para ler os dados do disco
        setAlunosLidosDoDisco(null); // deveria passar values
    }
    
    public void setAlunosLidosDoDisco(LinkedList<Aluno> values) {
        for (Aluno value : values) {
            alunos.put(value.getMatricula(), value);
        }
    }
    
    
}
