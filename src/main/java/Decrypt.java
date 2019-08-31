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
}
