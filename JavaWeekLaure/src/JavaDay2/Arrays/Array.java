package JavaDay2.Arrays;

/**
 * Created by student on 5/3/2016.
 */
public class Array {

    public static void main (String[] args) {

        int[] test = {1,2,1,2};

        boolean a = has22(test);
        System.out.println(a);

       // for(int a : newNum);
        //System.out.println(a);
        //System.out.println(maxEnd3 (number));

        //System.out.println(commonEnd(numbers));
    }



    static boolean firstLast6(int[]num)
    {

        return (num [0] == 6 || num[num.length-1]==6);
    }
static boolean sameFirstLast(int[]num)
{
    return ( num.length >=1 && (num[0]== num[num.length -1]));
}

   //exercise 3
    public static boolean commanEnd(int [][]TwoD)

    {
        return (TwoD[0][0] == TwoD[1][0]) || (TwoD[0].length - 1 == TwoD[1].length - 1);

    }
    // Exercise 4
    public int maxEnd3(int []nums) {
        int max;
        if (nums[0] > nums[nums.length - 1])
            max = nums[0];
        else
            max = nums[nums.length - 1];
        for (int a =0; a <nums.length -1; a++)
            nums [a] = max;
        return max;
    }
    //Exercice 5

    public static boolean has22(int[] nums)
    {
        return (nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3);
    }



}

