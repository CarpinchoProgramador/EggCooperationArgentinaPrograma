package ejerciciopracticaherencia;

public class Empleado extends Persona{
    int legajo;
    String empresa;
    double salario;

    public Empleado() {
    }

    public Empleado(int legajo, String empresa, double salario, int id, String dni, String nombre, String apellido, String domicilio, String telefono) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.legajo = legajo;
        this.empresa = empresa;
        this.salario = salario;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
}
