/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercadodigo.Clases;

/**
 *
 * @author jarvi
 */
public class Usuarios {

    //Declaramos las constantes para nuestro programa:usuario y contraseña
    //Usuario Admin
    private String Admin = new String("admin");
    //Contraseña del Admin
    private String ContraseñaA = new String("admin123");

    //Usuario del vendedor
    private String Vendedor = new String("vendedor");
    //Contraseña del vendedor
    private String ContraseñaV = new String("vendedor123");

    //Usuario del invitado
    private String Invitado = new String("invitado");
    //Contraseña del invitado
    private String ContraseñaI = new String("invitado123");

    public Usuarios() {

    }

    /*
     
    LLUVIAS DE IDEAS
    
    1. Cada usuario tendra una contraseña
    
    2. Tenemos que validar si el usuario ingresado es correcto
    
    3. Una vez el usuario este validado, ingresamos al menu
    
    
    
     */
    //En este metodo, validaremos si el usuario y contraseña ingresado es correcto
    public boolean AccesoConcecidoAdministrador(String us, String con) {

        boolean paso = false;
        if (Admin.equals(us) && ContraseñaA.equalsIgnoreCase(con)) {
            System.out.println("BIENVENIDO");
            paso = true;

        } else {

            System.out.println("INGRESE DE NUEVO SUS DATOS");
            paso = false;
        }

        return paso;

    }

    public boolean AccesoConcedidoVendedor(String us, String con) {

        boolean paso2;
        if (Vendedor.equals(us) && ContraseñaV.equalsIgnoreCase(con)) {
            System.out.println("BIENVENIDO");
            paso2 = true;
        } else {
            System.out.println("INGRESE DE NUEVO SUS DATOS");
            paso2 = false;
        }

        return paso2;
    }

    public boolean AccesoConcecidoInvitado(String us, String cont) {
        boolean paso3;
        if (Invitado.equals(us) && ContraseñaI.equalsIgnoreCase(cont)) {
            System.out.println("BIENVENIDO");
            paso3 = true;
        } else {
            System.out.println("INGRESE DE NUEVO SUS DATOS");
            paso3 = false;
        }

        return paso3;
    }
}
