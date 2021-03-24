package Tabla;

import Persona.NoAsegurado;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author HernandezMartinez
 */
public class TablaIncidentes extends AbstractTableModel {

    private String[] columnsName = {"Código", "Nombre", "Precio"};
    NoAsegurado[] SinSeguro;

    public TablaIncidentes(NoAsegurado[] sinseguro) {
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
                    valor = String.valueOf((int) (Math.random() * 2730) + 1);
                    break;
                case 1:
                    valor = sinseguro.getNombreRepuesto();

                    break;

                case 2:
                    valor = String.valueOf(sinseguro.getPrecioRepuesto());
                    break;
            }
        }
        return valor;
    }

}
