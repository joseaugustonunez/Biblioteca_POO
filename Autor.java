package Tarea;

public class Autor {

    private String nombreAutor;
    private String apellidoAutor;

    public Autor(String nombreAutor, String apellidoAutor) {
        this.nombreAutor = nombreAutor;
        this.apellidoAutor = apellidoAutor;
    }
    public String getNombres() {
        return nombreAutor;
    }

    public void setNombres(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }
    public String getApellidos() {
        return apellidoAutor;
    }
    public void setApellidos(String apellidoAutor) {
        this.apellidoAutor = apellidoAutor;
    }
}
