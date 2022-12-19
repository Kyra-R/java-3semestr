package work7;

public interface InterfaceString {
    public int countSymbols(char c);
    public String newString();
    public void invertString();
}

class ProcessStrings implements InterfaceString{
    public String curs;
    public ProcessStrings(String s){
        curs = s;
    }
    public int countSymbols(char c){
        int count = 0;
        for(int i=0;i<curs.length();i++){
            if(curs.charAt(i)==c){
                count++;
            }
        }
        return count;
    }
    public String newString(){
        String s="";

        for(int i=0;i<curs.length()-1;i++){
            s=s+curs.charAt(i)+" ";
        }
        s=s+curs.charAt(curs.length()-1);
        return s;
    }
    public void invertString() {
        String s="";
        char c;
        for(int i=0;i<curs.length();i++){
            s+=curs.charAt(curs.length()-1-i);
        }
        curs=s;
    }
}