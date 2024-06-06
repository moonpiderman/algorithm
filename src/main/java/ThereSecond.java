public class ThereSecond {

    public static void main(String[] args) {
        ThereSecond thereSecond = new ThereSecond();

        int[] numbers = {100, 101, 102, 103, 104};
        int[] start = {1, 2};
        int[] finish = {2, 4};

        int[] sol = thereSecond.solution(numbers, start, finish);
        for (int s: sol) {
            System.out.print(s + " ");
        }
    }

    public int[] solution(int[] numbers, int[] start, int[] finish) {
        int[] startSum = new int[numbers.length + 1];
        for (int i = 1; i <= numbers.length; i++) {
            startSum[i] = startSum[i - 1] + numbers[i - 1];
        }

        int[] answer = new int[start.length];
        for (int i = 0; i < start.length; i++) {
            if (start[i] == 0) {
                answer[i] = startSum[finish[i] + 1];
            } else {
                answer[i] = startSum[finish[i] + 1] - startSum[start[i]];
            }
        }

        return answer;
    }
}
