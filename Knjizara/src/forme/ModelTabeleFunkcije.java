/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forme;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Knjiga;

/**
 *
 * @author Hp
 */
public class ModelTabeleFunkcije extends AbstractTableModel {
    
    private List<Knjiga> listaKnjige;
    private final String[] kolone = {"Naslov", "Autor", "ISBN", "Godina izdanja"};

    public ModelTabeleFunkcije(List<Knjiga> listaKnjige) {
        this.listaKnjige = listaKnjige;
    }
    
    

    @Override
    public int getRowCount() {
        return listaKnjige.size();
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Knjiga knjiga = listaKnjige.get(rowIndex);
        
        switch(columnIndex){
            case 0:
                return knjiga.getNaslov();
            case 1:
                return knjiga.getAutor().getIme()+ " " + knjiga.getAutor().getPrezime();
            case 2:
                return knjiga.getISBN();
            case 3:
                return knjiga.getGodinaIzdanja();
            default:
                return null;
        
        }
    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }

    void osveziTabelu() {
        fireTableDataChanged();
    }
    
    
    
}
