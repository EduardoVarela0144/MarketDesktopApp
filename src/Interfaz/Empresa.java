
package Interfaz;

public class Empresa extends Cliente
{
String Ubicacion;
public Empresa(int id,String name,int Descuento,String Ubicacion)
{
this.ID=id;
this.Nombre=name;
this.Ubicacion=Ubicacion;
}


@Override
public void calcularDeascuento()
{
 this.Descuento=5;
    System.out.println("Por ser una empresa se te aplico un descuento de :"+this.Descuento);
 
}

   
}

