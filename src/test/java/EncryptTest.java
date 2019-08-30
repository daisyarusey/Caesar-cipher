import org.junit.Test;

import static org.junit.Assert.*;

public class EncryptTest {
    @Test
    public void encrypt_encryptText_String(){
        Encrypt testEncrypt = new Encrypt();
        String expectedOutput = "JK";
        assertEquals(expectedOutput,testEncrypt.encrypt("HI",2));
    }



}