package Coding;

public class Day1_ContainerWithMostWater {
public int maxArea(int[] height) {
		int maxArea=0;
		int left=0;
		int right=height.length-1;
		while(left<right) {
			int breadth=right-left;
			int length=Math.min(height[left], height[right]);
			 int area=length*breadth;
			if(area>maxArea) maxArea=area;
			
			if(height[left]<height[right]) {
        		left++;
			}
			else right--;
		}
		return maxArea;
    }
	
	public static void main(String[] args) {
		int[] height= {1,8,6,2,5,4,8,3,7};
		Day1_ContainerWithMostWater d=new Day1_ContainerWithMostWater();
		 int result=d.maxArea(height);
		 System.out.println(result);
	}

}
