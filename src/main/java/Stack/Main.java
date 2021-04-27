package Stack;

public class Main {

    public static void main(String[] args) {

        Stack nums = new Stack();
        nums.push(5);
        nums.push(10);

        System.out.println(nums.peak());

        nums.push(15);

        System.out.println(nums.size()); //size before pop

        System.out.println(nums.pop()); // value popped

        System.out.println(nums.size()); // size after pop
        nums.show();
    }
}
