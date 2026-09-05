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
                  break;

                  case 3:
                    System.out.println("Ingrese el nombre del producto nuevo");
                    String nuevo = leer.nextLine();
                    boolean guardado = false;

                    for(int i = 0; i < productos.length; ++i){
                        if(productos[i] == null){
                            productos[i] = nuevo;
                            guardado = true;
                            System.out.println("Producto guardado con exito");
                            break;
                        }
                    }
                    if(!guardado){
                        System.out.println("No hay espacio en la bodega");
                    }

                    case 4:
                    siExiste = false;
                    System.out.println("Cerrando aplicacion");
                    break;
              
                    default:System.out.println("Esta opcion no es valida");
                break;
        }
        }
        leer.close();
          
            
    

    }
}

public static Boolean buscarProducto(String[] arreglo, String nombreBuscado){
    for (String elemento: arreglo){
        if (elemento != null && elemento.equalsIgnoreCase(nombreBuscado)){
            return  true;
        }
    }
    return false;
}