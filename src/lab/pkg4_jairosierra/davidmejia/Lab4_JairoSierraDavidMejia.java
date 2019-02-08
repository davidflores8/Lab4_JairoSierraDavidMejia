/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4_jairosierra.davidmejia;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jairo Sierra
 */
public class Lab4_JairoSierraDavidMejia {

    static Scanner r = new Scanner(System.in);
    static ArrayList<Delito> delitos = new ArrayList();
    static ArrayList<Criminales> criminales = new ArrayList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int op = 0;
        int opc = 0;
        while (op != 5) {
            Menu();
            op = r.nextInt();
            switch (op) {
                case 1:
                    System.out.println(" ");
                    System.out.println("1) Crear delito: ");
                    System.out.println("2) Modificar delito: ");
                    System.out.println("3) Eliminar delito: ");
                    System.out.println("4) Listar delito");
                    opc = r.nextInt();
                    try{
                        validar(opc);
                    switch (opc) {
                        case 1:
                            System.out.println(" ");
                            Registro();
                            break;
                        case 2:
                            System.out.println(" ");
                            System.out.println(" ");
                            PrintDelito();
                            System.out.println(" ");
                            System.out.println("Ingrese el subindice del delito que desea modificar: ");
                            int sub = r.nextInt();
                            ModificarDelito(sub);
                            break;
                        case 3:
                            System.out.println("");
                            PrintDelito();
                            System.out.println(" ");
                            System.out.println("Ingrese el subindice del delito que desea eliminar: ");
                            int sub2 = r.nextInt();
                            delitos.remove(sub2);
                            System.out.println("Delito removido exitosamente ");
                            break;
                        case 4:
                            System.out.println(" ");
                            PrintDelito();
                            break;
                        default:
                            System.out.println("La opcion no es valida");
                            break;
                    }
                    }
                    catch (Miexception ex) {
            System.out.println(ex.getMessage());
        }
                    break;
                case 2:
                    System.out.println(" ");//CRIMINALES
                    System.out.println("1) Crear criminal: ");
                    System.out.println("2) Modificar criminal: ");
                    System.out.println("3) Eliminar criminal: ");
                    System.out.println("4) Agregar delito a criminal");
                    System.out.println("5) Listar criminales");
                    opc = r.nextInt();
                    try {
                        validar(opc);
                        switch (opc) {
                            case 1:
                                System.out.println(" ");//CREAC
                                crearcriminal();
                                break;
                            case 2:
                                System.out.println(" ");//MODIFICAR
                                modificaragentes();
                                break;
                            case 3:
                                System.out.println(" ");//ELIMINAR
                                eliminarcriminales();
                                break;
                            case 4:
                                System.out.println(" ");//AGREGAR DELITO A CRIMINAL
                                break;
                            case 5:
                                System.out.println(" ");//LISTAR CRIMINAL
                                listarcriminales();
                                break;
                            default:
                                System.out.println("La opcion no es valida");
                                break;
                        }
                    } catch (Miexception ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;

            }
        }
    }

    public static void Menu() {
        System.out.println("-- MENU PRINCIPAL --");
        System.out.println("1) Delitos: ");
        System.out.println("2) Criminales: ");
        System.out.println("3) Agentes: ");
        System.out.println("4) TAS");
        System.out.println("5) Salir");
    }

    public static void PrintDelito() {
        for (Object t : delitos) {
            System.out.println(delitos.indexOf(t) + "\n" + t);
        }
    }

