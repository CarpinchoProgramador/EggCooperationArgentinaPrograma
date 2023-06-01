package ejercicio3guia11extrasaseguradoradeautos;

public class Cuota {
    
    private int cantCuota;
    private int cuotaActual;
    private double montoTotalCuota;
    private boolean cuotaPagada;
    private int fechaVencimiento;
    private String formaPago;
    private Poliza poliza;

    public Cuota() {
    }

    public Cuota(int cantCuota, int cuotaActual, double montoTotalCuota, boolean cuotaPagada, int fechaVencimiento, String formaPago, Poliza poliza) {
        this.cantCuota = cantCuota;
        this.cuotaActual = cuotaActual;
        this.montoTotalCuota = montoTotalCuota;
        this.cuotaPagada = cuotaPagada;
        this.fechaVencimiento = fechaVencimiento;
        this.formaPago = formaPago;
        this.poliza = poliza;
    }

    public int getCantCuota() {
        return cantCuota;
    }

    public void setCantCuota(int cantCuota) {
        this.cantCuota = cantCuota;
    }

    public int getCuotaActual() {
        return cuotaActual;
    }

    public void setCuotaActual(int cuotaActual) {
        this.cuotaActual = cuotaActual;
    }

    public double getMontoTotalCuota() {
        return montoTotalCuota;
    }

    public void setMontoTotalCuota(double montoTotalCuota) {
        this.montoTotalCuota = montoTotalCuota;
    }

    public boolean isCuotaPagada() {
        return cuotaPagada;
    }

    public void setCuotaPagada(boolean cuotaPagada) {
        this.cuotaPagada = cuotaPagada;
    }

    public int getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(int fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public Poliza getPoliza() {
        return poliza;
    }

    public void setPoliza(Poliza poliza) {
        this.poliza = poliza;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
