/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.DAO;

import br.edu.utfpr.cm.tsi.projetointegrador.entidade.Aluno;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Daniele
 */

    public class AlunoTable extends AbstractTableModel{
    
    private List<Aluno> linhas;
    private static final int ID = 0, NOME = 1, CPF= 2, ENDERECO = 3, NUMERO = 4, TELEFONE = 5;

    private String[] colunas = new String[] { "Código", "Nome", "CPF","Endereco", "numero","telefone"}; 
    
    public AlunoTable() {
        linhas = new ArrayList<Aluno>();
    }

    public AlunoTable(List<Aluno> lista) {
        this.linhas = new ArrayList<Aluno>(lista);
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
    case ID:
        return String.class;
    case NOME:
        return String.class;
    
    case CPF:
        return String.class;
        
    case TELEFONE:
        return String.class;
    
        case NUMERO:
        return String.class;
            
      case ENDERECO:
        return String.class;      
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
        Aluno aluno = linhas.get(rowIndex);

        switch (columnIndex) {
            case ID:
                return aluno.getId();
            case NOME:
                return aluno.getNome();
            case ENDERECO:
                return aluno.getEndereco().getNomeEndereco();                
            case CPF:
                return aluno.getCpf();
            case TELEFONE:
                return aluno.getTelefone();
            case NUMERO:
                return aluno.getEndereco().getNumero();
            default:                
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }
    
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
    // Pega o Cliente referente a linha especificada.
        Aluno aluno = linhas.get(rowIndex);

        switch (columnIndex) {
            case ID:
                aluno.setId((Integer) aValue); break;            
            case NOME:
                aluno.setNome(aValue.toString()); break; 
             case ENDERECO:
                aluno.getEndereco().setNomeEndereco(aValue.toString()); break;
            case CPF:
                aluno.setCpf(aValue.toString()); break;
            case TELEFONE:
                aluno.setTelefone(aValue.toString()); break; 
            case NUMERO:
                aluno.getEndereco().setNumero((Integer) aValue); break; 
            default:                
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
     
        
    fireTableCellUpdated(rowIndex, columnIndex); // Notifica a atualização da célula
}
    
    @Override
    public String getColumnName(int column){
        return this.colunas[column];
    }

    public Aluno getAlunoEntity(int row){
        Aluno aluno = linhas.get(row);       
        return aluno;
    }

}

	


