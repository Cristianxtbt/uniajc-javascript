public class Pelicula {
    private String nombre;
    private String idioma;
    private String formato;
    private int duracion;


    //CONSTRUCTOR
    public Pelicula(String nombre, String idioma, String formato, int duracion) {
        this.nombre = nombre;
        this.idioma = idioma;
        this.formato = formato;
        this.duracion = duracion;
    }

    //METODOS GET
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre    ;
    }

    public String getIdioma() {
        return idioma   ;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato  ;
    }

    public int getDuracion() {
        return duracion ;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion    ;
    }

    //OVERRIDE DE METODO TOSTRING
    @Override
    public String toString() {
        return "Pelicula{" +
                "nombre='" + nombre + '\'' +
                ", idioma='" + idioma + '\'' +
                ", formato='" + formato + '\'' +
                ", duracion=" + duracion +
                '}';
}
}