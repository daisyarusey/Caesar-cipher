public class Decrypt {
    private String decipher="";
    private String encryptedText;
    private int decryptKey=2;
    private String errorMessage="";
    public Decrypt(String encryptedText, int decryptKey){

        if(decryptKey<1 || decryptKey>25){
            errorMessage= "Key must be between 0 and 25";
        }
        else {
            for (int i = 0; i < encryptedText.length(); i++) {
                char ch = encryptedText.charAt(i);
                char shifted = (char) (ch - decryptKey);
                decipher += shifted;
            }

        }
    }


    public String setErrorMessage() {
        return errorMessage;
    }

    public void setEncryptedText(String encryptedText) {
        this.encryptedText = encryptedText;
    }

    public String getEncryptedText() {
        return encryptedText;
    }

    public String setDecipher(){

        return decipher;
    }

    public int getDecryptKey() {
        return decryptKey;
    }
}
