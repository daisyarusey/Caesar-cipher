import org.junit.Test;

import static org.junit.Assert.*;

public class DecryptTest {
    @Test
    public void decrypt_instantiatesCorrectly_true() {
        Decrypt testCaesar = new Decrypt("HI",2);
        assertTrue(testCaesar instanceof Decrypt);
    }
    @Test
    public void decrypt_testErrorMessage_Integer(){
        Decrypt testError = new Decrypt("HI",0);
        assertEquals("",testError.getErrorMessage());
    }


}