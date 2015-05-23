package ua.artcode.serhii.backtrackin_rec;

/**
 * Created by serhii on 17.05.15.
 */
public class RecursionLevel2Container {

    /*
        Given an array of ints, is it possible to choose a group of some of the ints,
        such that the group sums to the given target?
        This is a classic backtracking recursion problem.
        Once you understand the recursive backtracking strategy in this problem,
        you can use the same pattern for many problems to search a space of choices.
        Rather than looking at the whole array, our convention is to consider the part of
        the array starting at index start and continuing to the end of the array.
        The caller can specify the whole array simply by passing start as 0.
        No loops are needed -- the recursive calls progress down the array.
        groupSum(0, {2, 4, 8}, 10) → true
        groupSum(0, {2, 4, 8}, 14) → true
        groupSum(0, {2, 4, 8}, 9) → false

    */
    public static boolean groupSum(int start, int[] nums, int target) {

        // when at the bottom, check condition
        if (start >= nums.length) {
            return target == 0;
        }

        // check if return res from one branch is successful
        if (groupSum(start + 1, nums, target - nums[start])) {
            return true;
        }

        // check if return res from another branch is successful
        if (groupSum(start + 1, nums, target)) {
            return true;
        }

        // return false otherwise
        return false;


    }

    /*
    * Given an array of ints, is it possible to choose a group of some of the ints,
    * beginning at the start index, such that the group sums to the given target?
    * However, with the additional constraint that all 6's must be chosen. (No loops needed.)
    * groupSum6(0, {5, 6, 2}, 8) → true
    * groupSum6(0, {5, 6, 2}, 9) → false
    * groupSum6(0, {5, 6, 2}, 7) → false
    * */
    public boolean groupSum6(int start, int[] nums, int target) {

        if (start >= nums.length) {
            return target == 0;
        }

        if (nums[start] == 6) {
            return groupSum6(start + 1, nums, target - nums[start]);
        }

        if(groupSum6(start + 1, nums, target)){
            return true;
        }

        return groupSum6(start + 1, nums, target - nums[start]);


    }


}
