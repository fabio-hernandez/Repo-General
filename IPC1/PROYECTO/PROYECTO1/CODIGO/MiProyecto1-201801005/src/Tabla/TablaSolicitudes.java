package Tabla;

import Persona.Persona;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author HernandezMartinez
 */
public class TablaSolicitudes extends AbstractTableModel {

    private String[] columnsName = {"DPI", "Nombre", "Telefóno", "Tipo", "Descripción", "Monto", "Poliza", "Deducible"};
    Persona[] solicitud;

    public TablaSolicitudes(Persona[] solicitud) {
        this.solicitud = solicitud;
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return solicitud.length;
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
        Persona solicitud = this.solicitud[rowIndex];
        if (solicitud != null && !solicitud.isEstado()) {
            switch (columnIndex) {
                case 0:
                    valor = solicitud.getDPI();
                    break;
                case 1:
                    valor = solicitud.getNombre();
                    break;
                case 2:
                    valor = solicitud.getTelefono();
                    break;
                case 3:
                    valor = "AUTOMAS";

                    break;
                case 4:
                    valor = solicitud.getTipodeVehículo()+ ", " + solicitud.getModelo()
                            + ", " + solicitud.getMarca() + ", " + solicitud.getLinea()
                            + ", " + solicitud.getUsoVehiculo();

                    break;
                case 5:
                    valor = solicitud.getValorVehiculo();
                    break;
                case 6:
                    valor = solicitud.getCostoPrima();
                    break;
                case 7:
                    valor = solicitud.getDeducible();
                    break;
            }
        }
        return valor;
    }

}
