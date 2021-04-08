package clases;

public class Medicos extends Personal {

    private String especialidad;
    private int cant_pacientes;

    public Medicos(int codigo, String nombre, int anioIngreso, String especialidad, int cant_pacientes) {
        super(codigo, nombre, anioIngreso);
        this.especialidad = especialidad;
        this.cant_pacientes = cant_pacientes;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getCant_pacientes() {
        return cant_pacientes;
    }

    public void setCant_pacientes(int cant_pacientes) {
        this.cant_pacientes = cant_pacientes;
    }

    public double pago() {

        if (especialidad.equals("medicina")) {

            return 20 * cant_pacientes;

        } else if (especialidad.equals("otorrino")) {

            return 25 * cant_pacientes;

        } else {

            return 30 * cant_pacientes;
        }

    }

    public double bonificacion() {

        return (2020 - super.getAnioIngreso()) / 4 * 0.08;

    }

}
