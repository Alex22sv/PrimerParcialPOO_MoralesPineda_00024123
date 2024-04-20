import inventario.ArticuloElectronico;
import inventario.Laptop;
import inventario.Telefono;

import java.awt.dnd.DragSourceMotionListener;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static ArrayList<ArticuloElectronico> listaArticulos = new ArrayList<>();
    public static void main(String[] args) {
        menuPrincipal();
    }
    public static void menuPrincipal(){
        boolean mantenerEnSistema = true;
        int opcionEntrada;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Bienvenido al menú principal de -ElektroMart-");
            System.out.println("1. Agregar artículo.");
            System.out.println("2. Modificar artículo");
            System.out.println("3. Listar artículos");
            System.out.println("4. Salir del sistema.");
            System.out.print(" > ");
            try{
                opcionEntrada = sc.nextInt();
            } catch (InputMismatchException e){
                System.out.println("Has ingresado un dato inválido.");
                opcionEntrada = 4;
            }
            sc.nextLine();
            switch(opcionEntrada){
                case 1:
                    agregarArticuloElectronico();
                    break;
                case 2:
                    modificarArticulo();
                    break;
                case 3:
                    mostrarArticulos();
                    break;
                case 4:
                    mantenerEnSistema = false;
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Has ingresado una opción inválida. Por favor, inténtalo de nuevo.");
                    break;
            }
        } while(mantenerEnSistema);
    }
    public static void agregarArticuloElectronico(){
        Scanner sc = new Scanner(System.in);
        int opcionArticulo = solicitarArticuloElectronico();
        System.out.println("Ingrese el nombre del artículo: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el modelo del artículo: ");
        String modelo = sc.nextLine();
        System.out.println("Ingrese la descripción del artículo: ");
        String descripcion = sc.nextLine();
        System.out.println("Ingrese el precio del artículo: ");
        float precio = sc.nextFloat();
        sc.nextLine();
        if(opcionArticulo==1){
            System.out.println("¿Cuántas cámaras tiene el teléfono? ");
            int cantidadCamaras = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese la cantidad de RAM del teléfono: ");
            float RAM = sc.nextFloat();
            sc.nextLine();
            System.out.print("¿Es pantalla táctil? \n1. Sí\n2. No\n > ");
            boolean esPantallaTactil;
            if(sc.nextInt()==1){
                esPantallaTactil = true;
            } else {
                esPantallaTactil = false;
            }
            sc.nextLine();
            Telefono nuevoTelefono = new Telefono(nombre, modelo, descripcion, precio, cantidadCamaras, RAM, esPantallaTactil);
            listaArticulos.add(nuevoTelefono);
            System.out.println("El nuevo teléfono ha sido agregado con éxito.");
        } else {
            System.out.println("Ingrese el sistema operativo de la laptop: ");
            String sistemaOperativo = sc.nextLine();
            System.out.println("Ingrese el almacenamiento de la laptop: ");
            float almacenamiento = sc.nextFloat();
            sc.nextFloat();
            System.out.print("¿Tiene RGB? \n1. Sí\n2. No\n > ");
            boolean esRGB;
            if(sc.nextInt()==1){
                esRGB = true;
            } else {
                esRGB = false;
            }
            sc.nextLine();
            Laptop nuevaLaptop = new Laptop(nombre, modelo, descripcion, precio, sistemaOperativo, almacenamiento, esRGB);
            listaArticulos.add(nuevaLaptop);
            System.out.println("La nueva laptop ha sido agregada con éxito.");
        }
    }
    public static int solicitarArticuloElectronico(){
        int opcionEntrada = 0;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("¿Qué tipo de artículo desea agregar?");
            System.out.println("1. Teléfono");
            System.out.println("2. Laptop");
            System.out.print(" > ");
            try{
                opcionEntrada = sc.nextInt();
            } catch(InputMismatchException e){
                System.out.println("Por favor ingresa un dato válido.");
            }
            sc.nextLine();
            switch(opcionEntrada){
                case 1:
                case 2:
                    return opcionEntrada;
                default:
                    System.out.println("Por favor ingresa una opción válida.");
                    break;
            }
        }
    }
    public static void modificarArticulo(){
        Scanner sc = new Scanner(System.in);
        mostrarArticulos();
        System.out.println("¿Cuál artículo desea modificar? ");
        int opcionArticuloModificar = sc.nextInt();
        sc.nextLine();
        int opcionElementoModificar = solicitarElementoModificar();
        if(opcionElementoModificar==1){
            System.out.println("¿Cuál será el nuevo nombre del artículo? ");
            listaArticulos.get(opcionArticuloModificar-1).setNombre(sc.nextLine());
        } else if(opcionElementoModificar==2){
            System.out.println("¿Cuál será el nuevo modelo del artículo? ");
            listaArticulos.get(opcionArticuloModificar-1).setModelo(sc.nextLine());
        } else if(opcionElementoModificar==3){
            System.out.println("¿Cuál será la nueva descripción del artículo? ");
            listaArticulos.get(opcionArticuloModificar-1).setDescripcion(sc.nextLine());
        } else {
            System.out.println("¿Cuál será el nuevo precio del artículo? ");
            listaArticulos.get(opcionArticuloModificar-1).setPrecio(sc.nextFloat());
            sc.nextLine();
        }
        System.out.println("El artículo ha sido modificado exitosamente.");
    }
    public static int solicitarElementoModificar(){
        int opcionEntrada = 0;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("¿Qué deseas modificar? ");
            System.out.println("1. Nombre");
            System.out.println("2. Modelo");
            System.out.println("3. Descripción");
            System.out.println("4. Precio");
            System.out.print(" > ");
            try{
                opcionEntrada = sc.nextInt();
            } catch(InputMismatchException e){
                System.out.println("Por favor ingresa un dato válido.");
            }
            sc.nextLine();
            switch(opcionEntrada){
                case 1:
                case 2:
                case 3:
                case 4:
                    return opcionEntrada;
                default:
                    System.out.println("Por favor ingresa una opción válida.");
                    break;
            }
        }
    }
    public static void mostrarArticulos(){
        System.out.println("#\t\tNombre\t\tModelo\t\t\tDescripción\t\tPrecio");
        for (int i = 0; i < listaArticulos.toArray().length; i++){
            ArticuloElectronico articuloElectronico = listaArticulos.get(i);
            System.out.println((i+1)+"\t\t"+articuloElectronico.getNombre()+"\t\t"+articuloElectronico.getModelo()+"\t\t\t"+articuloElectronico.getDescripcion()+"\t\t"+articuloElectronico.getPrecio());
        }
    }
}
