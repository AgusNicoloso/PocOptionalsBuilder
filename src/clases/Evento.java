package clases;

public class Evento {

    private int id;
    private String nombre;
    private Location location;

    public Evento() {

    }

    public Evento(int id, String nombre, Location location) {
        this.id = id;
        this.nombre = nombre;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "\nId Evento= " + id
                + "\nNombre Evento='" + nombre + '\''
                + ", \n" + location;
    }
}
