import java.util.Scanner;

public class Bodega {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        boolean siExiste = true;
        int opcion = 0;
        String nombreProducto;
        String[] productos = new String[5];
        productos[0] = "Ducales";
        productos[1] = "Festival";
        productos[2] = "Tosh";
        productos[3] = null;
        productos[4] = null;

        while (siExiste){
            System.out.println("BODEGA DE PRODUCTOS");
            System.out.println("Seleccione una opcion");
            System.out.println("1 Buscar producto");
            System.out.println("2 Listar producto");
            System.out.println("3 Agregar producto");
            System.out.println("4 Salir");
            opcion = leer.nextInt();
            leer.nextLine();
        

        switch (opcion) {
            case 1:
                System.out.println("Productos en bodega");
                for (String item : productos){
                    if (item != null)
                        System.out.println("producto"+item);
                }
                break;
                
                case 2:
                  System.out.println("Ingrese el nombre del producto a buscar ");
                  String nombreBuscado = leer.nextLine();  
                  boolean existe = buscarProducto(productos,nombreProducto);
                  

                  if(existe){
                    System.out.println("El producto" + nombreBuscado + "Si existe en la bodega");
                  }
                  else{
                    System.out.println("El producto" + nombreBuscado + "No se encuentra en bodega");
                  }

        
            default:
                break;
        }
        }
          
            
    

    }
}

public static Boolean buscarProducto(String[] arreglo String nombreBuscado)