import org.junit.Test;

import static org.junit.Assert.*;

public class DecryptTest {
    @Test
    public void decrypt_instantiatesCorrectly_true() {
        Decrypt testCaesar = new Decrypt("HI",2);
        assertTrue(testCaesar instanceof Decrypt);
    }


}