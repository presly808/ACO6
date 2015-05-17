package ua.artcode.week4;

/**
 * Created by serhii on 17.05.15.
 */
public class TestArrParameter {
    // Object...args -> Object[]
    // sequence -> arrays
    public static void main(String[] args) {
        testSeq(1,2,3,4);
        testSeq(1);
        testSeq(754,3,23,23,23,23);
    }


    public static void testSeq(int...nums){
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }


}
