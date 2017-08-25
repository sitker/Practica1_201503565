/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas_201503565;

/**
 *
 * @author Merari
 */
public class matriz_201503565 {

    boolean valid;
    int num, mina;
    String matrMinas[][];

    public matriz_201503565() {
        valid = false;
        

    }

    public void creaMinas(int num, int mina) {
        
        matrMinas = new String[num][mina];
        for (int c = 0; c < num; c++) { //Llenado de matriz con 0
            for (int f = 0; f < num; f++) {
                matrMinas[c][f] = "[0]";
            }
        }

        int numero, numero2;
        for (int n = 0; n < (mina); n++) {
            numero = (int) (Math.random() * num) + 0;
            numero2 = (int) (Math.random() * num) + 0;
            if ((matrMinas[numero][numero2]).equals("[0]")) {
                matrMinas[numero][numero2] = "[*]";
                valid = true;
            } else {
                do {
                    int numN = (int) (Math.random() * num) + 0;
                    int numN2 = (int) (Math.random() * num) + 0;
                    if ((matrMinas[numN][numN2]).equals("[0]")) {
                        matrMinas[numN][numN2] = "[*]";
                        valid = false;
                    }
                } while (valid);
            }
        }
                        for (int c = 0; c < num; c++) { // imprime la matriz con minas
            for (int f = 0; f < num; f++) {
                System.out.print(matrMinas[c][f]);
                if (f == (num - 1)) {
                    System.out.print("\n");
                }
            }
        }

    }
    

}
