package Logica;

public class Proyector extends Producto{

    private String tipoUso;
    private String tecnologiaVisualizacion;

    public Proyector() {
    }

    public Proyector(String codigo, String referecia, String marca, String color, String resolucion, double precio, int cantidadDisponible, String tipoDeUso, String tecnologiaVisualizacion) {
        super(codigo, referecia, marca, color, resolucion, precio, cantidadDisponible);
        this.tipoUso = tipoDeUso;
        this.tecnologiaVisualizacion = tecnologiaVisualizacion;
    }

    @Override
    public String toString() {
        return  "\nCódigo: " + codigo +
                "\nReferencia: " + referencia +
                "\nMarca: " + marca +
                "\nColor: " + color +
                "\nResolución: " + resolucion +
                "\nPrecio=: " + precio+
                "\nCantidad disponible: "+ cantidadDisponible+
                "\nTipo de uso: " + tipoUso +
                "\nTecnología de visualización: " + tecnologiaVisualizacion;
    }

    public String getTipoUso() {
        return tipoUso;
    }

    public void setTipoUso(String tipoUso) {
        this.tipoUso = tipoUso;
    }

    public String getTecnologiaVisualizacion() {
        return tecnologiaVisualizacion;
    }

    public void setTecnologiaVisualizacion(String tecnologiaVisualizacion) {
        this.tecnologiaVisualizacion = tecnologiaVisualizacion;
    }
}
