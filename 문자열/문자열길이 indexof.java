
import java.util.Scanner;
///가장 긴단어
 class findStr {

    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE, pos;
        while ((pos = str.indexOf(' ')) != -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > m) {
                m = len;
                answer = tmp;
            }
            str = str.substring(pos + 1);
        }
        if(str.length()>m) answer=str;
            return answer;
        }

        public static void main (String[]args){
            findStr T = new findStr();
            Scanner kb = new Scanner(System.in);
            String str = kb.next();
            System.out.println(T.solution(str));

        }
    }
