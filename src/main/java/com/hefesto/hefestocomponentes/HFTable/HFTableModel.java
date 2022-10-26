package com.hefesto.hefestocomponentes.HFTable;

//import HFComponents.HFAnnotation.nomeColuna;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.TableModelEvent;
import javax.swing.table.AbstractTableModel;

/**
 * Implementação de Table Model para exibir os Sócios.
 *
 * @author Eric Yuzo
 */
public class HFTableModel extends AbstractTableModel {

    /* Lista de Sócios que representam as linhas. */
    private List<List<Object>> linhas;

    /* Array de Strings com o nome das colunas. */
    private String[] colunas;
    private Class[] Classecolunas;
    private List<Integer> celleditable = new ArrayList<>();

    /* Cria um SocioTableModel vazio. */
    public HFTableModel(Class colunas) {
        linhas = new ArrayList<>();
        celleditable = new ArrayList<>();
        montaColunas(colunas);
    }

    public HFTableModel(String[] colunas) {
        this.colunas = colunas;
        linhas = new ArrayList<>();
        this.Classecolunas = new Class[colunas.length];
        for (int i = 0; i < Classecolunas.length; i++) {
            Classecolunas[i] = Object.class;
        }
        fireTableChanged(new TableModelEvent(this));
        fireTableStructureChanged();
        fireTableDataChanged();
    }

    public Object getValues(int rowIndex) {
        return linhas.get(rowIndex);
    }

    private void montaColunas(Class colunas) {
        Field[] f = colunas.getDeclaredFields();
        List<String> tempcolu = new ArrayList<>();
        List<Class> tempClass = new ArrayList<>();
        for (int i = 0; i < f.length; i++) {
            //        nomeColuna nome = f[i].getAnnotation(nomeColuna.class);
//            if (nome != null) {
//                tempcolu.add(nome.nome());
//            } else {
            tempcolu.add(f[i].getName());
//            }
            tempClass.add(f[i].getType());
        }
        tempcolu.add("Objeto");
        tempClass.add(Object.class);
        this.colunas = tempcolu.toArray(new String[tempcolu.size()]);
        this.Classecolunas = tempClass.toArray(new Class[tempClass.size()]);
    }

    /* Cria um SocioTableModel carregado com
     * a lista de sócios especificada. */
//    public HFTableModel(List<List<?>> list) {
//        linhas = new ArrayList<>(list.toArray());
//    }
    /* Retorna a quantidade de colunas. */
    @Override
    public int getColumnCount() {
        // Está retornando o tamanho do array "colunas".
        // Mas como o array é fixo, vai sempre retornar 4.
        return colunas.length;
    }

    /* Retorna a quantidade de linhas. */
    @Override
    public int getRowCount() {
        // Retorna o tamanho da lista de sócios.
        return linhas.size();
    }

    /* Retorna o nome da coluna no índice especificado.
     * Este método é usado pela JTable para saber o texto do cabeçalho. */
    @Override
    public String getColumnName(int columnIndex) {
        // Retorna o conteúdo do Array que possui o nome das colunas
        // no índice especificado.
        return colunas[columnIndex];
    }

    public void setCellColumnditable(int Column, boolean editable) {
        if (editable) {
            celleditable.add(Column);
        } else {
            celleditable.remove(Column);
        }
    }

    /* Retorna a classe dos elementos da coluna especificada.
     * Este método é usado pela JTable na hora de definir o editor da célula. */
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        // Retorna a classe referente a coluna especificada.
        // Aqui é feito um switch para verificar qual é a coluna
        // e retornar o tipo adequado. As colunas são as mesmas
        // que foram especificadas no array "colunas".
//        switch (columnIndex) {
//            case 0: // Primeira coluna é o nome, que é uma String.
//                return String.class;
//            case 1: // Segunda coluna é o telefone, que também é uma String..
//                return String.class;
//            case 2: // Terceira coluna é a data de cadastro,
        // apesar de ser do tipo Calendar,
        // estou retornando Date por causa da formatação.
//                return Date.class;
//            case 3: // Quarta coluna é a mensalidade, um double.
//                return Double.class;
//            default:
        // Se o índice da coluna não for válido, lança um
        // IndexOutOfBoundsException (Exceção de índice fora dos limites).
        // Não foi necessário verificar se o índice da linha é inválido,
        // pois o próprio ArrayList lança a exceção caso seja inválido.
//                throw new IndexOutOfBoundsException("columnIndex out of bounds");

