package Logica;

public class Cliente {

    private String documento ;
    private String nombre;
    private String fechaNacimiento;

    public Cliente(String documento, String nombre, String fechaNacimiento) {
        this.documento = documento;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return  "Documento= " + documento +
                "Nombre= " + nombre +
                "FechaNacimiento= " + fechaNacimiento;
    }
}
