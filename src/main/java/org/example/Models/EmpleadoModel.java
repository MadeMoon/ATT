package org.example.Models;

public class EmpleadoModel {
    private int noEmpleado;
    private String nombresEmpleado;
    private String apellidosEmpleado;
    private int dpiEmpleado;
    private int telefonoEmpleado;
    private String correoEmpleado;
    private int nitEmpleado;
    private String direccionEmpleado;
    private int igssEmpleado;
    private int irtraEmpleado;

    public EmpleadoModel() {
    }

    public EmpleadoModel(int _noEmpleado,
                         String _nombresEmpleado,
                         String _apellidosEmpleado,
                         int _dpiEmpleado,
                         int _telefonoEmpleado,
                         String _correoEmpleado,
                         int _nitEmpleado,
                         String _direccionEmpleado,
                         int _igssEmpleado,
                         int _irtraEmpleado) {
        this.noEmpleado = _noEmpleado;
        this.nombresEmpleado = _nombresEmpleado;
        this.apellidosEmpleado = _apellidosEmpleado;
        this.dpiEmpleado = _dpiEmpleado;
        this.telefonoEmpleado = _telefonoEmpleado;
        this.correoEmpleado = _correoEmpleado;
        this.nitEmpleado = _nitEmpleado;
        this.direccionEmpleado = _direccionEmpleado;
        this.igssEmpleado = _igssEmpleado;
        this.irtraEmpleado = _irtraEmpleado;
    }

    public int getNoEmpleado() {
        return noEmpleado;
    }
    public String getNombresEmpleado() {
        return nombresEmpleado;
    }
    public String getApellidosEmpleado() {
        return apellidosEmpleado;
    }
    public int getDpiEmpleado() {
        return dpiEmpleado;
    }
    public int getTelefonoEmpleado() {
        return telefonoEmpleado;
    }
    public String getCorreoEmpleado() {
        return correoEmpleado;
    }
    public int getNitEmpleado() {
        return nitEmpleado;
    }
    public String getDireccionEmpleado() {
        return direccionEmpleado;
    }
    public int getIgssEmpleado() {
        return igssEmpleado;
    }
    public int getIrtraEmpleado() {
        return irtraEmpleado;
    }

    public void setNoEmpleado(int noEmpleado) {
        this.noEmpleado = noEmpleado;
    }
    public void setNombresEmpleado(String nombresEmpleado) {
        this.nombresEmpleado = nombresEmpleado;
    }
    public void setApellidosEmpleado(String apellidosEmpleado) {
        this.apellidosEmpleado = apellidosEmpleado;
    }
    public void setDpiEmpleado(int dpiEmpleado) {
        this.dpiEmpleado = dpiEmpleado;
    }
    public void setTelefonoEmpleado(int telefonoEmpleado) {
        this.telefonoEmpleado = telefonoEmpleado;
    }
    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }
    public void setNitEmpleado(int nitEmpleado) {
        this.nitEmpleado = nitEmpleado;
    }
    public void setDireccionEmpleado(String direccionEmpleado) {
        this.direccionEmpleado = direccionEmpleado;
    }
    public void setIgssEmpleado(int igssEmpleado) {
        this.igssEmpleado = igssEmpleado;
    }
    public void setIrtraEmpleado(int irtraEmpleado) {
        this.irtraEmpleado = irtraEmpleado;
    }

    @Override
    public String toString(){
        return "No. Empleado: " + noEmpleado +
                " |Nombres: " + nombresEmpleado +
                " |Apellidos: " + apellidosEmpleado +
                " |DPI: " + dpiEmpleado +
                " |Teléfono: " + telefonoEmpleado +
                " |Correo electronico: " + correoEmpleado +
                " |NIT: " + nitEmpleado +
                " |Dirección: " + direccionEmpleado +
                " |IGSS: " + igssEmpleado +
                " |IRTRA: " + irtraEmpleado;
    }

}
