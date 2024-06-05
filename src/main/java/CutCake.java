public class CutCake {
    public static void main(String[] args) {
        CutCake cutCake = new CutCake();

        int[] topping1 = {1, 2, 1, 3, 1, 4, 1, 2};
        int[] topping2 = {1, 2, 3, 1, 4};

        System.out.println(cutCake.solution(topping1));
        System.out.println(cutCake.solution(topping2));
    }

    public int solution(int[] topping) {
        int maxTopping = 10000;
        int[] leftToppings = new int[maxTopping + 1];
        int[] rightToppings = new int[maxTopping + 1];
        int leftUnique = 0;
        int rightUnique = 0;

        int fairCutCount = 0;

        for (int t : topping) {
            if (rightToppings[t]++ == 0) {
                rightUnique++;
            }
        }

        for (int i = 0; i < topping.length - 1; i++) {
            if (leftToppings[topping[i]]++ == 0) {
                leftUnique++;
            }
            if (--rightToppings[topping[i]] == 0) {
                rightUnique--;
            }

            if (leftUnique == rightUnique) {
                fairCutCount++;
            }
        }

        int p = 1;

        return fairCutCount;
    }
}