        return Classecolunas[columnIndex];
    }

    public void setColumnClass(Class<?> classe, int columnIdx) {
        Classecolunas[columnIdx] = classe;
    }

    /* Retorna o valor da célula especificada
     * pelos índices da linha e da coluna. */
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // Pega o sócio da linha especificada.

        try {
            // Retorna o campo referente a coluna especificada.
            // Aqui é feito um switch para verificar qual é a coluna
            // e retornar o campo adequado. As colunas são as mesmas
            // que foram especificadas no array "colunas".
//        switch (columnIndex) {
//            case 0: // Primeira coluna é o nome.
//                return socio.getNome();
//            case 1: // Segunda coluna é o telefone.
//                return socio.getTelefone();
//            case 2: // Terceira coluna é a data de cadastro.
//                return socio.getDataDeCadastro().getTime();
//            case 3: // Quarta coluna é a mensalidade.
//                return socio.getMensalidade();
//            default:
            // Se o índice da coluna não for válido, lança um
            // IndexOutOfBoundsException (Exceção de índice fora dos limites).
            // Não foi necessário verificar se o índice da linha é inválido,
            // pois o próprio ArrayList lança a exceção caso seja inválido.

            return linhas.get(rowIndex).get(columnIndex) != null ? linhas.get(rowIndex).get(columnIndex) : "";

        } catch (Exception ex) {
            throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    /* Seta o valor da célula especificada
     * pelos índices da linha e da coluna.
     * Aqui ele está implementado para não fazer nada,
     * até porque este table model não é editável. */
    @Override
    public void setValueAt(Object value, int rowIndex, int columnIndex) {
        linhas.get(rowIndex).set(columnIndex, value);
    }

    /* Retorna um valor booleano que define se a célula em questão
     * pode ser editada ou não.
     * Este método é utilizado pela JTable na hora de definir o editor da célula.
     * Neste caso, estará sempre retornando false, não permitindo que nenhuma
     * célula seja editada. */
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        if (celleditable.size() == 0) {
            return false;
        } else {
            for (Integer column : celleditable) {
                if (column == columnIndex) {
                    return true;
                }
            }
        }
        return false;
    }

    ////////////////////////////////////////////////////////////
    // Os métodos declarados até aqui foram as implementações //
    // de TableModel, que são continuamente utilizados        //
    // pela JTable para definir seu comportamento,            //
    // por isso o nome Table Model (Modelo da Tabela).        //
    //                                                        //
    // A partir de agora, os métodos criados serão            //
    // particulares desta classe. Eles serão úteis            //
    // em algumas situações.                                  //
    ////////////////////////////////////////////////////////////
    /* Retorna o sócio da linha especificada. */
    /* Adiciona um registro. */
    public void add(List<?> list) {
        // Adiciona o registro.
        linhas.add((List<Object>) list);
        int contclass = 0;
        for (Object ob : list) {
            if (contclass < Classecolunas.length) {
                if (ob == null) {
                    Classecolunas[contclass] = String.class;
                } else {
                    Classecolunas[contclass] = ob.getClass();
                }
                contclass++;
            }
        }
        // Pega a quantidade de registros e subtrai um para achar
        // o último índice. É preciso subtrair um, pois os índices
        // começam pelo zero.
        int ultimoIndice = getRowCount() - 1;

        // Reporta a mudança. O JTable recebe a notificação
        // e se redesenha permitindo que visualizemos a atualização.
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }

    public void removeTable() {
        if (!linhas.isEmpty()) {
            int lastsize = linhas.size() - 1;
            linhas = new ArrayList<>();
            fireTableRowsDeleted(0, lastsize);
        }
    }

    /* Remove a linha especificada. */
    public void removeRow(int indiceLinha) {
        // Remove o sócio da linha especificada.    	
        linhas.remove(indiceLinha);

        // Reporta a mudança. O JTable recebe a notificação
        // e se redesenha permitindo que visualizemos a atualização.
        fireTableRowsDeleted(indiceLinha, indiceLinha);
    }

    /* Adiciona uma lista de sócios ao final dos registros. */
    public void addListaDeObjeto(List<?> list) {
        if (list.size() > 0) {
            int contclass = 0;
            int tamanhoAntigo = getRowCount();
            List<Object> listaClass = (List<Object>) list.get(0);

            for (Object ob : listaClass) {
                if (contclass < Classecolunas.length) {
                    if (ob == null) {
                        Classecolunas[contclass] = String.class;
                    } else {
                        Classecolunas[contclass] = ob.getClass();
                    }
                    contclass++;
                }
            }

            for (Object l : list) {
                this.add(((List<?>) l));
            }

            // Pega o tamanho antigo da tabela.
            // Adiciona os registros.
//        linhas.addAll(ob);
            // Reporta a mudança. O JTable recebe a notificação
            // e se redesenha permitindo que visualizemos a atualização.
            fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
        }
    }

    /* Remove todos os registros. */
    public void limpar() {
        // Remove todos os elementos da lista de sócios.
        linhas.clear();

        // Reporta a mudança. O JTable recebe a notificação
        // e se redesenha permitindo que visualizemos a atualização.
        fireTableDataChanged();
    }

    /* Verifica se este table model está vazio. */
    public boolean isEmpty() {
        return linhas.isEmpty();
    }

    public List<Object> getRow(int r) {
        return linhas.get(r);
    }

    public List<List<Object>> getAllRows() {
        return linhas;
    }

    public Object[][] getMatrix() {
        Object[][] matriz = new Object[linhas.size()][linhas.get(0).size()];
        Integer i = 0, j = 0;

        for (List<Object> linha : linhas) {
            j = 0;
            for (Object coluna : (List<Object>) linha) {
                matriz[i][j] = coluna;
                j++;
            }
            i++;
        }
        return matriz;
    }

    public String[] getAllColumnNames() {
        return colunas;
    }

    public void deleteValueAT(int linha, int coluna) {
        linhas.get(linha).set(coluna, "");
    }

}
