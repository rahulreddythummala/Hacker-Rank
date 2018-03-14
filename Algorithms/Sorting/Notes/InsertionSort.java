public class Solution{
  
  public static void insertionSort(int[] nums){
    for(int i=1;i<nums.length;++i){
      int element=nums[i];
      int j=i;
      while(j>0 && nums[j-1] > element){
      	nums[j]=nums[j-1];
        --j;
      }
      nums[j]=element;
    }
  }

  public static void main(String...args){
  	int []nums=new int[args.length];
    for(int i=0;i<args.length;++i){
     	nums[i]=Integer.valueOf(args[i]); 
    }
    insertionSort(nums);
    printArray(nums);
  }
  
  public static void printArray(int[] nums){
    for(int i : nums)
      System.out.print(i+" ");
    System.out.println();
  }
  
}
