
package helloworld;

import java.util.Scanner;

public class HelloWorld {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Who are you?");
        System.out.println("Hello "+scanner.nextLine());
    }
    
}
