public class Encrypt {
    private String cipher="";
    private String text;
    private int key;
    private String errorMessage="";
public  String encrypt(String text,int key){
this.text = text;
this.key= key;

    for (int i = 0; i < text.length(); i++) {
        char ch = text.charAt(i);
        char shifted = (char) (ch + key);
        cipher += shifted;
    }

    return cipher;
}

public int getKey(){

    return key;
}
public String getText(){
    return text;
}
public String setCipher(){
    return cipher;
    }
    public String setErrorMessage(){
    return errorMessage;
    }

}


