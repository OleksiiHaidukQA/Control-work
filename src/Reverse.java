public class Reverse {
    public void reverse() {

        String str= "reverse string", nstr="";
        char ch;

        System.out.print("Original word: ");
        System.out.println("reverse string");

        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i);
            nstr= ch+nstr;
        }
        System.out.println("Reversed word: "+ nstr);
    }
}
