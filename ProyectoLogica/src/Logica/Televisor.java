package Logica;

public class Televisor extends Producto {

    private String tamanioPantalla;
    private String tipoPantalla;
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
