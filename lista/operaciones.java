package lista;

import java.util.ArrayList;
import java.util.Scanner;

public class operaciones {
      public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
        
        ArrayList <principal> listaNombres = new ArrayList<>();
      
        boolean salir = false;
        while (!salir) {   
   
            System.out.println("*****OPCIONES*****");
            System.out.println("Seleccione una opción: ");
            System.out.println("");
            System.out.println(" 1 - Insertar dato a la lista ");
            System.out.println(" 2 - Leer lista");
            System.out.println(" 3 - Actualizar lista ");
            System.out.println(" 4 - Borrar elementos ");
            System.out.println(" 5 - Salir ");
            
            
            int opcion = Integer.parseInt(leer.nextLine());
           
           
            switch(opcion) {
                case 1: 
                    System.out.println("OPCIÓN 1:");
                    principal a = new principal();
                    System.out.println("Insertar dato a la lista");
                    
                    a.setNombre(leer.nextLine());
          
                    listaNombres.add(a);
 
                    break;
                case 2: 
                    
                    System.out.println("OPCIÓN 2:");
                    System.out.println(" ");
                   for(int i = 0; i < listaNombres.size(); i++){ 
                      // System.out.println("Nombre: " + (i + 1));
                       
                       principal muestra =  listaNombres.get(i); 
                       
                       System.out.println("Nombre: " + muestra.getNombre());
                   }      
                   System.out.println(" ");
                    break;
                case 3: 
                    
                     System.out.println("Actualizar lista");
                     String nombre = leer.nextLine();
                   
                    for (int i = 0; i < listaNombres.size(); i++) {
                        principal modifica = listaNombres.get(i);
                        if (nombre.equals(modifica.getNombre())) {
                            System.out.println("Dato: " + modifica.getNombre());
                            //System.out.println("Color: " + auto.getColor());
                            System.out.println("Ingrese el nuevo dato: ");
                            String cambio = leer.nextLine();

                            modifica.setNombre(cambio);                
                        }
                    }
                    System.out.println(" ");
                    
                 break;
                case 4:
                    System.out.println("OPCIÓN 4:");
                    System.out.println("Ingrese el elemento a eliminar: ");
                    String nom = leer.nextLine();                   
                    for (int i = 0; i < listaNombres.size(); i++) {
                        principal eliminar = listaNombres.get(i);      
                        if (nom.equals(eliminar.getNombre())) {
                            
                            listaNombres.remove(i);
                            System.out.println("Dato eleminado");
                        }
                    }            
                    System.out.println(" ");
                   
                    break;
                case 5:
                    salir = true;
                    System.out.println("Saliendo del programa");
                    break;
                default: 
                    System.out.println(" ");
                    System.out.println("Opción no encontrada");
                
            }
              System.out.println("\" Si deseas elegir otra opción del menu pon: 1.-Si  / 2.- No \"");
        int op = leer.nextInt();
                if(op==1){
                     operaciones.main(args);
                 } else{
                     System.out.println("Programa Finalizado");
                     System.exit(0);   
         }       
       } 
     }   
 }
