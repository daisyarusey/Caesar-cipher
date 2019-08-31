import org.junit.Test;

import static org.junit.Assert.*;

public class DecryptTest {
    @Test
    public void decrypt_instantiatesCorrectly_true() {
        Decrypt testCaesar = new Decrypt("JK",2);
        assertTrue(testCaesar instanceof Decrypt);
    }
    @Test
    public void decrypt_testErrorMessage_String(){
        Decrypt testError = new Decrypt("JK",0);
        assertEquals("Key must be between 0 and 25",testError.setErrorMessage());
    }
//    @Test void decrypt_testGetKey_int(){
//        Decrypt testGetKey = new Decrypt("JK",2);
//        assertEquals(2,testGetKey.getDecryptKey());
//    }

    @Test
    public void decrypt_decryptText_String(){
        Decrypt testEncrypt = new Decrypt("JK",2);
        assertEquals("HI",testEncrypt.setDecipher());
    }
}