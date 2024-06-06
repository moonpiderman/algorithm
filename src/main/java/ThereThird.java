public class ThereThird {

    public static void main(String[] args) {
        ThereThird thereThird = new ThereThird();

        String[] rp1 = {"AFFDEFDEFDEEC", "ABABABABBCCEF", "FFFFFFFFFFFFF", "FCBBBFCBBECBB"};
        int n1 = 3;
        int k1 = 2;

//        String[] rp2 = {"AFFDEFDEFDEEC", "ABABABABBCCEF", "FFFFFFFFFFFFF", "FCBBBFCBBECBB"};
//        int n2 = 2;
//        int k2 = 4;

//        String[] rp3 = {"FFCCAAFCCAAA", "ААААВВВВСССС", "АВСАВСАВСАВС"};
//        int n3 = 4;
//        int k3 = 2;

//        String[] rp4 = {"FFCCAAFCCAAA", "ААААВВВВСССС", "АВСАВСАВСАВС"};
//        int n = 3;
//        int k = 3;

        int[] sol1 = thereThird.solution(rp1, n1, k1);
//        int[] sol2 = thereThird.solution(rp2, n2, k2);
//        int[] sol3 = thereThird.solution(rp3, n3, k3);
//        int[] sol4 = thereThird.solution(rp4, n, k);

        System.out.println("Solution 1");
        for (int s: sol1) {
            System.out.print(s + " ");
        }
        System.out.println();

//        System.out.println("Solution 2");
//        for (int s: sol2) {
//            System.out.print(s + " ");
//        }
//        System.out.println();
//
//        System.out.println("Solution 3");
//        for (int s: sol3) {
//            System.out.print(s + " ");
//        }
//        System.out.println();
//
//        System.out.println("Solution 4");
//        for (int s: sol4) {
//            System.out.print(s + " ");
//        }
//        System.out.println();
    }

    public int[] solution(String[] replies, int n, int k) {
        int[] answer = new int[replies.length];
        for (int i = 0; i < replies.length; i++) {

            if (i == 3) {
                int p = 1;
            }

            String reply = replies[i];
            boolean isBad = false;
            for (int len = n; len <= reply.length(); len++) {
                for (int start = 0; start <= reply.length() - len; start++) {
                    String pattern = reply.substring(start, start + len);
                    int count = 0;
                    int index = 0;
                    while ((index = reply.indexOf(pattern, index)) != -1) {
                        count++;
                        index += len;
                    }
                    if (count >= k) {
                        isBad = true;
                        break;
                    }
                }
                if (isBad) {
                    break;
                }
            }
            answer[i] = isBad ? 0 : 1;
        }
        return answer;
    }
}