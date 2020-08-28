package Day4;

public class Task4 {
    public static void main(String[] args) {
        int[] nums = new int[100];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 10000);
        }
        int sum = 0;
        int maxSum = 0;
        int index = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            sum = nums[i] + nums[i + 1] + nums[i + 2];
            if (sum > maxSum) {
                maxSum = sum;
                index = i;
            }
        }
        System.out.println(index);
        System.out.println(maxSum);
    }
}
