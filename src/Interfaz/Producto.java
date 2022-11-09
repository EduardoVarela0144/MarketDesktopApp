
package Interfaz;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Scanner;


public class Producto extends MiniAbastos implements Serializable{
int ID;
String Nombre,Tipo;
Float Precio;


Producto(int identificador , String Name,String Type, Float Costo){
this.ID=identificador;
this.Nombre=Name;
this.Tipo=Type;
this.Precio=Costo;
}



    

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
	}
}

