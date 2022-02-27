/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercadodigo;

import java.time.LocalDateTime;
import java.util.Scanner;
import supermercadodigo.Archivos.Archivos;
import supermercadodigo.Clases.Usuarios;

/**
 *
 * @author jarvi
 */
public class SuperMercadoDigo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String usuario;
        String cont;
        int nivel;
        //Declaramos el scanner
        Scanner in = new Scanner(System.in);
        //Realizamos el Login para los usuarios
        System.out.println("-----------BIENVENIDO A SUPER MERCADO DIEGO-----------\n");

        //Realizamos el menu de acceso    
        System.out.println("-------------------------------------------------------------------");
        System.out.println("-------¿CON QUE NIVEL DE ACCESO QUIERES INGRESAR?------\n");
        System.out.println("1. Administrador: ");
        System.out.println("2. Vendedor: ");
        System.out.println("3. Invitado: ");
        System.out.println("DIGITA EL NUMERO CORRESPONDIENTE AL NIVEL AL QUE QUIERES INGRESAR: \n\n");
        System.out.println("---------------------------------------------------------------------");

        nivel = in.nextInt();

        //CREANMOS LAS VARIABLES
        Usuarios U = new Usuarios();
        Archivos a = new Archivos();

        switch (nivel) {
            case 1:

                do {
                    System.out.println("BIENVENIDO ADMINISTRADOR");
                    System.out.println("INGRESE SU USUARIO:  ");
                    usuario = in.next();
                    System.out.println("INGRESE SU CONTRASEÑA:  ");
                    cont = in.next();

                } while (U.AccesoConcecidoAdministrador(usuario, cont) == false);
                LocalDateTime localDate = LocalDateTime.now();
                int hora = localDate.getHour();
                int minuto = localDate.getMinute();
                int segundo = localDate.getSecond();

                int dia = localDate.getDayOfMonth();
                int mes = localDate.getMonthValue();
                int anio = localDate.getYear();

                a.EscribirFichero("\nAdministrador", "\nHora:", hora, minuto, segundo, "\nFecha:", dia, mes, anio);
                boolean salir = false;

                int opc;

                //OPCION ADMINISTRADOR
                do {
                    System.out.println("Digite la opcion a solicitar");
                    System.out.println("1. AGREAR NUEVA VENTA");
                    System.out.println("2. INVENTARIO");
                    System.out.println("3. CAMBIAR CONTRASEÑA");
                    System.out.println("4. SALIR");
                    System.out.println("DIGITE LA OPCION\n");
                    opc = in.nextInt();
                    switch (opc) {
                        case 1:
                            //VENTAS  
                            System.out.println("NUEVA VENTA EN MANTENIMIENTO, NO DISPONIBLE DE MOMENTO\n");//BORRAR ESTO AL METER EL CODIGO
                            System.out.println("-------------------------------------------------------------------\n");
                            break;
                        case 2:
                            //INVENTARIOS
                            /*
                            Aceite Bolsa $0.77
                            Pechuga de pollo Libra $1.35
                            Huevo mediano Cartón $2.33
                            Azucar blanca del cañal $2.70
                            Pan de caja blanco $2.29
                            Frijol rojo de seda $5.24
                            Harina de maíz maseca $3.46
                            Café instantáneo nescafé $7.00
                            Nachos con queso Diana $1.05
                            Papel higiénico encanto $7.29
                            Cerveza regia lata $15.85
                            Jabón multiusos barra $0.85
                            Pasta canelón $1.10
                                                                                                            
                             */
                            System.out.println("INVENTARIO EN MANTENIMIENTO, NO DISPONIBLE DE MOMENTO\n");//BORRAR ESTO AL METER EL CODIGO
                            System.out.println("-------------------------------------------------------------------\n");
                            break;
                        case 3:
                            //CAMBIO DE CONTRASEÑA
                            System.out.println("CAMBIO DE CONTRASEÑA EN MANTENIMIENTO, NO DISPONIBLE DE MOMENTO\n");//BORRAR ESTO AL METER EL CODIGO
                            System.out.println("-------------------------------------------------------------------\n");
                        case 4:
                            System.out.println("Saliendo del programa");
                            a.EscribirFichero("\nSalida del Administrador", "\nHora:", hora, minuto, segundo, "\nFecha:", dia, mes, anio);
                            salir = true;
                            break;
                        default:
                            System.out.println("Solo numeros entre 1 al 4");
                            break;
                    }
                } while (opc != 4);
                break;

            //OPCION VENDEDOR
            case 2:
                do {
                    System.out.println("BIENVENIDO VENDEDOR BRYAN");
                    System.out.println("INGRESE SU USUARIO:  ");
                    usuario = in.next();
                    System.out.println("INGRESE SU CONTRASEÑA:  " + "\n");

                    cont = in.next();
                } while (U.AccesoConcedidoVendedor(usuario, cont) == false);

                LocalDateTime localDate2 = LocalDateTime.now();
                int hora2 = localDate2.getHour();
                int minuto2 = localDate2.getMinute();
                int segundo2 = localDate2.getSecond();
                int dia2 = localDate2.getDayOfMonth();
                int mes2 = localDate2.getMonthValue();
                int anio2 = localDate2.getYear();

                a.EscribirFichero("\nVendedor", "\nHora:", hora2, minuto2, segundo2, "\nFecha:", dia2, mes2, anio2);

                int opc1;
                do {
                    System.out.println("Digite la opcion a solicitar");
                    System.out.println("1. AGREAR NUEVA VENTA");
                    System.out.println("2. INVENTARIO");
                    System.out.println("4. SALIR");
                    System.out.println("DIGITE LA OPCION\n");
                    opc1 = in.nextInt();
                    switch (opc1) {
                        //VENTAS 
                        case 1:
                            System.out.println("NUEVA VENTA EN MANTENIMIENTO, NO DISPONIBLE DE MOMENTO\n");//BORRAR ESTO AL METER EL CODIGO
                            System.out.println("-------------------------------------------------------------------\n");
                            break;

                        //INVENTARIOS
                        case 2:
                            System.out.println("INVENTARIO EN MANTENIMIENTO, NO DISPONIBLE DE MOMENTO\n");//BORRAR ESTO AL METER EL CODIGO
                            System.out.println("-------------------------------------------------------------------\n");
                            //INVENTARIO 

                            /*

                            Aceite Bolsa $0.77
                            Pechuga de pollo Libra $1.35
                            Huevo mediano Cartón $2.33
                            Azucar blanca del cañal $2.70
                            Pan de caja blanco $2.29
                            Frijol rojo de seda $5.24
                            Harina de maíz maseca $3.46
                            Café instantáneo nescafé $7.00
                            Nachos con queso Diana $1.05
                            Papel higiénico encanto $7.29
                            Cerveza regia lata $15.85
                            Jabón multiusos barra $0.85
                            Pasta canelón $1.10
                            
                             */
                            break;
                        case 3:
                            System.out.println("Saliendo del programa");
                            salir = true;
                            a.EscribirFichero("\nSalida del Vendedor", "\nHora:", hora2, minuto2, segundo2, "\nFecha:", dia2, mes2, anio2);
                            break;

                        default:
                            System.out.println("Solo numeros entre 1 al 4");
                            break;
                    }
                } while (opc1 != 3);

                break;

            //MODO INVITADO 
            case 3:

                do {
                    System.out.println("BIENVENIDO INVITADO OQUELI");
                    System.out.println("INGRESE SU USUARIO:  ");
                    usuario = in.next();
                    System.out.println("INGRESE SU CONTRASEÑA:  ");
                    cont = in.next();

                } while (U.AccesoConcecidoInvitado(usuario, cont) == false);

                LocalDateTime localDate3 = LocalDateTime.now();
                int hora3 = localDate3.getHour();
                int minuto3 = localDate3.getMinute();
                int segundo3 = localDate3.getSecond();

                int dia3 = localDate3.getDayOfMonth();
                int mes3 = localDate3.getMonthValue();
                int anio3 = localDate3.getYear();

                a.EscribirFichero("\nInvitado", "\nHora:", hora3, minuto3, segundo3, "\nFecha:", dia3, mes3, anio3);
                int opc2;

                do {
                    System.out.println("Digite la opcion a solicitar");
                    System.out.println("2. INVENTARIO");
                    System.out.println("INVENTARIO EN MANTENIMIENTO, NO DISPONIBLE DE MOMENTO\n");//BORRAR ESTO AL METER EL CODIGO
                    System.out.println("-------------------------------------------------------------------\n");
                    System.out.println("4. SALIR");
                    System.out.println("DIGITE LA OPCION\n");
                    opc2 = in.nextInt();
                    switch (opc2) {
                        case 1:
                            System.out.println("LISTA DE INVENTARIOS");
                            //INVENTARIOS 
                            /*
                            
                            Aceite Bolsa $0.77
                            Pechuga de pollo Libra $1.35
                            Huevo mediano Cartón $2.33
                            Azucar blanca del cañal $2.70
                            Pan de caja blanco $2.29
                            Frijol rojo de seda $5.24
                            Harina de maíz maseca $3.46
                            Café instantáneo nescafé $7.00
                            Nachos con queso Diana $1.05
                            Papel higiénico encanto $7.29
                            Cerveza regia lata $15.85
                            Jabón multiusos barra $0.85
                            Pasta canelón $1.10
                                                      
                             */
                            a.LeerFichero();
                            break;
                        case 2:
                            System.out.println("Saliendo del programa");
                            salir = true;
                            a.EscribirFichero("\nSalida del Invitado", "\nHora:", hora3, minuto3, segundo3, "\nFecha:", dia3, mes3, anio3);
                            break;
                    }
                } while (opc2 != 2);
                break;
        }
    }
}
