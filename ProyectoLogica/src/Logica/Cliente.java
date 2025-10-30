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
    
    public boolean esCumpleanios(String fechaActual) {
        try {
            // La fecha debe estar en formato DD/MM/YY
            String[] partesNacimiento = this.fechaNacimiento.split("/");
            String[] partesActual = fechaActual.split("/");
            
            // Comparamos solo el día y el mes
            return partesNacimiento[0].equals(partesActual[0]) && 
                   partesNacimiento[1].equals(partesActual[1]);
        } catch (Exception e) {
            // Si hay algún error en el formato de las fechas, retornamos falso
            return false;
        }
    }

    @Override
    public String toString() {
        return  "\nDocumento= " + documento +
                "\nNombre= " + nombre +
                "\nFecha Nacimiento= " + fechaNacimiento;
    }
}
