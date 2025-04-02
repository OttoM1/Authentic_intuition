import java.util.Scanner;

public class Parenthesis {

    static boolean checkParenthesis(String s) {
        boolean isok = false;
/* my code here */

 int b = 0;
 int a = 0;
 isok = true;
        for (int i = 0; i < s.length(); i++) {
         char me = s.charAt(i);
            



     if (me == '('){
                b++;
            }
            else if (me == ')') {
                a++;
            }
 if ( (a-b) < 0 || (a-b) > 0 || (b-a) < 0 || (b-a) > 0){
                isok = false;
            }
            else if ((a-b) == 0 || (b-a) == 0) {
                isok = true;
            }
        }

if (isok == true) {
boolean isok1 = true;
boolean isok2 = true;


int mid = s.length() / 2;
String st = s.substring(0, mid);
String nd = s.substring(mid);

for (int i = 0; i < st.length(); i++)
  {
    char d = st.charAt(i);
if(d != '(')
     isok1 = false;
 }




for (int g = 0; g < st.length(); g++)
  {
    char f = nd.charAt(g);
if(f != ')')
     isok2 = false;
 }

if (isok1 == true && isok2 == true) {
isok = true;
}
else {
    isok = false;
}

if (isok = true) {


    /* here next cahr check actually */

    /* 

 if (st%2 == 0){
 
isok = true;
 }
 else if () {
     System.out.println("Odd");
 }
  */

}
}

/* my code here */

            

        return isok;
    }

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        String s;
        boolean isok = false;

        System.out.print("Enter string > ");
        s = myObj.nextLine();

        isok = checkParenthesis(s);

        System.out.println("checkParenthesis(" + s + "): " + isok);

        myObj.close();
    }
}
