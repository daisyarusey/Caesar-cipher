import java.util.Scanner;
import models.Encrypt;
import models.Decrypt;

public class App {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Welcome to  Ceaser Cipher ");
        System.out.println("Do you want to encrypt or decrypt?");
        String choice = myScanner.next();



        if (choice.equalsIgnoreCase("encrypt")) {
            System.out.println("Let's now encrypt your text");
            System.out.println("Enter text to encrypt");
            String text = myScanner.next();
            System.out.println("Enter shift key");
            int key = myScanner.nextInt();
            if (key<1 || key>25){

                System.out.println("Key must be between 1 and 25");
            }else {

                Encrypt encrypt = new Encrypt(text, key);
                String cipher = encrypt.setCipher();
                System.out.println("Here is your encrypted text:" + " " + cipher);
            }

        } else if (choice.equalsIgnoreCase("decrypt")) {
            System.out.println("Enter encrypted text");
            String encryptedText = myScanner.next();
            System.out.println("Enter the shift key");
            int decryptKey = myScanner.nextInt();
            if (decryptKey<1 || decryptKey>25){

                System.out.println("Key must be between 1 and 25");
            }else {

                Decrypt decrypt = new Decrypt(encryptedText, decryptKey);
                String decipher = decrypt.setDecipher();
                System.out.println("Here is your decrypted text:" + " " + decipher);
            }
        }else {
            System.out.println("Invalid input");

        }
    }

}




