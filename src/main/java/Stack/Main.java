package Stack;

public class Main {

    public static void main(String[] args) {

        Stack nums = new Stack();
        nums.push(5);
        nums.push(10);
        nums.push(15);

        System.out.println(nums.pop());
        nums.show();
    }
}
