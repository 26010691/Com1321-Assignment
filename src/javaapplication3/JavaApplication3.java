/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author 26010691
 */
import java.util.Scanner;
public class JavaApplication3 {

    
    public static void main(String[] args) {
        
        Scanner t = new Scanner(System.in);
        
        System.out.println("BRIGHT FUTURE TECHNOLOGIES APPLICATION");
        System.out.println("**************************************");
      
        while (true) {
        System.out.println("");
        System.out.print("Enter (1) to launch menu or any other key to exit : ");
    // store user input
        String value = t.nextLine();
        System.out.println("");
        if("1".equals(value.trim())){
            int choice = Products.DisplayMenu();
          
            switch(choice){
                case 1: Products.CaptureProduct();
                    break;
                case 2: Products.SearchProduct();
                    break;
                case 3: Products.UpdateProduct();
                    break;
                case 4: Products.DeleteProduct();
                    break;
                case 5: Products.PrintProductReport();
                    break;
                case 6: Products.ExitApplication();
                    break;
            }
        }
        else{  
            Products.ExitApplication();
        } 
            
        }
    
    }
    
}
    
    

