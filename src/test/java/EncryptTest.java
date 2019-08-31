import org.junit.Test;

import static org.junit.Assert.*;

public class EncryptTest {


    @Test
    public void encrypt_encryptText_String(){
        Encrypt testEncrypt = new Encrypt("HI",2);
        assertEquals("JK",testEncrypt.setCipher());
    }

    @Test
    public void encrypt_instantiatesCorrectly_true() {
        Encrypt testCaesar = new Encrypt("HI",2);
        assertTrue(testCaesar instanceof Encrypt);
    }

    @Test
    public void encrypt_testErrorMessage_number(){
        Encrypt testError =new Encrypt("HI",28);
        assertEquals("Key must be between 0 and 25",testError.setErrorMessage());
    }
}