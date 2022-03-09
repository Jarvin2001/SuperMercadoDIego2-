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

    //Declaramos las variables 
    //Usuario Admin
    private String Admin = new String("admin");
    //Contraseña 
    private String ContraseñaA = new String("admin123");

    //Usuario 
    private String Vendedor = new String("vendedor");
    //Contraseña 
    private String ContraseñaV = new String("vendedor123");

    //Usuario 
    private String Invitado = new String("invitado");
    //Contraseña 
    private String ContraseñaI = new String("invitado123");

    public Usuarios() {

    }

    //Miramos si el usuario y/o contraseña es correcto
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
