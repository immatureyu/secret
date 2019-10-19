import java.lang.*;
public class testDemon
{
    public static void main(String args[])
    {
        MutableStringArray mutableStringArray=new MutableStringArray();
        String[] stringArray={"Aes","B","C"};
        mutableStringArray.add(stringArray);
        mutableStringArray.add("D");
        mutableStringArray.addAt("E",0);
        mutableStringArray.deleteLast();
        mutableStringArray.deleteAt(2);
        mutableStringArray.changeAt("F",2);
        System.out.println(mutableStringArray.get(2));
        System.out.println(mutableStringArray.contains("C"));
        System.out.println(mutableStringArray.getLength());
        mutableStringArray.clear();
    }
}
 class   MutableStringArray
{
    int n=0;
    private String[] str=new String[0];
    public boolean add(String s)
    {
        str=new String[getLength()+1];
        n+=1;
        str[getLength()-1]=s;
        return true;
    }
    public void add(String[] s)
    {
        str=new String[getLength()+s.length];
        for(int i=0;i<s.length;i++)
            str[getLength()+i]=s[i];
        n+=s.length;
    }
    public boolean addAt(String s,int index)
    {
        str=new String[getLength()+1];
        n+=1;
        for(int i=getLength()-1;i>index;i--)
            str[i]=str[i-1];
        str[index]=s;
        return true;
    }
    public boolean deleteLast()
    {
        str=new String[getLength()-1];
        n-=1;
        return true;
    }
    public boolean deleteAt(int index)
    {
        for(int i=index;i<getLength()-1;i++)
            str[i]=str[i+1];
        str=new String[getLength()-1];
        n-=1;
        return true;
    }
    public boolean clear()
    {
        str=new String[0];
        n=0;
        return true;
    }
    public void changeAt(String s,int index)
    {
        str[index]=s;
    }
    public String get(int index)
    {
        return str[index];
    }
    public boolean contains(String s)
    {
        for(int i=0;i<getLength();i++)
        {
            if (str[i] == s)
                return true;
        }
        return false;
    }
    public int getLength()
    {
        return n;
    }
}