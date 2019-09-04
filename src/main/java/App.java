import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import models.Encrypt;
import models.Decrypt;

public class App {
    public static void main(String[] args) {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("----CEASER CIPHER----");
        System.out.println("---------------------");
        System.out.println("Welcome to  Ceaser Cipher ");
        System.out.println("");


        try{
            System.out.println("Do you want to encrypt or decrypt?");
            String choice = bufferedReader.readLine();
            if (choice.equalsIgnoreCase("encrypt")) {
                System.out.println("Let's now encrypt your text");
                System.out.println("Enter text to encrypt");
                String text = bufferedReader.readLine();
                System.out.println("Enter shift key");
                int key = Integer.parseInt(bufferedReader.readLine());
                if (key<1 || key>25){

                    System.out.println("Key must be between 1 and 25");
                }else {

                    Encrypt encrypt = new Encrypt(text, key);
                    String cipher = encrypt.setCipher();
                    System.out.println("Here is your encrypted text:" + " " + cipher);
                }

            } else if (choice.equalsIgnoreCase("decrypt")) {
                System.out.println("Let's now decrypt your text");
                System.out.println("Enter text to decrypt:");
                String encryptedText = bufferedReader.readLine();
                System.out.println("Enter the shift key");
                int decryptKey = Integer.parseInt(bufferedReader.readLine());
                if (decryptKey<1 || decryptKey>25){

                    System.out.println("Key must be between 1 and 25");
                    System.out.println("Thank you for using Ceasar cipher. Come back again");
                }else {

                    Decrypt decrypt = new Decrypt(encryptedText, decryptKey);
                    String decipher = decrypt.setDecipher();
                    System.out.println("Here is your decrypted text:" + " " + decipher);
                    System.out.println("Thank you for using Ceasar cipher. Come back again");
                }
            }else {
                System.out.println("Invalid input");

            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

}




