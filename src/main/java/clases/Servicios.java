package clases;

public class Servicios extends Personal {

    private String servicio;
    private int cant_horas;

    public Servicios(int codigo, String nombre, int anioIngreso, String servicio, int cant_horas) {
        super(codigo, nombre, anioIngreso);
        this.servicio = servicio;
        this.cant_horas = cant_horas;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public int getCant_horas() {
        return cant_horas;
    }

    public void setCant_horas(int cant_horas) {
        this.cant_horas = cant_horas;
    }

    public double pago() {

        if (servicio.equals("rayos")) {

            return cant_horas * 22;

        } else {

            return cant_horas * 18;
        }

    }

}
