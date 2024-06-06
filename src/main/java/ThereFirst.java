import java.util.*;

public class ThereFirst {

    public static void main(String[] args) {
        ThereFirst thereFirst = new ThereFirst();

        String hope_number1 = "123-4XX";
        String[] exist_number1 = {"123-XX0", "XXX-4X1", "123-4X2", "123-4X3", "123-4X4", "123-4X5", "123-4X7", "123-4X8", "123-4X9", "123-456", "XXX-X9X"};

        String hope_number2 = "0XX-XXX";
        String[] exist_number2 = {"0XX-XX0", "0XX-XX1", "0XX-XX2", "0XX-XX3", "0XX-XX4", "XXX-XX5", "XXX-XX6", "XXX-XX7" ,"XXX-XX8", "XXX-XX9"};

        String[] sol1 = thereFirst.solution(hope_number1, exist_number1);
        String[] sol2 = thereFirst.solution(hope_number2, exist_number2);

        System.out.println("Solution 1");
        for (String s: sol1) {
            System.out.print(s + " ");
        }
        System.out.println();

        System.out.println("Solution 2");
        for (String s: sol2) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public String[] solution(String hope_number, String[] exist_number) {
        List<String> availableEveryNumber = generateAvailableNumbers(hope_number);
        Set<String> existingNumbers = new HashSet<>();

        for (String number: exist_number) {
            existingNumbers.addAll(generateAvailableNumbers(number));
        }

        availableEveryNumber.removeIf(existingNumbers::contains);

        if (availableEveryNumber.isEmpty()) {
            return new String[]{"-1"};
        }

        Collections.sort(availableEveryNumber);
        return availableEveryNumber.toArray(new String[0]);
    }

    private List<String> generateAvailableNumbers(String number) {
        List<String> numbers = new ArrayList<>();
        generateNumbersHelper(number, "", numbers);
        return numbers;
    }

    private void generateNumbersHelper(String number, String current, List<String> numbers) {
        if (number.isEmpty()) {
            numbers.add(current);
            return;
        }

        char c = number.charAt(0);
        if (c == 'X') {
            for (char i = '0'; i <= '9'; i++) {
                generateNumbersHelper(number.substring(1), current + i, numbers);
            }
        } else {
            generateNumbersHelper(number.substring(1), current + c, numbers);
        }
    }
}
