import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CustomList<T extends Number> {
    private List<T> nums;

    public CustomList() {
        this.nums = new ArrayList<>();
    }

    public List<T> getAllNums() {
        return this.nums;
    }

    public void addNum(T num) {
        nums.add(num);
    }

    class CustomListComparator implements Comparator<T> {
        boolean isAsc;

        public CustomListComparator() {
            this(true);
        }

        public CustomListComparator(boolean isAsc) {
            this.isAsc = isAsc;
        }

        @Override
        public int compare(T num1, T  num2) {
            int hasil = Double.compare(num1.doubleValue(), num2.doubleValue());

            if (isAsc == false) {
                return hasil * -1;
            }

            return hasil;
        }
    }

    public T low10() {
        nums.sort(new CustomListComparator());

        double ngitung = Math.ceil((double) nums.size() / 10.0);

        int low = (int) ngitung - 1;

        return nums.get(low);
    }


    public static void main(String[] args) {
        CustomList<Integer> num = new CustomList<Integer>();
        num.addNum(1);
        num.addNum(2);
        num.addNum(3);
        num.addNum(4);
        num.addNum(5);
        num.addNum(6);
        num.addNum(7);
        num.addNum(8);
        num.addNum(9);
        num.addNum(10);

        int hasil = num.low10();
        System.out.println("Num : " + hasil);

        CustomList<Integer> num2 = new CustomList<Integer>();
        num2.addNum(1);
        num2.addNum(2);
        num2.addNum(3);
        num2.addNum(4);
        num2.addNum(5);
        num2.addNum(6);
        num2.addNum(7);
        num2.addNum(8);
        num2.addNum(9);
        num2.addNum(10);
        num2.addNum(11);
        num2.addNum(12);
        num2.addNum(13);
        num2.addNum(14);
        num2.addNum(15);
        num2.addNum(16);
        num2.addNum(17);
        num2.addNum(18);
        num2.addNum(19);
        num2.addNum(20);

        int hasil2 = num2.low10();
        System.out.println("Num 2 : " + hasil2);

        CustomList<Integer> num3 = new CustomList<Integer>();
        num3.addNum(3);
        num3.addNum(3);
        num3.addNum(3);
        num3.addNum(4);
        num3.addNum(4);
        num3.addNum(4);
        num3.addNum(5);
        num3.addNum(5);
        num3.addNum(6);
        num3.addNum(7);

        int hasil3 = num3.low10();
        System.out.println("Num 3 : " + hasil3);
    }
}