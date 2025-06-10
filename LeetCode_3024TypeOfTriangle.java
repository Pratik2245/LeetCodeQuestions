public class LeetCode_3024TypeOfTriangle {
  public static void main(String[] args) {
    int nums[] = { 3, 3, 3 };
    String ans = triangleType(nums);
    System.out.println(ans);
  }

  public static String triangleType(int[] nums) {
    int side1 = nums[0], side2 = nums[1], side3 = nums[2];
    if (side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2) {
      return "none";
    }
    if (side1 == side2 && side2 == side3) {
      return "equilateral";
    } else if (side1 == side2 || side2 == side3 || side1 == side3) {
      return "isosceles";
    } else {
      return "scalene";
    }
  }
}
