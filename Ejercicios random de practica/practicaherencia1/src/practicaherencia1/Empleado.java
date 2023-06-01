package practicaherencia1;

public class Empleado extends Persona {

    double sueldo;
    String empresa, cargo;
    int numLegajo;

    public Empleado() {
    }

    public Empleado(double sueldo, String empresa, String cargo, int numLegajo, long dni, String nombre, String apellido, String domicilio, int telefono) {
        super(dni, nombre, apellido, domicilio, telefono);
        this.sueldo = sueldo;
        this.empresa = empresa;
        this.cargo = cargo;
        this.numLegajo = numLegajo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getNumLegajo() {
        return numLegajo;
    }

    public void setNumLegajo(int numLegajo) {
        this.numLegajo = numLegajo;
    }

   

}
