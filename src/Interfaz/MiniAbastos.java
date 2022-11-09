package Interfaz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import Interfaz.Dashboard;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MiniAbastos {
   
    static ArrayList<Producto>  produc = new ArrayList<Producto>();
    static ArrayList<Carrito>  carrito = new ArrayList<Carrito>();
    static ArrayList<Cliente>  clie = new ArrayList<Cliente>();


public  MiniAbastos () {
   
}
    
 
    
        
        
         public static void serializarObjetos()
    {
       FileOutputStream archivo;
       ObjectOutputStream salida;
       try{
       
           archivo= new FileOutputStream("productos.dat");
           salida= new ObjectOutputStream(archivo);
           if(salida!=null)
               salida.writeObject(produc);
           
           salida.close();
           
       }catch(Exception e1)
       {
         System.out.println("Error "+ e1.getMessage());
       }
    } 
         
    
          public static void deserializarObjetos()
    {
       FileInputStream archivo;
       ObjectInputStream entrada;
       try{
       
           archivo= new FileInputStream("productos.dat");
           entrada= new ObjectInputStream(archivo);
           if(entrada!=null)
              produc=(ArrayList<Producto>) entrada.readObject();
           
           entrada.close();
           
       }catch(Exception e1)
       {
         System.out.println("Error "+ e1.getMessage());
       }
    }

          
    
    }    
        
        




