import java.util.Arrays;

public class Container {

    static int maxCont(int[] height) {
        int maxWater = 0;
        int leftPointer = 0;
        int rightPointer = height.length - 1;

        while (leftPointer < rightPointer) {
            int width = rightPointer - leftPointer;
            int containerHeight = Math.min(height[leftPointer], height[rightPointer]);
            int currentWater = width * containerHeight; 
            maxWater = Math.max(maxWater, currentWater);

            if (height[leftPointer] < height[rightPointer]) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        int[] heightArray = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result = maxCont(heightArray);
        System.out.print ln("Maximum water that can be contained: " + result);
    }
}
