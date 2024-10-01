import java.util.Scanner;

 class findStr {

     public String solution(String str, char t) {
         String answer="";

         for(char x : str.toCharArray()) {
             if (Character.isLowerCase(x)) answer += Character.toUpperCase(x);
             else answer += Character.toLowerCase(x);
         }
         return answer;
     }

    public static void main(String[] args) {
         findStr T = new findStr();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        System.out.println(T.solution(str, c));

    }
}
