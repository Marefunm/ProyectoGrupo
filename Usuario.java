
package proyecto;


public class Usuario {
    private String Nombre;
    private String Apellido;
    private String User;
    private String Pass;
    
 
    public Usuario(String Nombre, String Apellido, String User, String Pass) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.User = User;
        this.Pass = Pass;
    }

    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public String getApellido() {
        return Apellido;
    }
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    public String getUser() {
        return User;
    }
    public void setUser(String User) {
        this.User = User;
    }
    public String getPass() {
        return Pass;
    }
    public void setPass(String Pass) {
        this.Pass = Pass;
    }
     
}
