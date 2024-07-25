package leetcode.recurs;

public class RecExample {


        public static void main(String[] args) {
            iteration(1000, 0);
        }

        static int iteration(int max, int cur) {
            if (cur == max) return max;

            System.out.println(cur);

            return iteration(max, ++cur);
        }

    }

