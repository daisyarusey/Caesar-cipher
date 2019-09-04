package models;

public class Encrypt {
    private String cipher="";
    private String text;
    private int key;
    private String errorMessage="";

public Encrypt(String text, int key){
this.text = text;
this.key= key;
if (key<1 || key>25){
    errorMessage= "Key must be between 0 and 25";
}else {
    for (int i = 0; i < text.length(); i++) {
        char ch = text.charAt(i);
        if (Character.isLetter(ch)){
            if (Character.isLowerCase(ch)) {
                char c = (char) (ch + key);
                if (c > 'z') {
                    cipher += (char) (ch - (26 - key));
                }
                else {
                    cipher += c;
                }
            }
            else if (Character.isUpperCase(ch)){
                char c = (char) + (ch + key);
                if (c >'Z'){
                    cipher += (char)(ch -(26 - key));
                }
                else {
                    cipher += c;
                }
            }
        }
        else {
            cipher += ch;
        }
    }
    }

}




public String setCipher(){

    return cipher;
    }

    public String setErrorMessage(){

    return errorMessage;
    }

}


