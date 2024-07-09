public class SimpleAdd {

    public static void main(String[] args) {
        SimpleAdd simpleAdd = new SimpleAdd();
        System.out.println(simpleAdd.solution(3, 5));
    }

    public long solution(int a, int b) {
        return sumAtoB(Math.min(a, b), Math.max(b, a));
    }

    private long sumAtoB(long a, long b) {
        return (b - a + 1) * (a + b) / 2;
    }
}
