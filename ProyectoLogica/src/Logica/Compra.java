package Logica;

import java.util.ArrayList;

public class Compra {

    private String fecha;
    private Cliente cliente;
    private ArrayList<Producto> productosComprados;
    private ArrayList<Integer> cantidades;
    private double totalCompra;
    private double valorApagar;

    public Compra(String fecha, Cliente cliente, ArrayList<Producto> productos, ArrayList<Integer> cantidades, double totalCompra, double valorApagar) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.productosComprados = new ArrayList<>();
        this.cantidades = new ArrayList<>();
        this.totalCompra = 0;
        this.valorApagar = 0;
    }

    public void agregarProducto(Producto producto, int cantidad){
        productosComprados.add(producto);
        cantidades.add(cantidad);
        totalCompra += producto.getPrecio()*cantidad;

        producto.disminuirCantidad(cantidad);
    }

    public void calcularValorPagar(boolean esCumpleanios){
        if(esCumpleanios){
            valorApagar = totalCompra * 0.8 ;
        }
        else{
            valorApagar = totalCompra;
        }
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Producto> getProductosComprados() {
        return productosComprados;
    }

    public void setProductosComprados(ArrayList<Producto> productosComprados) {
        this.productosComprados = productosComprados;
    }

    public double getValorApagar() {
        return valorApagar;
    }

    public void setValorApagar(double valorApagar) {
        this.valorApagar = valorApagar;
    }

    public double getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(double totalCompra) {
        this.totalCompra = totalCompra;
    }

    public ArrayList<Integer> getCantidades() {
        return cantidades;
    }

    public void setCantidades(ArrayList<Integer> cantidades) {
        this.cantidades = cantidades;
    }

    @Override
    public String toString() {
        return  "Fecha: " + fecha +
                "Cliente: " + cliente +
                "Productos Comprados: " + productosComprados +
                "Cantidades:" + cantidades +
                "Total Compra: " + totalCompra +
                "Valor A pagar: " + valorApagar ;
    }
}
