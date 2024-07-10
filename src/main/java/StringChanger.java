public class StringChanger {

    public static void main(String[] args) {
        StringChanger stringChanger = new StringChanger();
        System.out.println(stringChanger.solution("1234"));
        System.out.println(stringChanger.solution("-1234"));
    }

    public int solution(String str) {
        boolean sign = true;
        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '-')
                sign = false;
            else if(ch !='+')
                result = result * 10 + (ch - '0');
        }
        return sign?1:-1 * result;
    }
}
