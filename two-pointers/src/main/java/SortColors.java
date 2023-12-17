/*
Given an array, colors, which contains a combination of the following three elements:

0(representing red)

1(representing white)

2(representing blue)

Sort the array in place so that the elements of the same color are adjacent, with the colors in 
the order of red, white, and blue. The function should return the same array.
*/

public class SortColors {
	public static int[] sortColors (int[] colors) {
		int left = -1;
		int right = colors.length;
		int mid = 0;
		
		while(mid < right){
			if(colors[mid] == 0 && mid!=left){
				left++;
				swap(colors, left, mid);
			}else if(colors[mid] == 2){
				right--;
				swap(colors, right, mid);
			}else{
				mid++;
			}
		}

        return colors;
    }
	public static void swap(int[] colors, int eleOne, int eleTwo){
		int temp = colors[eleOne];
		colors[eleOne] = colors[eleTwo];
		colors[eleTwo] = temp;
	}
}
