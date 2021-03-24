package Tabla;

import Persona.Asegurado;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author HernandezMartinez
 */
public class TablaAsegurados extends AbstractTableModel {

    private String[] columnsName = {"DPI", "Nombre", "Estado", "Ultima Prima"};
    Asegurado[] seguro;

    public TablaAsegurados(Asegurado[] seguro) {
        this.seguro = seguro;
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return seguro.length;
    }

    @Override
    public int getColumnCount() {
        return columnsName.length;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public String getColumnName(int columIndex) {
        return this.columnsName[columIndex];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String valor = null;
        Asegurado seguro = this.seguro[rowIndex];

        if (seguro != null) {
            switch (columnIndex) {
                case 0:
                    valor = seguro.getDPI();
                    break;
                case 1:
                    valor = seguro.getNombre() + " " + seguro.getApellido();
                    break;
                case 2:
                    valor = seguro.getProteccion();
                    break;
                case 3:
                    valor = seguro.getUltimaPrima();
                    break;
            }
        }
        return valor;
    }

}
