/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Autor;
import model.Knjiga;
import model.Zanr;

/**
 *
 * @author Hp
 */
public class Controller {
    private List<Autor> listaAutora;
    private List<Knjiga> listaKnjiga;
    
    private static Controller instance;
    public static Controller getInstance(){
        if(instance == null)
            instance = new Controller();
        return instance;
    }

    private Controller() {
        
        Autor autor1 = new Autor("Ivo", "Andric", 1892, "Biografija autora Ive Andrica");
        Autor autor2 = new Autor("Danilo", "Kis", 1892, "Biografija autora Danila Kisa");
        Autor autor3 = new Autor("Mesa", "Selimovic", 1892, "Biografija autora Mese Selimovica");
        
        Knjiga knjiga1 = new Knjiga("Na Drini cuprija", autor1, 1945, "1234567890", Zanr.ISTORIJSKI);
        Knjiga knjiga2 = new Knjiga("Basta, pepeo", autor2, 1982, "1234567891", Zanr.ROMAN);
        Knjiga knjiga3 = new Knjiga("Tvrdjava", autor3, 1970, "1234567892", Zanr.DETEKTIVSKI);
        
        listaAutora = new ArrayList<>();
        listaKnjiga = new ArrayList<>();
        
        listaAutora.add(autor1);
        listaAutora.add(autor2);
        listaAutora.add(autor3);
                
        listaKnjiga.add(knjiga1);
        listaKnjiga.add(knjiga2);
        listaKnjiga.add(knjiga3);
        
        
    }

    public List<Autor> getListaAutora() {
        return listaAutora;
    }

    public void setListaAutora(List<Autor> listaAutora) {
        this.listaAutora = listaAutora;
    }

    public List<Knjiga> getListaKnjiga() {
        return listaKnjiga;
    }

    public void setListaKnjiga(List<Knjiga> listaKnjiga) {
        this.listaKnjiga = listaKnjiga;
    }

    public void obrisiKnjigu(int selektovanRed) {
        listaKnjiga.remove(selektovanRed);
    }

    public void dodajKnjigu(Knjiga knjiga) {
        listaKnjiga.add(knjiga);
    }

   
    
    
    
}
