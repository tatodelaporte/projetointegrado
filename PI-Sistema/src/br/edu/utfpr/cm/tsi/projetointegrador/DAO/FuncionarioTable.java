/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.DAO;

import br.edu.utfpr.cm.tsi.projetointegrador.entidade.Funcionario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Daniel
 */
public class FuncionarioTable extends AbstractTableModel {

    private List<Funcionario> linhas;
    private static final int ID = 0, NOME = 1, CPF = 2, ENDERECO = 3, NUMERO = 4, TELEFONE = 5, TIPO=6;
    private String[] colunas = new String[]{"Código", "Nome", "CPF", "Endereco", "numero", "telefone","Cargo"};

    public FuncionarioTable() {
        linhas = new ArrayList<Funcionario>();
    }

    public FuncionarioTable(List<Funcionario> lista) {
        this.linhas = new ArrayList<Funcionario>(lista);
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
            case TIPO:
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
        // Pega o Funcionario referente a linha especificada.
        Funcionario funcionario = linhas.get(rowIndex);

        switch (columnIndex) {
            case ID:
                return funcionario.getId();
            case NOME:
                return funcionario.getNome();
            case ENDERECO:
                return funcionario.getEndereco().getNomeEndereco();
            case CPF:
                return funcionario.getCpf();
            case TELEFONE:
                return funcionario.getTelefone();
            case NUMERO:
                return funcionario.getEndereco().getNumero();
            case TIPO:
                return funcionario.getTipofuncionario();
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        // Pega o Cliente referente a linha especificada.
        Funcionario funcionario = linhas.get(rowIndex);

        switch (columnIndex) {
            case ID:
                funcionario.setId((Integer) aValue);
                break;
            case NOME:
                funcionario.setNome(aValue.toString());
                break;
            case ENDERECO:
                funcionario.getEndereco().setNomeEndereco(aValue.toString());
                break;
            case CPF:
                funcionario.setCpf(aValue.toString());
                break;
            case TELEFONE:
                funcionario.setTelefone(aValue.toString());
                break;
            case NUMERO:
                funcionario.getEndereco().setNumero((Integer) aValue);
                break;
            case TIPO:
                funcionario.getTipofuncionario();
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }


        fireTableCellUpdated(rowIndex, columnIndex); // Notifica a atualização da célula
    }

    @Override
    public String getColumnName(int column) {
        return this.colunas[column];
    }

    public Funcionario getFuncionarioEntity(int row) {
        Funcionario funcionario = linhas.get(row);
        return funcionario;
    }
}