
package Hilos;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class HilosFecha extends Thread {
    javax.swing.JLabel jLabel1, jLabel2;
    String fechaDate, fechaHora;
    int contador;

    public HilosFecha(){
        contador=1;
    }
    
    public void run(){
        while(true){
            obtenerFecha();
            jLabel1.setText(fechaDate);
            jLabel2.setText(fechaHora);
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(HilosFecha.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void recibeJLabel(javax.swing.JLabel jLabel1, javax.swing.JLabel jLabel2){
        this.jLabel1= jLabel1;
        this.jLabel2= jLabel2;
    }
    
    public void obtenerFecha(){
        Date fecha1 = new Date();
        SimpleDateFormat formatofecha1= new SimpleDateFormat("E, MMM dd yyyy");
        fechaDate = formatofecha1.format(fecha1); 
       
        
        Date fecha2 = new Date();
        SimpleDateFormat formatofecha2= new SimpleDateFormat("hh:mm");
        fechaHora = formatofecha2.format(fecha2); 
        
    }

    
}