    public static void Registro() {
        System.out.println("Ingrese descripcion:  ");
        r.nextLine();
        String descripcion = r.nextLine();
        System.out.println("Ingrese nombre de victima: ");
        String victima = r.nextLine();
        System.out.println("¿Es culpable? ");
        System.out.println("1) Si");
        System.out.println("2) No");
        int cul = r.nextInt();
        String culpable = "";
        String sentencia = "";
        try {
            validar(cul);
            if (cul == 1) {
                culpable = "Si";
                System.out.println(" ");
                System.out.println("1) Años de senencia");
                System.out.println("2) Pena de merte: ");
                int s = r.nextInt();
                if (s == 1) {
                    System.out.println("Ingrese años de sentencia: ");
                    sentencia = r.next();
                } else {
                    sentencia = "Pena de muerte";
                }
            } else {
                culpable = "No";
                sentencia = " ";
            }
        } catch (Miexception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(" ");
        System.out.println("Ingrese la fecha de delito: ");
        String fecha = r.next();
        System.out.println("Ingrese el pais del delito: ");
        r.nextLine();
        String pais = r.nextLine();
        System.out.println("Ingrese el numero de delito: ");
        int numero = r.nextInt();
        System.out.println(" ");
        System.out.println("¿Es delito mayor o delito menor?");
        System.out.println("1. Delito mayor: ");
        System.out.println("2. Delito menor");
        int delito = r.nextInt();
        try {
            validar(delito);
            if (delito == 2) {
                System.out.println("Ingrese el nombre del policia: ");
                r.nextLine();
                String policia = r.nextLine();
                System.out.println("Ingrese ID del policia: ");
                r.nextLine();
                String id = r.nextLine();
                System.out.println("Ingrese numero de celda del ciminal: ");
                int celda = r.nextInt();
                delitos.add(new D_Menor(policia, id, celda, descripcion, victima, culpable, sentencia, fecha, pais, numero));
                System.out.println("Delito agregado exitosamente ");
                System.out.println(" ");
            } else {
                System.out.println("Ingrese puntuacion de gravedad: ");
                int puntuacion = r.nextInt();
                try {
                    validar(puntuacion);
                    while (puntuacion < 1 || puntuacion > 5) {
                        System.out.println("Ingrese un indice del 1 al 5: ");
                        puntuacion = r.nextInt();
                    }
                    delitos.add(new D_Grave(puntuacion, descripcion, victima, culpable, sentencia, fecha, pais, numero));
                    System.out.println("Delito agragado exitosmente");
                    System.out.println(" ");
                } catch (Miexception ex) {
                    System.out.println(ex.getMessage());
                }
            }
        } catch (Miexception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void ModificarDelito(int sub) {
        if (delitos.get(sub) instanceof D_Menor) {
            System.out.println("Ingrese la opcion que desea cambiar: ");
            System.out.println("1. Descripcion");
            System.out.println("2. Victima");
            System.out.println("3. Culpable");
            System.out.println("4. Fecha");
            System.out.println("5. Pais");
            System.out.println("6. Numero");
            System.out.println("7. Nombre del policia");
            System.out.println("8. ID del policia");
            System.out.println("9. Numero de celda del prisionero");
            int p = r.nextInt();
            try {
                validar(p);
                switch (p) {
                    case 1:
                        System.out.println(" ");
                        System.out.println("Ingrese la nueva descripcion: ");
                        r.nextLine();
                        String descripcion = r.nextLine();
                        ((D_Menor) delitos.get(sub)).setDescripcion(descripcion);
                        break;
                    case 2:
                        System.out.println(" ");
                        System.out.println("Ingrese nombre de victima: ");
                        r.nextLine();
                        String victima = r.nextLine();
                        ((D_Menor) delitos.get(sub)).setVictima(victima);
                        break;
                    case 3:
                        System.out.println(" ");
                        System.out.println("¿Es culpable? ");
                        System.out.println("1) Si");
                        System.out.println("2) No");
                        int cul = r.nextInt();
                        try {
                            validar(cul);
                            String culpable = "";
                            String sentencia = "";
                            if (cul == 1) {
                                culpable = "Si";
                                System.out.println("1. Años de senencia");
                                System.out.println("2) Pena de merte: ");
                                int s = r.nextInt();
                                if (s == 1) {
                                    System.out.println("Ingrese años de sentencia: ");
                                    sentencia = r.next();
                                } else {
                                    sentencia = "Pena de muerte";
                                }
                            } else {
                                culpable = "No";
                                sentencia = " ";
                            }
                            ((D_Menor) delitos.get(sub)).setCulpable(culpable);
                            ((D_Menor) delitos.get(sub)).setSentencia(sentencia);
                        } catch (Miexception ex) {
                            System.out.println(ex.getMessage());
                        }
                        break;
                    case 4:
                        System.out.println(" ");
                        String fecha = r.next();
                        ((D_Menor) delitos.get(sub)).setFecha(fecha);
                        break;
                    case 5:
                        System.out.println(" ");
                        System.out.println("Ingrese el pais del delito: ");
                        r.nextLine();
                        String pais = r.nextLine();
                        ((D_Menor) delitos.get(sub)).setPais(pais);
                        break;
                    case 6:
                        System.out.println(" ");
                        System.out.println("Ingrese el numero de delito: ");
                        int numero = r.nextInt();
                        try {
                            validar(numero);
                            ((D_Menor) delitos.get(sub)).setNumero(numero);
                        } catch (Miexception ex) {
                            System.out.println(ex.getMessage());
                        }
                        break;
                    case 7:
                        System.out.println(" ");
                        System.out.println("Ingrese el nombre del policia: ");
                        r.nextLine();
                        String policia = r.nextLine();
                        ((D_Menor) delitos.get(sub)).setPolicia(policia);
                        break;
                    case 8:
                        System.out.println(" ");
                        System.out.println("Ingrese ID del policia: ");
                        r.nextLine();
                        String id = r.nextLine();
                        ((D_Menor) delitos.get(sub)).setId(id);
                        break;
                    case 9:
                        System.out.println(" ");
                        System.out.println("Ingrese numero de celda del ciminal: ");
                        int celda = r.nextInt();
                        try {
                            validar(celda);
                            ((D_Menor) delitos.get(sub)).setCelda(celda);
                        } catch (Miexception ex) {
                            System.out.println(ex.getMessage());
                        }
                        break;
                    default:
                        System.out.println("La opcion no es valida");
                        break;
                }
            } catch (Miexception ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (delitos.get(sub) instanceof D_Grave) {
            System.out.println("Ingrese la opcion que desea cambiar: ");
            System.out.println("1. Descripcion");
            System.out.println("2. Victima");
            System.out.println("3. Culpable");
            System.out.println("4. Fecha");
            System.out.println("5. Pais");
            System.out.println("6. Numero");
            System.out.println("7. Nombre del policia");
            System.out.println("8. ID del policia");
            System.out.println("9. Numero de celda del prisionero");
            int p = r.nextInt();
            try {
                validar(p);
                switch (p) {
                    case 1:
                        System.out.println(" ");
                        System.out.println("Ingrese la nueva descripcion: ");
                        r.nextLine();
                        String descripcion = r.nextLine();
                        ((D_Grave) delitos.get(sub)).setDescripcion(descripcion);
                        break;
                    case 2:
                        System.out.println(" ");
                        System.out.println("Ingrese nombre de victima: ");
                        r.nextLine();
                        String victima = r.nextLine();
                        ((D_Grave) delitos.get(sub)).setVictima(victima);
                        break;
                    case 3:
                        System.out.println(" ");
                        System.out.println("¿Es culpable? ");
                        System.out.println("1) Si");
                        System.out.println("2) No");
                        int cul = r.nextInt();
                        try {
                            validar(cul);
                            String culpable = "";
                            String sentencia = "";
                            if (cul == 1) {
                                culpable = "Si";
                                System.out.println("1. Años de senencia");
                                System.out.println("2) Pena de merte: ");
                                int s = r.nextInt();
                                if (s == 1) {
                                    System.out.println("Ingrese años de sentencia: ");
                                    sentencia = r.next();
                                } else {
                                    sentencia = "Pena de muerte";
                                }
                            } else {
                                culpable = "No";
                                sentencia = " ";
                                ((D_Grave) delitos.get(sub)).setCulpable(culpable);
                                ((D_Grave) delitos.get(sub)).setSentencia(sentencia);
                            }
                        } catch (Miexception ex) {
                            System.out.println(ex.getMessage());
                        }
                        break;
                    case 4:
                        System.out.println(" ");
                        String fecha = r.next();
                        ((D_Grave) delitos.get(sub)).setFecha(fecha);
                        break;
                    case 5:
                        System.out.println(" ");
                        System.out.println("Ingrese el pais del delito: ");
                        r.nextLine();
                        String pais = r.nextLine();
                        ((D_Grave) delitos.get(sub)).setPais(pais);
                        break;
                    case 6:
                        System.out.println(" ");
                        System.out.println("Ingrese el numero de delito: ");
                        int numero = r.nextInt();
                        try {
                            validar(numero);
                            ((D_Grave) delitos.get(sub)).setNumero(numero);
                        } catch (Miexception ex) {
                            System.out.println(ex.getMessage());
                        }
                        break;
                    case 7:
                        System.out.println(" ");
                        System.out.println("Ingrese puntuacion de gravedad: ");
                        int puntuacion = r.nextInt();
                        try {
                            validar(puntuacion);
                            while (puntuacion < 1 || puntuacion > 5) {
                                System.out.println("Ingrese un indice del 1 al 5: ");
                                puntuacion = r.nextInt();
                            }
                            ((D_Grave) delitos.get(sub)).setPuntuacion(puntuacion);
                            System.out.println(" ");
                        } catch (Miexception ex) {
                            System.out.println(ex.getMessage());
                        }
                        break;
                    default:
                        System.out.println("La opcion no es valida");
                        break;
                }
            } catch (Miexception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static void crearcriminal() {
        System.out.println("Ingrese el nombre: ");
        r.nextLine();
        String Nombre = r.nextLine();
        System.out.println("Ingrese la edad: ");
        int Edad = r.nextInt();
        try {
            validar(Edad);
        } catch (Miexception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Ingrese el genero: ");
        r.nextLine();
        String Genero = r.nextLine();
        System.out.println("Ingrese el pais de residencia : ");
        r.nextLine();
        String Pais = r.nextLine();
        System.out.println("Menu");
        System.out.println("1) Encarcelado");
        System.out.println("2) No Encarcelado");
        int pos = r.nextInt();
        String Encarcelado = "";
        try {
            validar(pos);
            if (pos == 1) {
                Encarcelado = "Si";
            }
            if (pos == 2) {
                Encarcelado = "No";
            }
        } catch (Miexception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Ingrese la descripcion: ");
        r.nextLine();
        String Descripcion = r.nextLine();
        System.out.println("Menu");
        System.out.println("1) Criminal");
        System.out.println("2) Agente");
        int p = r.nextInt();
        try {
            validar(p);
            switch (p) {
                case 1:
                    criminales.add(new Criminales(Nombre, Edad, Genero, Pais, Encarcelado, Descripcion));
                    break;
                case 2:
                    System.out.println("Menu");
                    System.out.println("1) Terrorista");
                    System.out.println("2) Asesino");
                    System.out.println("3) Secuestrador");
                    int e = r.nextInt();
                    try {
                        validar(e);
                        switch (e) {
                            case 1:
                                System.out.println("Ingrese el pais del ataque: ");
                                r.nextLine();
                                String Pais1 = r.nextLine();
                                System.out.println("Ingrese la ciudad: ");
                                r.nextLine();
                                String Ciudad = r.nextLine();
                                System.out.println("Ingrese el metodo: ");
                                r.nextLine();
                                String Metodo = r.nextLine();
                                criminales.add(new Terroristas(Pais1, Ciudad, Metodo, Nombre, Edad, Genero, Pais, Encarcelado, Descripcion));
                                break;
                            case 2:
                                System.out.println("Ingrese el nombre: ");
                                r.nextLine();
                                String Nombre1 = r.nextLine();
                                System.out.println("Ingrese el arma: ");
                                r.nextLine();
                                String Arma = r.nextLine();
                                criminales.add(new Asesino(Nombre1, Arma, Nombre, Edad, Genero, Pais, Encarcelado, Descripcion));
                                break;
                            case 3:
                                System.out.println("Ingrese el nombre: ");
                                r.nextLine();
                                String nombre1 = r.nextLine();
                                System.out.println("Ingrese la cantidad del rescate: ");
                                int cantidad = r.nextInt();
                                criminales.add(new Secuestrador(nombre1, cantidad, Nombre, Edad, Genero, Pais, Encarcelado, Descripcion));
                                break;
                            default:
                                System.out.println("La opcion no es valida");
                                break;
                        }//switch de agentes
                    } catch (Miexception ex) {
                        System.out.println(ex.getMessage());
                    }
            }//switch de criminales y agentes
        } catch (Miexception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void modificaragentes() {
        System.out.println("Ingrese la posicion del criminal: ");
        int pos = r.nextInt();
        try {
            validar(pos);
            System.out.println("Menu");
            System.out.println("1) Criminal");
            System.out.println("2) Agente");
            int e = r.nextInt();
            switch (e) {
                case 1:
                    System.out.println("Menu de elementos: ");
                    System.out.println("1)Nombre");
                    System.out.println("2) Edad");
                    System.out.println("3) Genero");
                    System.out.println("4) Pais");
                    System.out.println("5) Encarcelado");
                    System.out.println("6 Descripcion");
                    int w = r.nextInt();
                    try {
                        validar(w);
                        switch (w) {
                            case 1:
                                System.out.println("Ingrese el nombre: ");
                                r.nextLine();
                                String Nombre = r.nextLine();
                                criminales.get(pos).setNombre(Nombre);
                                break;
                            case 2:
                                int Edad = 0;
                                System.out.println("Ingrese la edad: ");
                                Edad = r.nextInt();
                                try {
                                    validar(Edad);
                                    criminales.get(pos).setEdad(Edad);
                                } catch (Miexception ex) {
                                    System.out.println(ex.getMessage());
                                }
                                break;
                            case 3:
                                System.out.println("Ingrese el genero: ");
                                r.nextLine();
                                String Genero = r.nextLine();
                                criminales.get(pos).setGenero(Genero);
                                break;
                            case 4:
                                System.out.println("Ingrese el pais de residencia : ");
                                r.nextLine();
                                String Pais = r.nextLine();
                                criminales.get(pos).setPais(Pais);
                                break;
                            case 5:
                                System.out.println("Menu");
                                System.out.println("1) Encarcelado");
                                System.out.println("2) No Encarcelado");
                                int pos1 = r.nextInt();
                                String Encarcelado = "";
                                if (pos1 == 1) {
                                    Encarcelado = "Si";
                                }
                                if (pos1 == 2) {
                                    Encarcelado = "No";
                                }
                                criminales.get(pos).setEncarcelado(Encarcelado);
                                break;
                            case 6:
                                System.out.println("Ingrese la descripcion: ");
                                r.nextLine();
                                String Descripcion = r.nextLine();
                                criminales.get(pos).setDescripción(Descripcion);
                                break;
                            default:
                                System.out.println("La opcion no es valida");
                        }//Criminales
                    } catch (Miexception ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Menu");
                    System.out.println("1) Asesino");
                    System.out.println("2) Terrorista");
                    System.out.println("3) Secuestrador");
                    int q = r.nextInt();
                    try {
                        validar(q);
                        switch (q) {
                            case 1:
                                System.out.println("Menu");
                                System.out.println("1) Nombre");
                                System.out.println("2) Arma");
                                int t = r.nextInt();
                                try {
                                    validar(t);
                                    switch (t) {
                                        case 1:
                                            System.out.println("Ingrese el nombre: ");
                                            r.nextLine();
                                            String Nombre1 = r.nextLine();
                                            ((Asesino) criminales.get(pos)).setNombre1(Nombre1);
                                            break;
                                        case 2:
                                            System.out.println("Ingrese el arma: ");
                                            r.nextLine();
                                            String Arma = r.nextLine();
                                            ((Asesino) criminales.get(pos)).setArma(Arma);
                                            break;
                                        default:
                                            System.out.println("La opcion no es valida");
                                            break;
                                    }//asesino
                                } catch (Miexception ex) {
                                    System.out.println(ex.getMessage());
                                }
                                break;
                            case 2:
                                System.out.println("Menu");
                                System.out.println("1) Pais");
                                System.out.println("2) Ciudad");
                                System.out.println("3) Metodo");
                                int s = r.nextInt();
                                try {
                                    validar(s);
                                    switch (s) {
                                        case 1:
                                            System.out.println("Ingrese el pais del ataque: ");
                                            r.nextLine();
                                            String Pais1 = r.nextLine();
                                            ((Terroristas) criminales.get(pos)).setPais1(Pais1);
                                            break;
                                        case 2:
                                            System.out.println("Ingrese la ciudad: ");
                                            r.nextLine();
                                            String Ciudad = r.nextLine();
                                            ((Terroristas) criminales.get(pos)).setCiudad(Ciudad);
                                            break;
                                        case 3:
                                            System.out.println("Ingrese el metodo: ");
                                            r.nextLine();
                                            String Metodo = r.nextLine();
                                            ((Terroristas) criminales.get(pos)).setMetodo(Metodo);
                                            break;
                                        default:
                                            System.out.println("La opcion no es valida");
                                            break;
                                    }//terrorista
                                } catch (Miexception ex) {
                                    System.out.println(ex.getMessage());
                                }
                                break;
                            case 3:
                                System.out.println("Menu");
                                System.out.println("1) Nombre");
                                System.out.println("2) Cantidad del rescate");
                                int y = r.nextInt();
                                try {
                                    validar(y);
                                    switch (y) {
                                        case 1:
                                            System.out.println("Ingrese el nombre: ");
                                            r.nextLine();
                                            String nombre1 = r.nextLine();
                                            ((Secuestrador) criminales.get(pos)).setNombre1(nombre1);
                                            break;
                                        case 2:
                                            System.out.println("Ingrese la cantidad del rescate: ");
                                            int cantidad = r.nextInt();
                                            ((Secuestrador) criminales.get(pos)).setCantidad(cantidad);
                                            break;
                                        default:
                                            System.out.println("La opcion no es valida");
                                            break;
                                    }//fin de secuestrador
                                } catch (Miexception ex) {
                                    System.out.println(ex.getMessage());
                                }
                                break;
                            default:
                                System.out.println("La opcion no es valida");
                                break;
                        }//agentes
                    } catch (Miexception ex) {
                        System.out.println(ex.getMessage());
                    }
            }
        } catch (Miexception ex) {
            System.out.println(ex.getMessage());
        }

    }//fin de modificar criminales

    public static void listarcriminales() {
        System.out.println("Menu");
        System.out.println("1) Criminales");
        System.out.println("2) Agentes");
        int pos = r.nextInt();
        try {
            validar(pos);
            String salida = "";
            switch (pos) {
                case 1:
                    for (Criminales criminale : criminales) {
                        if (criminale instanceof Criminales) {
                            salida += criminales.indexOf(criminale) + "- " + criminale + "\n";
                        }
                    }
                    break;
                case 2:
                    for (Criminales criminale : criminales) {
                        if (criminale instanceof Agentes) {
                            salida += criminales.indexOf(criminale) + "- " + criminale + "\n";
                        }
                    }
                    break;
                default:
                    System.out.println("La opcion no es valida");
                    break;
            }
            System.out.println(salida);
        } catch (Miexception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void eliminarcriminales() {
        System.out.println("Menu");
        System.out.println("1) Criminales");
        System.out.println("2) Agentes");
        int pos = r.nextInt();
        try {
            validar(pos);
            switch (pos) {
                case 1:
                    System.out.println("Ingrese la posicion del criminal");
                    int e = r.nextInt();
                    criminales.remove(e);
                    break;
                case 2:
                    System.out.println("Ingrese la posicion del agente");
                    int w = r.nextInt();
                    criminales.remove(w);
                    break;
                default:
                    System.out.println("La opcion no es valida");
                    break;
            }
        } catch (Miexception ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static void validar(int n) throws Miexception {
        while (Integer.toString(n).matches("[0-9]+$") == false) {
            throw new Miexception("no se aceptan letras,solo numeros");
        }

    }

    public static void TAS() {
        System.out.println("Ingrese la posicion del agente: ");
        int pos = r.nextInt();
        try {
            validar(pos);
            for (Criminales criminale : criminales) {
                if (criminales.get(pos) instanceof Terroristas) {
                    ((Terroristas) criminales.get(pos)).cometer_delito();
                }
                if (criminales.get(pos) instanceof Asesino) {
                    ((Asesino) criminales.get(pos)).cometer_delito();
                }
                if (criminales.get(pos) instanceof Secuestrador) {
                    ((Secuestrador) criminales.get(pos)).cometer_delito();
                }
            }
        } catch (Miexception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
