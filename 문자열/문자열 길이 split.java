package example01;

import com.sun.tools.javac.Main;

import java.util.Scanner;
///가장 긴단어
 class findStr {

     public String solution(String str) {
         String answer="";

         int m = Integer.MIN_VALUE;
         String[] s =str.split("");
         for(String x :s){
             int len = x.length();
             if(len>m){
                 m=len;
                 answer=x;
             }
         }
         return answer;
     }

    public static void main(String[] args) {
         findStr T = new findStr();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));

    }
}





