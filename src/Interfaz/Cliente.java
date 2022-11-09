
package Interfaz;



public abstract class Cliente
{
int ID,Descuento;
String Nombre,Apepat;

public Cliente(int id,String name,String Apepat,int Descuento)
{
this.ID=id;
this.Nombre=name;
this.Apepat=Apepat;

}
public Cliente(int id,String name,int Descuento)
{
this.ID=id;
this.Nombre=name;
}
public Cliente(){};
public abstract void calcularDeascuento();
}
