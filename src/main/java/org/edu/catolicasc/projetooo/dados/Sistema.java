/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.edu.catolicasc.projetooo.dados;

import java.util.logging.Logger;

/**
 * Classe que usa o padrão Singleton para controlar todas classes do sistema
 * @author thuani.bittencourtt
 */
public class Sistema {
    
    // se for ter varias turmas vai ter que mexer aqui...
    
    private static Sistema instance;
    private Turma   turma = new Turma();

    private static final Logger LOG = Logger.getLogger(Sistema.class.getName());

    private Sistema() {
        turma.setAno(2017);
        turma.setSemestre(1);
        turma.setCurso("Engenharia de Software");
    }

    public Turma getTurma() {
        return turma;
    }
    
    public static final Sistema getInstance() {
        if( instance == null ) {
            instance = new Sistema();
        }
        return instance;
    }
    
    
}
