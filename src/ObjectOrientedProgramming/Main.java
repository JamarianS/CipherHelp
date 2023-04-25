package ObjectOrientedProgramming;

import java.util.Scanner;

public class Main {

    public void main(String[] args){ //add static
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String message = input.nextLine();
        System.out.println("Enter 1 for this message to be Encrypted or 2 if you want it Decrypted: ");
        int choice = input.nextInt();
        //your program must ask shift value
        CaesarCipher cc = new CaesarCipher();

        if(choice == 1){
            System.out.println("Encrypted message is: " + cc.encrypt(message));
        }
        else if(choice == 2){
            System.out.println(cc.decrypt(cc.encrypt(message)));
        }
        else{
            System.out.println("Invalid Input, Please Try Again!");
        }
    }
}