import java.io.*;
import java.util.*;
class Sort
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int[] nums={6,-1,-2,-3,0,1,2,3,4};
		Arrays.sort(nums);
		System.out.println("Minimum = " + nums[0]);
		System.out.println("Maximum = " + nums[nums.length-1]);
	}
}