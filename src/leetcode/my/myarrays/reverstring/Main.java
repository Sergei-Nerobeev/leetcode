package leetcode.my.myarrays.reverstring;

public class Main {
    public static void main(String[] args) {
        var word = reversWord("Nike");
        System.out.println(word);
    }
//    напиши функцию, которая переворачивает строку.
//    Она должна принимать строку и возвращать перевернутую.
//    Можно использовать только методы класса String, циклы, переменные и массивы.
//
//    Пример: Нос -> соН


    public static String reversWord(String word) {
        char[] arr = word.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            result.append(arr[i]);
        }
        return result.toString();
    }
}
