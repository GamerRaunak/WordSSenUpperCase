import java.util.*;
public class WrdSSenUpperCase
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sentence: ");
        String s=sc.nextLine();
        String w=s.toLowerCase();
        s=s+" ";
        w=w+" ";
        int len=w.length();
        String wrd="";
        String wrd2="";
        char ch;
        for(int i=0;i<len-1;i++)
        {
            wrd="";
            wrd2="";
            while(w.charAt(i)!=' '){
                wrd=wrd+w.charAt(i);
                wrd2=wrd2+s.charAt(i);
                i++;
            }
            ch=(wrd.charAt(0));
            ch-=32;
            wrd2=ch+wrd2.substring(1);
            System.out.print(wrd2+" ");
        }
        
    }   
}
