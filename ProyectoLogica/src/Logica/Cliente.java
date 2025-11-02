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
            java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd/MM/yyyy");
            java.util.Date fechaNac = sdf.parse(this.fechaNacimiento);
            java.util.Date fechaAct = sdf.parse(fechaActual);
            
            java.util.Calendar calNac = java.util.Calendar.getInstance();
            java.util.Calendar calAct = java.util.Calendar.getInstance();
            
            calNac.setTime(fechaNac);
            calAct.setTime(fechaAct);
            
            // Comparamos solo el día y el mes
            return calNac.get(java.util.Calendar.DAY_OF_MONTH) == calAct.get(java.util.Calendar.DAY_OF_MONTH) && 
                   calNac.get(java.util.Calendar.MONTH) == calAct.get(java.util.Calendar.MONTH);
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
