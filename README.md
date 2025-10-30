Explanations: 
The question (from leetcode[no: 11]):
https://leetcode.com/problems/container-with-most-water/description/
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
Find two lines that together with the x-axis form a container, such that the container contains the most water.
Return the maximum amount of water a container can store.

Example 1:
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

The solution:
1.	Make 2 integer to contain (the current value of the water contained [in curA]) and (the current max value of the water contained [in maxA]).
2.	Make an outer loop that goes from the index i= 0 to (last element or length-1).
3.	Then an inner loop that goes from j= i-1 to last.
4.	Then, use conditions :
a.	  If the array’s [i] is equal or lesser then [j] then, we put the calculated(arr[j] * (j-i)) value of the water contained in the curA variable.
b.	But If the array’s [i] is greater then [j] then, we put the calculated(arr[i] * (j-i)) value of the water contained in the curA variable.
c.	Then, if the curA is greater then maxA then, we change its value to curA.
5.	Lastly, we return the value of maxA at the end of the code.
