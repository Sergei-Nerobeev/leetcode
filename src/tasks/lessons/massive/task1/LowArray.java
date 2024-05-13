package tasks.lessons.massive.task1;

public class LowArray {

    private int arrIndex;
    private int[] lowArr;

    public LowArray(int arrIndex) {
        this.arrIndex = arrIndex;
        lowArr = new int[arrIndex];
    }
    public int fill(int num) {
        for (int i = 0; i < lowArr.length; i++) { //заполняет 2 весь массив
          lowArr[i] = num;
        }
        return lowArr[num];
    }
}
