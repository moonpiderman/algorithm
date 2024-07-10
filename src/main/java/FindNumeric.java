public class FindNumeric {
    public static void main(String[] args) {

    }

    public int solution(int[] num_list, int n) {
        int answer = 0;
        for (int j : num_list) {
            if (j == n) {
                answer++;
                break;
            }
        }
        return answer;
    }
}
