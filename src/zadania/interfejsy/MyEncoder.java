package zadania.interfejsy;

public class MyEncoder implements Encoder {

    public String encode(String text){
        String result = "";
        for(int i=0;i<text.length();i++){
            char c = text.charAt(i);
            char zaszyfrowanyZnak = (char)((c + 1) % 256);
            result += zaszyfrowanyZnak;
        }
        return result;
    }
}
