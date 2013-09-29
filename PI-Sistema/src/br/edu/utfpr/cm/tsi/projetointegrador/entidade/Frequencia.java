/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.entidade;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author a1113836

*/
@Entity
public class Frequencia implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    
    private Aluno aluno;
    
    
    private int totalFaltas;
    
    
    
    
    
    
    
    
}
