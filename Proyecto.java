
package proyecto;

import java.util.Scanner;


public class Proyecto {

    public static String Nombre;
    public static String Apellido;
    public static String Usuario;
    public static String Clave;
    public static String respuesta;
    public static ListaUsuarios lu = new ListaUsuarios();
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        do{    
        System.out.println("----Crear Usuario----");
        
        System.out.println("Ingresa el nombre del Usuario");
        Nombre = sc.nextLine();
        System.out.println("Ingresa el apellido del Usuario");
        Apellido = sc.nextLine();
        System.out.println("Crear Usuario:");
        Usuario = sc.nextLine();
        System.out.println("Crear Contraseña de Usuario:");
        Clave = sc.nextLine();
        Usuario us = new Usuario(Nombre,Apellido,Usuario,Clave);
        lu.agregarUsuario(us);
        System.out.println("Desea Crear otro usuario? (Si/No)");
        respuesta=sc.nextLine();
        } while(respuesta.equalsIgnoreCase("si"));
        
        Login log = new Login();
        log.setVisible(true);
        
    }
    
}
