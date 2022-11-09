
package Interfaz;

import java.util.Iterator;
import java.util.Scanner;


public class Carrito extends MiniAbastos{
int ID,Cantidad;
String Nombre,Tipo;
Float Precio;


Carrito(int identificador , String Name,String Type, Float Costo,int Cantidad){
this.ID=identificador;
this.Nombre=Name;
this.Tipo=Type;
this.Precio=Costo;
this.Cantidad=Cantidad;
}  
/*
public void CalcularIva(){
  if ("BebidaAlcoholica".equals(this.Tipo)){
  this.Precio=this.Precio+50;
  }
}

public int getID() {
		return ID;
	}

public String getNombre() {
		return Nombre;
	}

public String getTipo() {
		return Tipo;
	}

public float getPrecio() {
		return Precio;
	}*/
}

