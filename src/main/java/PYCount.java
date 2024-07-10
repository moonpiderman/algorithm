public class PYCount {

    public static void main(String[] args) {
        PYCount pyCount = new PYCount();
        System.out.println(pyCount.solution("pPoooyY"));
        System.out.println(pyCount.solution("Pyy"));
    }

    boolean solution(String s) {
        int pCount = 0;
        int yCount = 0;
        for (char c : s.toCharArray()) {
            if (c == 'p' || c == 'P') {
                pCount++;
            } else if (c == 'y' || c == 'Y') {
                yCount++;
            }
        }
        return pCount == yCount;
    }
}
