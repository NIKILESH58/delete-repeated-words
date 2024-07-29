import java.util.*;
class deletedupwords
{
    public static void main (String args[])
    {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        line=line+" ";
        String words[]=new String[1000];
        String wordss[]=new String[1000];
        String word="";
        int counter=0,counter2=0;
        int length=line.length();
        for(int i=0;i<length;i++)
        {
            char character=line.charAt(i);
            if(character==' ')
            {
               words[counter]=word;
               counter=counter+1;
               word="";
            }
            else
            word=word+character;
        }
        for(int i=0;i<counter;i++)
        {
            if(words[i]=="@")
            continue;
            wordss[counter2]=words[i];
            for(int j=i+1;j<=counter;j++)
            {
                if(words[i].equals(words[j]))
                {
                    words[j]="@";
                }
            }
            counter2++;
        }
        for(int i=0;i<counter2;i++)
        {
            if(wordss[i]!="@")
            System.out.print(wordss[i]+" ");
        }
    }
}