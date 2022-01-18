import java.util.Locale;

class StringCovert{
    public String UpToLow(String a){
        if(a.length() <= 5){
            a = a.toUpperCase();
        }
        else{
            a = a.toLowerCase();
        }
        return a;
    }
}

public class CaseChanger {
    public static void main(String[] args){
        StringCovert objOf = new StringCovert();
        String a = "Thing";
        System.out.println("Changed the case: "+objOf.UpToLow(a));
    }
}
