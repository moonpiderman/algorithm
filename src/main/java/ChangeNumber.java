import java.util.LinkedList;
import java.util.Queue;

public class ChangeNumber {
    public static void main(String[] args) {
        int x1 = 10;
        int x2 = 10;
        int x3 = 2;

        int y1 = 40;
        int y2 = 40;
        int y3 = 5;

        int n1 = 5;
        int n2 = 30;
        int n3 = 4;

        ChangeNumber changeNumber = new ChangeNumber();
        System.out.println(changeNumber.solution(x1, y1, n1)); // 2
        System.out.println(changeNumber.solution(x2, y2, n2)); // 1
        System.out.println(changeNumber.solution(x3, y3, n3)); // -1
    }

    public int solution(int x, int y, int n) {
        if (x == y) {
            return 0;
        }

        boolean[] visited = new boolean[1000001];
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, 0});

        while (!queue.isEmpty()) {
            int p = 1;
            int[] current = queue.poll();
            int currentValue = current[0];
            int currentCount = current[1];

            if (currentValue == y) {
                return currentCount;
            }

            if (currentValue + n <= 1000000 && !visited[currentValue + n]) {
                visited[currentValue + n] = true;
                queue.offer(new int[]{currentValue + n, currentCount + 1});
            }

            if (currentValue * 2 <= 1000000 && !visited[currentValue * 2]) {
                visited[currentValue * 2] = true;
                queue.offer(new int[]{currentValue * 2, currentCount + 1});
            }

            if (currentValue * 3 <= 1000000 && !visited[currentValue * 3]) {
                visited[currentValue * 3] = true;
                queue.offer(new int[]{currentValue * 3, currentCount + 1});
            }
        }

        return -1;
    }
}
