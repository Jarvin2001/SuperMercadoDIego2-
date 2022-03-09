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

                a.EscribirFichero
        ("\nAdministrador", "\nHora:", hora, minuto, segundo, "\nFecha:", dia, mes, anio);
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
                        System.out.println("**Menu para realizar nueva venta**");
                            System.out.println("Ingrese la nueva venta que desea realizar:");
                            System.out.println("-----------------------------------------");
                            a.LeerFichero();
                            System.out.println("-----------------------------------------");

                            int compra;
                            int productos;
                            int cod[] = new int[10];
                            int cantidad[] = new int[10];
                            int c = 0;
                            double descuento = 0.03;
                            double totaldescuento = 0;
                            double totalfinal = 0;
                            double subtotal1 = 0;
                            double subtotal2= 0;
                            double subtotal3 = 0;
                            double subtotal4 = 0;
                            double subtotal5 = 0;
                            double subtotal6 = 0;
                            double subtotal7 = 0;
                            double subtotal8 = 0;
                            double subtotal9 = 0;
                            double subtotal10 = 0;

                            do {

                                System.out.println("Digite codigo del producto a adquirir");
                                cod[c] = in.nextInt();
                                System.out.println("Digite la cantidad de productos a adquirir");
                                cantidad[c] = in.nextInt();
                                c++;
                                System.out.println("Desea agregar mas productos(Presionar 1 y si no 0");

                                compra = in.nextInt();

                            } while (compra == 1);
                            System.out.println("------------------------------------");
                            System.out.println("FACTURA DE COMPRA");
                            System.out.println("SUPER MERCADO DIEGO");
                            System.out.println("------------------------------------");
                            for (int i = 0; i < c; i++) {

                                if (cod[i] == 1) {

                                    int CocaCola = 30;
                                    if (cantidad[i] <= CocaCola) {

                                        subtotal1 = cantidad[i] * 0.65;
                                        System.out.println("CocaCola--" + cantidad[i] + "x $0.65 = $" +subtotal1);

                                    } else {

                                        System.out.println("CocaCola--Disculpas del caso, producto sin existencias");

                                    }

                                }

                                if (cod[i] == 2) {
                                    int Pepsi = 5;
                                    if (cantidad[i] <= Pepsi) {

                                        subtotal2 = cantidad[i] * 0.60;
                                        System.out.println("Pepsi--" + cantidad[i] + "x $0.60 = $" + subtotal2);
                                    } else {

                                        System.out.println("Pepsi--Disculpas del caso, producto sin existencias");

                                    }
                                }
                                if (cod[i] == 3) {
                                    int DulcesDiana = 60;
                                    if (cantidad[i] <= DulcesDiana) {
                                       subtotal3 = cantidad[i] * 0.30;

                                        System.out.println("DulcesDiana--" + cantidad[i] + "x $0.30 = $" + subtotal3);

                                    } else {

                                        System.out.println("DulcesDiana--Disculpas del caso, producto sin existencias");
                                    }
                                }

                                if (cod[i] == 4) {
                                    int Limones = 60;
                                    if (cantidad[i] <= Limones) {
                                       subtotal4 = cantidad[i] * 0.50;

                                        System.out.println("Limones--" + cantidad[i] + "x $0.50 = $" + subtotal4);
                                    } else {
                                        System.out.println("Limones--Disculpas del caso, producto sin existencias");

                                    }
                                }
                                if (cod[i] == 5) {
                                    int Escobas = 500;
                                    if (cantidad[i] <= Escobas) {
                                       subtotal5 = cantidad[i] * 2.00;

                                        System.out.println("Escobas--" + cantidad[i] + "x $2.00 = $" + subtotal5);

                                    } else {
                                        System.out.println("Escobas--Disculpas del caso, producto sin existencias");
                                    }
                                }
                                if (cod[i] == 6) {
                                    int Desodorante = 20;
                                    if (cantidad[i] <= Desodorante) {
                                       subtotal6 = cantidad[i] * 4.50;

                                        System.out.println("Desodorante--" + cantidad[i] + "x $4.50 = $" + subtotal6);

                                    } else {
                                        System.out.println("Desodorante--Disculpas del caso, producto sin existencias");
                                    }
                                }
                                if (cod[i] == 7) {
                                    int MangoVerde = 25;
                                    if (cantidad[i] <= MangoVerde) {
                                       subtotal7 = cantidad[i] * 0.75;

                                        System.out.println("MangoVerde--" + cantidad[i] + "x $0.75 = $" + subtotal7);

                                    } else {
                                        System.out.println("MangoVerde--Disculpas del caso, producto sin existencias");

                                    }
                                }
                                if (cod[i] == 8) {
                                    int Jocotes = 30;
                                    if (cantidad[i] <= Jocotes) {
                                       subtotal8 = cantidad[i] * 0.05;

                                        System.out.println("Jocotes--" + cantidad[i] + "x $0.05 = $" + subtotal8);

                                    } else {
                                        System.out.println("Jocote--Disculpas del caso, producto sin existencias");
                                    }
                                }
                                if (cod[i] == 9) {
                                    int Maruchan = 180;
                                    if (cantidad[i] <= Maruchan) {
                                        subtotal9 = cantidad[i] * 1.80;

                                        System.out.println("Maruchan--" + cantidad[i] + "x $1.80 = $" + subtotal9);
                                    } else {
                                        System.out.println("Maruchan--Disculpas del caso, producto sin existencias");

                                    }
                                }
                                if (cod[i] == 10) {
                                    int Cerveza = 50;
                                    if (cantidad[i] <= Cerveza) {
                                        subtotal10 = cantidad[i] * 1.00;

                                        System.out.println("Cerveza--" + cantidad[i] + "x $1.00 = $" +subtotal10);
                                    } else {
                                        System.out.println("Cerveza--Disculpas del caso, producto sin existencias");

                                    }
                                }
                            }

                            double totalproducto;
                            totalproducto = subtotal1 + subtotal2 + subtotal3 + subtotal4 + subtotal5 + subtotal6 + subtotal7 + subtotal8 + subtotal9 + subtotal10;

                            if (totalproducto > 20) {
                                totalfinal = totalproducto;

                                totaldescuento = totalproducto * descuento;

                                totalproducto = totalproducto - totaldescuento;

                            }

                            System.out.println("------------------------------------");
                            System.out.println("Total: $" + totalproducto);
                            System.out.println("Descuento del 3% $" + totaldescuento);
                            System.out.println("Total con descuento :$" + totalproducto);
                            System.out.println("------------------------------------");
                            break;
                        
                        
                        case 2:
                             System.out.println("**Menu para ver la lista de inventarios**");
                            System.out.println("La lista de los inventarios es la siguiente:");
                            System.out.println("-----------------------------------------");
                            a.LeerFichero();
                            System.out.println("-----------------------------------------");
                        break;
                        
                        
                        case 3:
                        //CAMBIO DE CONTRASEÑA
                            System.out.println("**Menu para cambiar contraseña**");
                            System.out.println("Seleccione su nueva contraseña:");
                            usuario = in.next();
                            System.out.println("Escriba nuevamente su contraseña nueva:\n\n");
                            cont = in.next();
                            break;
                    
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
                    System.out.println("INGRESE SU CONTRASEÑA:  "+"\n");
                   
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
                            System.out.println("**Menu para realizar nueva venta**");
                            System.out.println("Ingrese la nueva venta que desea realizar:");
                            System.out.println("-----------------------------------------");
                            a.LeerFichero();
                            System.out.println("-----------------------------------------");

                            int compra;
                            int productos;
                            int cod[] = new int[10];
                            int cantidad[] = new int[10];
                            int c = 0;
                            double descuento = 0.03;
                            double totaldescuento = 0;
                            double totalfinal = 0;
                            double subtotal1 = 0;
                            double subtotal2= 0;
                            double subtotal3 = 0;
                            double subtotal4 = 0;
                            double subtotal5 = 0;
                            double subtotal6 = 0;
                            double subtotal7 = 0;
                            double subtotal8 = 0;
                            double subtotal9 = 0;
                            double subtotal10 = 0;

                            do {

                                System.out.println("Digite codigo del producto a adquirir");
                                cod[c] = in.nextInt();
                                System.out.println("Digite la cantidad de productos a adquirir");
                                cantidad[c] = in.nextInt();
                                c++;
                                System.out.println("Desea agregar mas productos(Presionar 1 y si no 0");

                                compra = in.nextInt();

                            } while (compra == 1);
                            System.out.println("------------------------------------");
                            System.out.println("FACTURA DE COMPRA");
                            System.out.println("SUPER MERCADO DIEGO");
                            System.out.println("------------------------------------");
                            for (int i = 0; i < c; i++) {

                                if (cod[i] == 1) {

                                    int CocaCola = 30;
                                    if (cantidad[i] <= CocaCola) {

                                        subtotal1 = cantidad[i] * 0.65;
                                        System.out.println("CocaCola--" + cantidad[i] + "x $0.65 = $" +subtotal1);

                                    } else {

                                        System.out.println("CocaCola--Disculpas del caso, producto sin existencias");

                                    }

                                }

                                if (cod[i] == 2) {
                                    int Pepsi = 5;
                                    if (cantidad[i] <= Pepsi) {

                                        subtotal2 = cantidad[i] * 0.60;
                                        System.out.println("Pepsi--" + cantidad[i] + "x $0.60 = $" + subtotal2);
                                    } else {

                                        System.out.println("Pepsi--Disculpas del caso, producto sin existencias");

                                    }
                                }
                                if (cod[i] == 3) {
                                    int DulcesDiana = 60;
                                    if (cantidad[i] <= DulcesDiana) {
                                       subtotal3 = cantidad[i] * 0.30;

                                        System.out.println("DulcesDiana--" + cantidad[i] + "x $0.30 = $" + subtotal3);

                                    } else {

                                        System.out.println("DulcesDiana--Disculpas del caso, producto sin existencias");
                                    }
                                }

                                if (cod[i] == 4) {
                                    int Limones = 60;
                                    if (cantidad[i] <= Limones) {
                                       subtotal4 = cantidad[i] * 0.50;

                                        System.out.println("Limones--" + cantidad[i] + "x $0.50 = $" + subtotal4);
                                    } else {
                                        System.out.println("Limones--Disculpas del caso, producto sin existencias");

                                    }
                                }
                                if (cod[i] == 5) {
                                    int Escobas = 500;
                                    if (cantidad[i] <= Escobas) {
                                       subtotal5 = cantidad[i] * 2.00;

                                        System.out.println("Escobas--" + cantidad[i] + "x $2.00 = $" + subtotal5);

                                    } else {
                                        System.out.println("Escobas--Disculpas del caso, producto sin existencias");
                                    }
                                }
                                if (cod[i] == 6) {
                                    int Desodorante = 20;
                                    if (cantidad[i] <= Desodorante) {
                                       subtotal6 = cantidad[i] * 4.50;

                                        System.out.println("Desodorante--" + cantidad[i] + "x $4.50 = $" + subtotal6);

                                    } else {
                                        System.out.println("Desodorante--Disculpas del caso, producto sin existencias");
                                    }
                                }
                                if (cod[i] == 7) {
                                    int MangoVerde = 25;
                                    if (cantidad[i] <= MangoVerde) {
                                       subtotal7 = cantidad[i] * 0.75;

                                        System.out.println("MangoVerde--" + cantidad[i] + "x $0.75 = $" + subtotal7);

                                    } else {
                                        System.out.println("MangoVerde--Disculpas del caso, producto sin existencias");

                                    }
                                }
                                if (cod[i] == 8) {
                                    int Jocotes = 30;
                                    if (cantidad[i] <= Jocotes) {
                                       subtotal8 = cantidad[i] * 0.05;

                                        System.out.println("Jocotes--" + cantidad[i] + "x $0.05 = $" + subtotal8);

                                    } else {
                                        System.out.println("Jocote--Disculpas del caso, producto sin existencias");
                                    }
                                }
                                if (cod[i] == 9) {
                                    int Maruchan = 180;
                                    if (cantidad[i] <= Maruchan) {
                                        subtotal9 = cantidad[i] * 1.80;

                                        System.out.println("Maruchan--" + cantidad[i] + "x $1.80 = $" + subtotal9);
                                    } else {
                                        System.out.println("Maruchan--Disculpas del caso, producto sin existencias");

                                    }
                                }
                                if (cod[i] == 10) {
                                    int Cerveza = 50;
                                    if (cantidad[i] <= Cerveza) {
                                        subtotal10 = cantidad[i] * 1.00;

                                        System.out.println("Cerveza--" + cantidad[i] + "x $1.00 = $" +subtotal10);
                                    } else {
                                        System.out.println("Cerveza--Disculpas del caso, producto sin existencias");

                                    }
                                }
                            }

                            double totalproducto;
                            totalproducto = subtotal1 + subtotal2 + subtotal3 + subtotal4 + subtotal5 + subtotal6 + subtotal7 + subtotal8 + subtotal9 + subtotal10;

                            if (totalproducto > 20) {
                                totalfinal = totalproducto;

                                totaldescuento = totalproducto * descuento;

                                totalproducto = totalproducto - totaldescuento;

                            }

                            System.out.println("------------------------------------");
                            System.out.println("Total: $" + totalproducto);
                            System.out.println("Descuento del 3% $" + totaldescuento);
                            System.out.println("Total con descuento :$" + totalproducto);
                            System.out.println("------------------------------------");
                            break;

                        //INVENTARIOS
                        case 2:
                             System.out.println("**Menu para ver la lista de inventarios**");
                            System.out.println("La lista de los inventarios es la siguiente:");
                            System.out.println("-----------------------------------------");
                            a.LeerProductos();
                            System.out.println("-----------------------------------------");
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
                    System.out.println("1. INVENTARIO");
                    System.out.println("-------------------------------------------------------------------\n");
                    System.out.println("2. SALIR");
                    System.out.println("DIGITE LA OPCION\n");
                    opc2 = in.nextInt();
                    switch (opc2) {
                        case 1:
                            System.out.println("LISTA DE INVENTARIOS");
                             System.out.println("**Menu para ver la lista de inventarios**");
                            System.out.println("La lista de los inventarios es la siguiente:");
                            System.out.println("-----------------------------------------");
                            a.LeerFichero();
                            System.out.println("-----------------------------------------");
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
