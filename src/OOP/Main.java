package OOP;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a message to be encrypted or decrypted: ");
        String message = scanner.nextLine();

        System.out.print("Enter an encryption key: ");
        int key = scanner.nextInt();

        CaesarCipher cipher = new CaesarCipher(key);


        System.out.print("Enter 'encrypt' or 'decrypt': ");
        String operation = scanner.next();

        String result = "";

        if (operation.equals("encrypt")) {
            result = cipher.encrypt(message);
        } else if (operation.equals("decrypt")) {
            result = cipher.decrypt(message);
        } else {
            System.out.println("Invalid operation.");
            System.exit(1);
        }

        System.out.println("Result: " + result);
    }
}
