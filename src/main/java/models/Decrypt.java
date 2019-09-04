package models;

public class Decrypt {
    private String decipher="";
    private String encryptedText;
    private int decryptKey;
    private String errorMessage="";
    public Decrypt(String encryptedText, int decryptKey){

        if(decryptKey<1 || decryptKey>25){
            errorMessage= "Key must be between 0 and 25";
        }
        else {
            for (int i = 0; i < encryptedText.length(); i++) {
                char ch = encryptedText.charAt(i);
                if (Character.isLetter(ch)){
                    if (Character.isLowerCase(ch)) {
                        char c = (char) (ch - decryptKey);
                        if (c > 'z') {
                            decipher += (char) (ch - (26 + decryptKey));
                        }
                        else {
                           decipher  += c;
                        }
                    }
                    else if (Character.isUpperCase(ch)){
                        char c = (char) + (ch - decryptKey);
                        if (c >'Z'){
                            decipher += (char)(ch -(26 + decryptKey));
                        }
                        else {
                            decipher += c;
                        }
                    }
                }
                else {
                    decipher += ch;
                }
            }

        }
    }


    public String setErrorMessage() {
        return errorMessage;
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
