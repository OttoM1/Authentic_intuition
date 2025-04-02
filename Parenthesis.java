/*

This was a school assignment that was meant to validate balanced parentheses. In practice, a fairly straightforward task. 
I wanted to create some concrete material for others to see my authentic thought process.
I approached it intuitively with very little Java experience, just a basic idea of syntax and logic flow.
I gave myself a 30min time limit to perform.

The result? It almost did exactly what it was supposed to,
check if parentheses are used in the right way, like this example: (()))) = wrong, (()) = right.

The only thing I didn’t realize to add in time was that it also ought to accept things like ()() as correct. 
I ran out of time before I could tweak it.


---------SUMMARY----------

This functional yet chaotic code structure showcases how I:
Manage semi-complex control flow
Solve problems without relying on ANY external sources
Attack new challenges and languages 
Think in systems even when the syntax is semi-unfamiliar
Write under pressure

And additionally, my true core logic that is rooted in my thought process.

It’s not pretty but it’s real, HAHA.

*/




import java.util.Scanner;

public class Parenthesis {

    static boolean checkParenthesis(String s) {
        boolean isok = false;
/* my code starts here */

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
