public class SmallerSubString {

    public static void main(String[] args) {
        SmallerSubString smallerSubString = new SmallerSubString();

        String t1 = "3141592";
        String t2 = "500220839878";
        String t3 = "10203";

        String p1 = "271";
        String p2 = "7";
        String p3 = "15";

        System.out.println(smallerSubString.solution(t1, p1));
        System.out.println(smallerSubString.solution(t2, p2));
        System.out.println(smallerSubString.solution(t3, p3));
    }

    public int solution(String t, String p) {
        int answer = 0;

        for (int i = 0; i <= t.length() - p.length(); i++) {

            long parsed = Long.parseLong(t.substring(i, i + p.length()));
            long converted = Long.parseLong(p);

            if (parsed <= converted) {
                answer++;
            }
        }

        return answer;
    }
}
