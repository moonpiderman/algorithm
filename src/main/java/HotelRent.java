import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class HotelRent {
    public static void main(String[] args) {

    }

    public int solution(String[][] book_time) {
        int n = book_time.length;
        int[][] times = new int[n][2];
        for (int i = 0; i < n; i++) {
            times[i][0] = convertToMinutes(book_time[i][0]);
            times[i][1] = convertToMinutes(book_time[i][1]) + 10; // add 10 minutes for cleaning
        }

        Arrays.sort(times, Comparator.comparingInt(a -> a[0]));

        PriorityQueue<Integer> rooms = new PriorityQueue<>();
        for (int[] time : times) {
            if (!rooms.isEmpty() && rooms.peek() <= time[0]) {
                rooms.poll();
            }
            rooms.offer(time[1]);
        }

        return rooms.size();
    }

    private int convertToMinutes(String time) {
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        return hours * 60 + minutes;
    }
}
