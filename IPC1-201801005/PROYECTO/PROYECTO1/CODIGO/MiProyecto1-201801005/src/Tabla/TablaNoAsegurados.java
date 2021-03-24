package Tabla;

import Persona.NoAsegurado;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author HernandezMartinez
 */
public class TablaNoAsegurados extends AbstractTableModel {

    private String[] columnsName = {"DPI", "Nombre", "Teléfono"};
    NoAsegurado[] SinSeguro;

    public TablaNoAsegurados(NoAsegurado[] sinseguro) {
        this.SinSeguro = sinseguro;
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return SinSeguro.length;
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
        NoAsegurado sinseguro = this.SinSeguro[rowIndex];

        if (sinseguro != null) {
            switch (columnIndex) {
                case 0:
                    valor = sinseguro.getDPI();
                    break;
                case 1:
                    valor = sinseguro.getNombre() + " " + sinseguro.getApellido();
                    break;
                case 2:
                    valor = sinseguro.getTelefono();
                    break;
            }
        }
        return valor;
    }

}
