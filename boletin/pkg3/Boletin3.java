/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg3;

import java.util.Scanner;

/**
 *
 * @author vmontestovar
 */
public class Boletin3 {


     
    public static void main(String[] args) {
        Consumo obxConsumo1 = new Consumo();
        obxConsumo1.amosar();
        obxConsumo1.setKms(50f);
       obxConsumo1.setpGas(1.57f);
       Consumo obxConsumo2= new Consumo(30,50,90,1.32f);
       float valor=obxConsumo2.consuMedio();
       System.out.println(" consumo medio = "+ valor);
       obxConsumo2.setLitros(10);
     
       /* float var=obxConsumo2.getvMed();
       
       */
       Scanner sc =new Scanner(System.in);
      System.out.println("a velocidade media e "+obxConsumo2.getvMed());
      System.out.println(" cantos litros : ");
      float litro = sc.nextFloat();
      obxConsumo1.setLitros(litro);
      System.out.println(obxConsumo1.getLitros());
      
      
       
    
       
       
        
    }
        
        
                
                
        // TODO code application logic here
    }
    
