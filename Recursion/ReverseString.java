public class ReverseString {
    public static void main(String args[])
    {
       String res= reverse("Ayush Sahu");
       System.out.println("Reverse string is :"+res);
    }
    static String reverse(String name)
    {
        if(name.length()==0)
        {
            return " ";
        }
        String result=reverse(name.substring(1));
        char firstChar=name.charAt(0);
        return result+firstChar; 
        
    }


}
