package Logica;

/**
 * Clase abstracta que representa un producto genérico en la tienda.
 * Sirve como base para productos específicos como Televisores y Proyectores.
 */
public abstract class Producto {
    /** Código único del producto */
    protected String codigo;
    /** Referencia o modelo del producto */
    protected String referencia;
    /** Marca del producto */
    protected String marca;
    /** Color del producto */
    protected String color;
    /** Resolución del dispositivo */
    protected String resolucion;
    /** Precio de venta del producto */
    protected double precio;
    /** Cantidad disponible en inventario */
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
        // Asegurar que la primera letra sea mayúscula y el resto minúsculas
        if (marca != null && !marca.isEmpty()) {
            this.marca = marca.substring(0, 1).toUpperCase() + marca.substring(1).toLowerCase();
        }
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

    @Override
    public abstract String toString();

}
