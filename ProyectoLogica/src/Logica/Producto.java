package Logica;


public abstract class Producto {
    protected String codigo;
    protected String referencia;
    protected String marca;
    protected String color;
    protected String resolucion;
    protected double precio;
    protected int cantidadDisponible;


    public Producto() {
    }

    public Producto(String codigo, String referecia, String marca, String color, String resolucion, double precio, int cantidadDisponible) {
        this.codigo = codigo;
        this.referencia = referecia;
        this.marca = marca;
        this.color = color;
        this.resolucion = resolucion;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }


    //METODOS
    public void disminuirCantidad(int cantidad){

        this.cantidadDisponible -= cantidad;
    }

    public boolean alertaBajoStock() {
        return this.cantidadDisponible < 10;
    }

}
