public class CheckerSubstring {
    public static void main(String[] args) {


    }

    public int solution(String str1, String str2) {
        int answer = 0;
        if (str2.contains(str1)) {
            answer = 1;
        }

        return answer;
    }
}
