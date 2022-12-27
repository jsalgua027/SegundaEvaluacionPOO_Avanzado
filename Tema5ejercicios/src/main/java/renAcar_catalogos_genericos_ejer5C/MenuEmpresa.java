/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package renAcar_catalogos_genericos_ejer5C;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class MenuEmpresa {

    /**
     * @param args the command line arguments
     */
    private static Scanner teclado2 = new Scanner(System.in);

    public static int leerEnteroSinErroresScanner() {
        int num = 0;
        boolean repetir = true;

        do {
            System.out.println("Introduce el número de días");
            try {

                num = teclado2.nextInt();
                repetir = false;

            } catch (InputMismatchException ime) {
                System.out.println("No has introducido un numero entero");
                //limpio buffer
                teclado2.nextLine();
            }

        } while (repetir);

        return num;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String opcion = "";
        String menu = """
                                    ************RENTACAR***********
                                    
                                    1-Para gestión con Clientes
                                    2-Para gestión con  Vehiculos
                                    3-Para gestión con alquileres
                                    4-salir
                     
                                    **********************************
                                 """;

        String menuClientes = """
                                                *****ZONA CLIENTES*****
                                                1-Para añadir cliente
                                                2-Para borrar cliente
                                                3-Para buscar cliente
                                                5-salir
                                                *******************************
                                           """;

        String menuVehiculos = """
                                                *****ZONA VEHICULOS*****
                                                1-Para añadir vehiculo
                                                2-Para borrar vehiculo
                                                3-Para buscar vehiculo
                                                6-salir
                                                *******************************
                                           """;

        String menuAlquileres = """
                                            *****ZONA ALQUILERES*****
                                              1-Para registro Alquiler
                                              2-Busqueda de Alquileres por cliente
                                              3-Busqueda de Alquileres por vehiculo
                                              7-Para salir
                                              *********************************
                                            """;

        Empresa rentAcar = new Empresa("RENTCAR");
        System.out.println(rentAcar);
        String clienteAux = "";
        String vehiculoAux = "";
        do {
            System.out.println(menu);
            System.out.println("Introduzca una opción: ");
            opcion = teclado.nextLine();

            switch (opcion) {
                case "1" -> {
                    do {
                        System.out.println(menuClientes);
                        System.out.println("Introduzca una opción: ");
                        opcion = teclado.nextLine();
                        switch (opcion) {
                            case "1" -> {
                                rentAcar.registarCliente(Cliente.generarCliente());
                                System.out.println("Con el registro realizado el catalogo de clientes es:");
                                System.out.println(rentAcar.getCatalogoClientes().toString());
                            }
                            case "2" -> {
                                System.out.println("Indique el nif del cliente que quiere borrar");
                                clienteAux = teclado.nextLine();
                                Cliente aux = new Cliente();
                                aux.setNIF(clienteAux);
                                if (rentAcar.getCatalogoClientes().buscarCliente(clienteAux) != null) {
                                    rentAcar.getCatalogoClientes().borrarElemento(aux);
                                    System.out.println("Con el borrado realizado el catalogo de clientes es:");
                                    System.out.println(rentAcar.getCatalogoClientes().toString());

                                } else {

                                    System.out.println("El cliente no se encuentra en la lista");
                                }
                            }
                            case "3" -> {
                                System.out.println("Indique el nif del cliente a buscar");
                                clienteAux = teclado.nextLine();

                                if (rentAcar.getCatalogoClientes().buscarCliente(clienteAux) == null) {
                                    System.out.println("No se encuentra el cliente");
                                } else {

                                    System.out.println(rentAcar.getCatalogoClientes().buscarCliente(clienteAux).toString());
                                }
                            }
                            default -> {
                            }

                        }

                    } while (!opcion.contentEquals("5"));
                }
                case "2" -> {
                    do {
                        System.out.println(menuVehiculos);
                        System.out.println("Introduzca una opción: ");
                        opcion = teclado.nextLine();
                        switch (opcion) {
                            case "1" -> {
                                Vehiculo aux = new Vehiculo();
                                rentAcar.getCatalogoVehiculos().añadirElemento(aux);
                                System.out.println("Con el nuevo vehiculo añadido el catalogo queda asi");
                                System.out.println(rentAcar.getCatalogoVehiculos().toString());
                            }
                            case "2" -> {
                                System.out.println("Indique el numero de bastidor que quiere borrar");
                                vehiculoAux = teclado.nextLine();
                                Vehiculo aux1 = new Vehiculo();
                                aux1.setBastidor(vehiculoAux);
                                if (rentAcar.getCatalogoVehiculos().buscarVehiculo(vehiculoAux) != null) {
                                    rentAcar.getCatalogoVehiculos().borrarElemento(aux1);
                                    System.out.println("Con el borrado realizado el catalogo de clientes es:");
                                    System.out.println(rentAcar.getCatalogoVehiculos().toString());
                                } else {

                                    System.out.println("El vehiculo no se encuentra en el catalogo");
                                }
                            }
                            case "3" -> {
                                System.out.println("Indique el bastidor del vehiculo  a buscar");
                                vehiculoAux = teclado.nextLine();

                                if (rentAcar.getCatalogoVehiculos().buscarVehiculo(vehiculoAux) == null) {
                                    System.out.println("No se encuentra el vehiculo");
                                } else {

                                    System.out.println(rentAcar.getCatalogoVehiculos().buscarVehiculo(vehiculoAux).toString());
                                }
                            }
                            default -> {
                            }

                        }

                    } while (!opcion.contentEquals("6"));
                }
                case "3" -> {
                    do {
                        System.out.println(menuAlquileres);
                        System.out.println("Introduzca una opción: ");
                        opcion = teclado.nextLine();
                        switch (opcion) {
                            case "1" -> {
                                System.out.println("Vamos a realizar el registro de alquiler");
                                System.out.println("Indique el nif del clinete a añadir al registro ");
                                clienteAux = teclado.nextLine();
                                if (rentAcar.getCatalogoClientes().buscarCliente(clienteAux) != null) {
                                    System.out.println("Indique el numero de bastidor del vehiculo a añadir");
                                    vehiculoAux = teclado.nextLine();
                                    if (rentAcar.getCatalogoVehiculos().buscarVehiculo(vehiculoAux) != null) {
                                        System.out.println("Indique le numero de dias de alquiler");
                                        int numeroDias = leerEnteroSinErroresScanner();
                                        rentAcar.registroAlquiler(clienteAux, vehiculoAux, LocalDate.now(), numeroDias);
                                    } else {
                                        System.out.println(" No se encuentra el vehiculo");
                                        break;
                                    }
                                } else {
                                    System.out.println("No se encuentra el cliente");
                                    break;
                                }
                                System.out.println("El catalogo de alquileres queda asi: ");
                                System.out.println(rentAcar.getCatalogoAlquileres().toString());
                            }
                            case "2" -> {
                                List<Alquiler> alquileresUnCliente = new ArrayList<>();
                                Cliente aux = new Cliente();
                                System.out.println("Indique el nif del cliente");
                                clienteAux = teclado.nextLine();
                                aux.setNIF(clienteAux);
                                alquileresUnCliente = rentAcar.getCatalogoAlquileres().buscarAlquilerNif(clienteAux);
                                if (alquileresUnCliente.size() > 0) {

                                    System.out.println(alquileresUnCliente.toString());
                                } else {
                                    System.out.println("No hay clientes con ese alquiler");

                                }

                            }
                            case "3" -> {
                                List<Alquiler> alquileresUnVehiculo = new ArrayList<>();
                                Vehiculo aux = new Vehiculo();

                                System.out.println("Indique el numero de bastidor ");
                                vehiculoAux = teclado.nextLine();
                                aux.setBastidor(vehiculoAux);
                                alquileresUnVehiculo = rentAcar.getCatalogoAlquileres().buscarAlquilerBastidor(vehiculoAux);
                                if (alquileresUnVehiculo.size() > 0) {

                                    System.out.println(alquileresUnVehiculo.toString());
                                } else {
                                    System.out.println("No hay vehiculos con ese numero de bastidor");
                                }

                            }
                            default -> {
                            }

                        }

                    } while (!opcion.contentEquals("7"));

                }
                default -> {
                }

            }

        } while (!opcion.equalsIgnoreCase("4"));

    }

}
