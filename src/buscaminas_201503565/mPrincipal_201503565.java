/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas_201503565;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Merari
 */
public class mPrincipal_201503565 {
        boolean bandera;
        int opcion;
        Scanner lector;
    public mPrincipal_201503565() {
        opcion = 0;
        lector = new Scanner(System.in);  //se inicia aqui en el constructor porque es global
        bandera = false;
    }
   
    
    public void menuPrincipal() throws IOException{
        
               
        System.out.println("    Carlos Merari Aguirre Orozco");
        System.out.println("            201503565");
        System.out.println("        IPC 'A' PRactica 1");
        System.out.println("          BUSCAMINAS!!!!!");
        
        int aByte = System.in.read();
        System.out.println("El caracter es: " +aByte);
        if (aByte == 10){
            bandera = true;
        }
        
        if(bandera){
            
           do{
        System.out.println("***********************************");
        System.out.println("          BUSCAMINAS!!!!!");
        System.out.println("    Seleccione una opcion: ");
        System.out.println("    1. Principiante");
        System.out.println("    2. Intermedio");
        System.out.println("    3. Experto");
        System.out.println("    4. Salir");
        System.out.println("    Ingrese Opcion: ");
        opcion = lector.nextInt();
        System.out.println("***********************************");
 
            
            switch(opcion){
                case 1:
                    lvlPrin(4);
                    break;
                case 2:
                    lvlInter(6);
                    break;
                case 3:
                    lvlExpert(8);
                    break;
                case 4:
                    System.exit(0);
            }        
        }while(opcion != 4); 
            
        }else{
            menuPrincipal();
        }
    }

    private void lvlPrin(int num) {
         System.out.println("El numero de la matriz es: "+ num);
    }

    private void lvlInter(int num) {
         System.out.println("El numero de la matriz es: "+ num);
    }

    private void lvlExpert(int num) {
         System.out.println("El numero de la matriz es: "+ num);
    }
    
}
