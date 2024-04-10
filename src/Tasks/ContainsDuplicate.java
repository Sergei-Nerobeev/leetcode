package Tasks;


import java.util.HashSet;

public class ContainsDuplicate {
        public static void main(String[] args) {
            int[] numbers = new int[] {234, 345, 678, 34, 679458, 4856, 459683};
        boolean result = containsDuplicate(numbers);
            System.out.println(result);

    }
    public static boolean containsDuplicate(int[] numbs){
        HashSet<Integer> set = new HashSet<>();
        for (Integer i : numbs) {
            if (set.contains(i)) {
                return true;
            }
            set.add(i);

        }
        return false;
    }
}
