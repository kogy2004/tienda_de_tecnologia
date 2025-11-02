package Logica;

/**
 * Clase que representa un televisor en la tienda.
 * Extiende de la clase Producto e incluye atributos específicos de televisores.
 */
public class Televisor extends Producto {

    /** Tamaño de la pantalla del televisor (rango: 10-32", 40-49", 50-59", 60-75", 76"+) */
    private String tamanioPantalla;
    /** Tipo de pantalla (LED, NanoCell, OLED, QLED, MiniLED, QNED) */
    private String tipoPantalla;
    /** Sistema operativo del Smart TV (Android TV, Google TV, Tizen, Web OS, Roku TV) */
    private String sistemaOperativo;

    public Televisor() {
    }

    public Televisor(String tamanioPantalla, String tipoPantalla, String sistemaOperativo, String codigo, String referecia, String marca, String color, String resolucion, double precio, int cantidadDisponible) {
        super(codigo, referecia, marca, color, resolucion, precio, cantidadDisponible);
        this.tamanioPantalla = tamanioPantalla;
        this.tipoPantalla = tipoPantalla;
        this.sistemaOperativo = sistemaOperativo;
    }

    

    @Override
    public String toString() {
        return  "\nCódigo: " + codigo +
                "\nReferencia: " + referencia +
                "\nMarca: " + marca +
                "\nColor: " + color +
                "\nResolución: " + resolucion +
                "\nPrecio: " + precio +
                "\nCantidad disponible: " + cantidadDisponible +
                "\nTamaño de pantalla: " + tamanioPantalla +
                "\nTipo de pantalla: " + tipoPantalla +
                "\nSistema operativo: " + sistemaOperativo;
    }

    public String getTamanioPantalla() {
        return tamanioPantalla;
    }

    public void setTamanioPantalla(String tamanioPantalla) {
        this.tamanioPantalla = tamanioPantalla;
    }

    public String getTipoPantalla() {
        return tipoPantalla;
    }

    public void setTipoPantalla(String tipoPantalla) {
        this.tipoPantalla = tipoPantalla;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }
}
