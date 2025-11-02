package Logica;

import java.util.ArrayList;

public class Tienda {

    private ArrayList<Producto> productos;
    private ArrayList<Cliente> clientes;
    private ArrayList<Compra> compras;

    public Tienda() {
        productos = new ArrayList<>();
        clientes = new ArrayList<>();
        compras = new ArrayList<>();
    }

    //Registrar datos en los diferentes ArrayList
    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void registrarProducto(Producto producto) {
        productos.add(producto);
    }

    public void registrarCompra(Compra compra) {
        compras.add(compra);
    }


    //Métodos para contar los productos por tipo
    public int cantidadTotalProductos() {
        return productos.size();
    }

    public int cantidadTelevisores() {
        int count = 0;
        for (Producto p : productos) {
            if (p instanceof Televisor) {
                count++;
            }
        }
        return count;
    }

    public int cantidadProyectores() {
        int count = 0;
        for (Producto p : productos) {
            if (p instanceof Proyector) {
                count++;
            }
        }
        return count;
    }


    public double promedioPorMarca(String marca) {
        System.out.println("Calculando promedio para marca: " + marca); // Debug
        double suma = 0;
        int contador = 0;
        for (Producto p : productos) {
            System.out.println("Producto encontrado - Marca: " + p.getMarca()); // Debug
            if (p.getMarca() != null && marca != null && 
                p.getMarca().trim().equalsIgnoreCase(marca.trim())) {
                suma += p.getPrecio();
                contador++;
                System.out.println("Coincidencia encontrada - Precio: " + p.getPrecio()); // Debug
            }
        }
        System.out.println("Total productos de la marca: " + contador); // Debug
        if (contador == 0) {
            return 0;
        }
        double promedio = suma / contador;
        System.out.println("Promedio calculado: " + promedio); // Debug
        return promedio;
    }

    public double porcentajeTelevisores() {
        if (productos.isEmpty()) return 0;
        int totalTelevisores = 0;
        for (Producto p : productos) {
            if (p instanceof Televisor) {
                totalTelevisores++;
            }
        }
        return (totalTelevisores * 100.0) / productos.size();
    }

    public int totalUnidadesDisponibles() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidadDisponible();
        }
        return total;
    }

    public ArrayList<Producto> productosConMayorPrecio() {
        ArrayList<Producto> maximos = new ArrayList<>();
        double maxPrecio = 0;

        for (Producto p : productos) {
            if (p.getPrecio() > maxPrecio) {
                maxPrecio = p.getPrecio();
                maximos.clear();
                maximos.add(p);
            } else if (p.getPrecio() == maxPrecio) {
                maximos.add(p);
            }
        }
        return maximos;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public ArrayList<Compra> getCompras() {
        return compras;
    }

    public ArrayList<Producto> getProductosBajoStock() {
        ArrayList<Producto> bajoStock = new ArrayList<>();
        for (Producto p : productos) {
            if (p.alertaBajoStock()) {
                bajoStock.add(p);
            }
        }
        return bajoStock;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void setCompras(ArrayList<Compra> compras) {
        this.compras = compras;
    }
    
    
}
