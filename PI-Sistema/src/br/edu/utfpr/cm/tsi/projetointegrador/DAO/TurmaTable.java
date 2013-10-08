/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.DAO;

import br.edu.utfpr.cm.tsi.projetointegrador.entidade.Aluno;
import br.edu.utfpr.cm.tsi.projetointegrador.entidade.Turma;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Daniel
 */
public class TurmaTable extends AbstractTableModel {

    private List<Turma> linhas;
    private static final int ID = 0, DESCRICAO = 1, PISCINA = 2, FUNCIONARIO = 3;
    private String[] colunas = new String[]{"Código", "Descrição", "Piscina", "Professor"};

    public TurmaTable() {
        linhas = new ArrayList<Turma>();
    }

    public TurmaTable(List<Turma> lista) {
        this.linhas = new ArrayList<Turma>(lista);
    }

    @Override
    public int getRowCount() {
        return linhas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case ID:
                return String.class;
            case DESCRICAO:
                return String.class;

            case PISCINA:
                return String.class;

            case FUNCIONARIO:
                return String.class;

            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // Pega A TURMA referente a linha especificada.
        Turma turma = linhas.get(rowIndex);

        switch (columnIndex) {
            case ID:
                return turma.getId();
            case DESCRICAO:
                return turma.getDescricao();
            case PISCINA:
                return turma.getPiscina().getDescricao();
            case FUNCIONARIO:
                return turma.getProfessor().getNome();

            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        // Pega a Turma referente a linha especificada.
        Turma turma = linhas.get(rowIndex);

        switch (columnIndex) {
            case ID:
                turma.setId((Integer) aValue);
                break;
            case DESCRICAO:
                turma.setDescricao(aValue.toString());
                break;
            case PISCINA:
                turma.getPiscina().setDescricao(aValue.toString());
                break;
            case FUNCIONARIO:
                turma.getProfessor().setNome(aValue.toString());

                break;
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }


        fireTableCellUpdated(rowIndex, columnIndex); // Notifica a atualização da célula
    }

    @Override
    public String getColumnName(int column) {
        return this.colunas[column];
    }

    public Turma getTurmaEntity(int row) {
        Turma turma = linhas.get(row);
        return turma;
    }
}
