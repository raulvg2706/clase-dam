public class Alumno {
    
    // el nombre completo del alumno
    private String nombre;
    // el numero de matricula
    private String numeroMatricula;
    // la edad del alumno
    private int edad;

    /**
     * Crea un alumno nuevo
     */
    public Alumno(String nombreCompleto, String numeroMatriculaAlumno, int edadAlumno) {
            nombre = nombreCompleto;
            numeroMatricula = numeroMatriculaAlumno;
            edad = edadAlumno;
        if (nombreCompleto.length() < 3) {
            System.err.println("Error: La longitud del nombre del alumno debe ser al menos tres caracteres.");
        }
        if (numeroMatriculaAlumno.length() < 4) {
            System.err.println("Error: La longitud del n�mero de matr�cula del alumno debe ser al menos cuatro caracteres.");
        } 
        else {
            numeroMatricula = numeroMatriculaAlumno;
        }
    }

    /**
     * Devuelve el nombre completo del alumno
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Cambia el nombre del alumno
     */
    public void cambiarnombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }
    
    /**
     * Imprime por pantalla los detalles del alumno
     */
    public void imprimeDetalles() {
        System.out.println(nombre + " (" + numeroMatricula + ") - " + edad + " años");
    }
    
    /**
     * Devuelve el nombre de usuario que el alumno debe configurar
     * en su cuenta de Github en formato de 7 caracateres
     */
    public String getNombreUsuarioGithub() {
        return nombre.substring(0, 3) + numeroMatricula.substring(0, 4);
    }
}
