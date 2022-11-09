
package Interfaz;

import java.util.concurrent.ThreadLocalRandom;

public class Publico extends Cliente
{
int numerodecontacto;
public Publico(int id,String name,String Apepat,int Descuento,int numerodecontacto)
{
this.ID=id;
this.Nombre=name;
this.Apepat=Apepat;
this.numerodecontacto=numerodecontacto;
}


@Override
public void calcularDeascuento()
{
    int min = 1;
        int max = 100;
        int ValorRandom = 0;
      
        for(int i = 1; i <=100; i++) {
        ValorRandom = ThreadLocalRandom.current().nextInt(min, max) + min;
        }
    
        if (this.ID==ValorRandom){ 
          this.Descuento=10;
          System.out.println("Felicidades tu numero salio ganador y tiene descuento de :"+this.Descuento);
          
         
            
        }
        else{
        this.Descuento=0;
        System.out.println("Tu numero no salio ganador");
         
        }
        
        
        
}

   
}