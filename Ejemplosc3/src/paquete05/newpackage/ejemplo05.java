/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05.newpackage;

/**
 *
 * @author LAB.ELECT
 */
public class ejemplo05 {
    public static void main(String[] args) {
    int [][] arreglo1 = {{10,41,40},{1,2,3},{1,12,4}};
    int suma = 0;
    for (int fila = 0; fila < arreglo1.length; fila++){
      for (int col = 0; col < arreglo1[fila].length;col++){
          int c=0;
          if(arreglo1[fila][col]==10 || arreglo1[fila][col]== 2 || 
                  arreglo1[fila][col] == 4){
              suma = suma +arreglo1[fila][col];
          }
      }
    }
    System.out.println(suma);
}
}
//