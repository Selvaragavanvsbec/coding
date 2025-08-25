

/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class Solution {
    int floorSqrt(int n) {
        // Your code here
        int sqr=1;
for(int i=1;i*i<=n;i++){
   sqr=i;
}
return sqr;
    }
}