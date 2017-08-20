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
        matrizDibujada(num);
        matrizMinas(num, num);
         System.out.println("El numero de la matriz es: "+ num);
         
         
    }

    private void lvlInter(int num) {
         System.out.println("El numero de la matriz es: "+ num);
         matrizDibujada(num);
         matrizMinas(num, num+2);
    }

    private void lvlExpert(int num) {
         System.out.println("El numero de la matriz es: "+ num);
         matrizDibujada(num);
         matrizMinas(num, num+4);
    }

    private void matrizDibujada(int num) {
        String matrInic[][] = new String[num][num];
         for (int c=0; c<num; c++){
             for(int f=0; f<num; f++){
                 matrInic[c][f]= "[X]";
                 System.out.print(matrInic[c][f]);
                 if(f==(num-1)){
                     System.out.print("\n");
                 }
             }
         }
         System.out.print("\n");
         
    }

    private void matrizMinas(int num, int mina) {
        boolean valid;
            valid = false;
        
        String matrMinas[][] = new String[num][num];
            for (int c=0; c<num; c++){ //Llenado de matriz con 0
               for(int f=0; f<num; f++){
                    matrMinas[c][f]= "[0]";
                }
            }
            
        int numero, numero2;
            for(int n=0; n<(mina); n++){
                numero = (int) (Math.random() * num) + 0;
                numero2 = (int) (Math.random() * num) + 0; 
                if((matrMinas[numero][numero2]).equals("[0]")){
                    matrMinas[numero][numero2] = "[*]";
                    valid = true;
                }else{
                   do{
                       int numN = (int) (Math.random() * num) + 0;
                       int numN2 = (int) (Math.random() * num) + 0; 
                        if((matrMinas[numN][numN2]).equals("[0]")){
                            matrMinas[numN][numN2] = "[*]";
                            valid = false;
                        }
                   }while(valid);
                }
            }
            
             for (int c=0; c<num; c++){
             for(int f=0; f<num; f++){
                 System.out.print(matrMinas[c][f]);
                 if(f==(num-1)){
                     System.out.print("\n");
                 }
             }
         }
            
    }
    
}
