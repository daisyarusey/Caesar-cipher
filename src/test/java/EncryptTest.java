import org.junit.Test;

import static org.junit.Assert.*;

public class EncryptTest {
    @Test
    public void encrypt_encryptText_String(){
        Encrypt testEncrypt = new Encrypt();
        assertEquals("JK", testEncrypt.Encrypt("HI",2));
    }

    @Test
    public void encrypt_instantiatesCorrectly_true() {
        Encrypt testCaesar = new Encrypt();
        assertTrue(testCaesar instanceof Encrypt);
    }

    @Test
    public void encrypt_testErrorMessage_String(){
        Encrypt testError =new Encrypt();
        assertEquals("Key must be between 0 and 25",testError.Encrypt("HI",28));
    }
}