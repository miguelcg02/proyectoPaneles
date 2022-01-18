
package Interfaces;
    
public class Datos { //Para los comboBox de la ventana Ver base de datos
    private String dato;

    public Datos(String dato) {
        this.dato = dato;
    }
    
    public Datos() {
        
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }
    
    @Override
    public String toString(){
        return this.dato;
    }
}
