import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class FindPrimeNumber {
    public static void main(String[] args) {
        FindPrimeNumber findPrimeNumber = new FindPrimeNumber();
        System.out.println(findPrimeNumber.solution("17"));
        System.out.println(findPrimeNumber.solution("011"));
        System.out.println(findPrimeNumber.solution("1234"));
    }

    public int solution(String numbers) {
        AtomicInteger answer = new AtomicInteger(0);

        Set<String> combinations = findAll(numbers);

        combinations.forEach(combination -> {
            if (isPrime(Integer.parseInt(combination))) {
                answer.incrementAndGet();
            }
        });

        return answer.get();
    }

    public static Set<String> findAll(String str) {
        return findAllCombinations(str, "", new HashSet<>());
    }

    private static Set<String> findAllCombinations(String str, String combination, Set<String> combinations) {
        String p = "";
        if (!combination.isEmpty() && combination.charAt(0) != '0') {
            combinations.add(combination);
        }

        for (int i = 0; i < str.length(); i++) {
            findAllCombinations(str.substring(0, i) + str.substring(i + 1), combination + str.charAt(i), combinations);
        }

        return combinations;
    }

    public boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
