/* You are given a list of n-1 integers and these integers are in the range of 1 to n.
There are no duplicates in the list. One of the integers is missing from the list.
Write an efficient code to find the missing integer.
 */
/*
// method 01 
Approach: find The length of the array is n.but one number is missing so so actual no=n+1.
          sum of numbers from 1 to n+1 , totalsum=(n+1)*(n+2)/2. 
           now find sum of array i.e.traversing 0 to n-1  sum=sum+arr[i];
           so missing number=totalsum-sum
           or traversing 0 to n-1 , find sum=sum-arr[i] ; remaing sum =missing number.
           */
// code:
public class missingNumber {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 6, 3, 7, 8};
        int n=arr.length;
        int sum=((n+1)*(n+2))/2;
        for(int i=0;i<n;i++){
            sum=sum-arr[i];
        }
        int missingNo=sum;
        System.out.println(missingNo);
    }
}
//  T:O(n) 
//  T:O(1)  May be overflow occur so to restrict we use
/*
// method 02
Approach:approach is simple we select any number from array and take it as total sum and now make a loop from 2 to n+1 since we have n-1 number
given but in array length  it will be N=n-1. so what will do is we add every i value in sum and substract arr[i].this will give total=missing no.
without overflow of number
example let arr[]={1,2,4}; n=3
total sum=1;
travere i=2 to n+1--> 2 to 4
fori=2; total sum+=2-->1+2=3, now total sum-=arr[i-2]-->3-1=2
fori=3; total sum+=3-->2+3=5, now total sum-=arr[i-2]-->5-2=3
fori=4; total sum+=4-->3+4=7, now total sum-=arr[i-2]-->7-4=3
so 3 we will be missing number
// remember number start from 1
// code:
*/

public class missingNumber {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 6, 3, 7, 8};
        int n=arr.length;
        int sum1=0;
        for(int i=0;i<n;i++){
            sum1+=arr[i];
        }
        int sum=totalsum-sum1;

        int missingNo=sum;
        System.out.println(missingNo);
    }
}
        int sum=1;
        for(int i=2;i<=n+1;i++){
            sum+=i;
            sum-=arr[i-2];
        }
        int missingNo=sum;
        System.out.println(missingNo);
    }
}
//  T:O(n) 
//  T:O(1)



/*
// method 03
Approach: using toatl sum-sum of array
*/
//code:

public class missingNumber {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 6, 3, 7, 8};
        int n=arr.length;
        int totalsum=0;
        for(int i=1;i<=(n+1);i++){
            totalsum+=i;
        }
        int sum1=0;
        for(int i=0;i<n;i++){
            sum1+=arr[i];
        }
        int sum=totalsum-sum1;

        int missingNo=sum;
        System.out.println(missingNo);
    }
}
//  T:O(n) 
//  T:O(1)







