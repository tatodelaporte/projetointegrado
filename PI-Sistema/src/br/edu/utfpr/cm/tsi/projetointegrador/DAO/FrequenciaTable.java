/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.DAO;

import br.edu.utfpr.cm.tsi.projetointegrador.entidade.Matricula;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Daniele
 */

    public class FrequenciaTable extends AbstractTableModel{
    
    private List<Matricula> linhas;
    private static final int ALUNO = 0, SITUACAO = 1;

    private String[] colunas = new String[] { "Aluno", "Situação"}; 
    
    public FrequenciaTable() {
        linhas = new ArrayList<Matricula>();
    }

    public FrequenciaTable(List<Matricula> lista) {
        this.linhas = new ArrayList<Matricula>(lista);
    } 

    @Override
    public int getRowCount() {
        return linhas.size();
    }   

    @Override
    public int getColumnCount() {
        return colunas.length;
    }
        
    @Override
    public Class<?> getColumnClass(int columnIndex) {
    switch (columnIndex) {
    case ALUNO:
        return String.class;
    case SITUACAO:
        return Integer.class;
    
    
    default:
        throw new IndexOutOfBoundsException("columnIndex out of bounds");
    }
}
    //Celula Editavel
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
    // Pega o Cliente referente a linha especificada.
        Matricula matricula = linhas.get(rowIndex);

        switch (columnIndex) {
            case ALUNO:
                return matricula.getAluno().getNome();
            case SITUACAO:
                return matricula.getSituação();
            
            default:                
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }
    
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
    // Pega o Cliente referente a linha especificada.
        Matricula matricula = linhas.get(rowIndex);

        switch (columnIndex) {
            case ALUNO:
                matricula.getAluno().setNome(aValue.toString()); break;            
            case SITUACAO:
                matricula.setSituação((Integer)aValue); break; 
            
            default:                
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
     
        
    fireTableCellUpdated(rowIndex, columnIndex); // Notifica a atualização da célula
}
    
    @Override
    public String getColumnName(int column){
        return this.colunas[column];
    }

    public Matricula getMatriculaEntity(int row){
        Matricula matricula = linhas.get(row);       
        return matricula;
    }

}

	


