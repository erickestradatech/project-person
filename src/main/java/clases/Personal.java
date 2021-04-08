package clases;

public abstract class Personal {

    private int codigo;
    private String nombre;
    private int anioIngreso;

    public Personal(int codigo, String nombre, int anioIngreso) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.anioIngreso = anioIngreso;
    }

    public abstract double pago();

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

}
