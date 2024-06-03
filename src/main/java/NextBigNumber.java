import java.util.Arrays;
import java.util.Stack;

public class NextBigNumber {
    public static void main(String[] args) {

        int[] numbers1 = {2, 3, 3, 5};
        int[] numbers2 = {9, 1, 5, 3, 6, 2};

        NextBigNumber nextBigNumber = new NextBigNumber();
        System.out.println(Arrays.toString(nextBigNumber.solution(numbers1)));
        System.out.println(Arrays.toString(nextBigNumber.solution(numbers2)));
    }

    public int[] solution(int[] numbers) {
        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[numbers.length];

        for (int i = numbers.length - 1; i >= 0; i--) {
            // Stack에 현재 값보다 작은 값들을 모두 제거
            // 즉 현재 값보다 큰 값들을 넣는다.
            while (!stack.isEmpty() && stack.peek() <= numbers[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                answer[i] = -1;
            } else {
                answer[i] = stack.peek();
            }

            stack.push(numbers[i]);
        }

        return answer;
    }
}
