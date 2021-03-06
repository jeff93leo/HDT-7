/*-----------------------------------------------------------------------------
Universidad del Valle de Guatemala

Cristhian Chilel  - 12417
Cristian del Carmen - 12961

Diccionario.java
-----------------------------------------------------------------------------*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Diccionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList array = new ArrayList();
        String linea = "";
       
        
        String str= "                      "; 
        int cont= 0;
        int letra_a_string;
        try
        {
        FileReader leerArchivo = new FileReader("diccionario.txt");
        BufferedReader buffer = new BufferedReader(leerArchivo);
        while ((linea = buffer.readLine()) != null)
        {
            cont = cont + 1;
            array.add(linea);
            if (cont==1){
            BinaryTree<String> House = new BinaryTree<String>(linea);
            System.out.println("Agregando : " + House.value());
            House.setParent(House);
            }
            
            if (cont==2){
            BinaryTree<String> Dog = new BinaryTree<String>(linea);
            System.out.println("Agregando : " + Dog.value());
            Dog.setLeft(Dog);
            Dog.setParent(Dog);
            
            
            
            }
            if (cont==3){
            BinaryTree<String> Homework = new BinaryTree<String>(linea);
            System.out.println("Agregando : " + Homework.value());
            Homework.setLeft(Homework);
            
            }
            
            if (cont==4){
            BinaryTree<String> Town = new BinaryTree<String>(linea);
            System.out.println("Agregando : " + Town.value());
            Town.setRight(Town);
            }
            
            if (cont==5){
            BinaryTree<String> Yes = new BinaryTree<String>(linea);
            System.out.println("Agregando : " + Yes.value());
            
            }

           
            
            
        }
        buffer.close();
       
}
        catch (Exception ex)
        { }
       
    }
    
}
