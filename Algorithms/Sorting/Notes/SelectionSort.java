public class Solution{
  
  public static void selectionSort(int[] nums){
    for(int i=0;i<nums.length-1;++i){
    	int least=i;
      for(int j=i+1;j<nums.length;++j){
        if(nums[j]<nums[least])
          least=j;
      }
      if(least!=i){
      	int temp=nums[i];
        nums[i]=nums[least];
        nums[least]=temp;
      }
    }
  }

  public static void main(String...args){
  	int []nums=new int[args.length];
    for(int i=0;i<args.length;++i){
     	nums[i]=Integer.valueOf(args[i]); 
    }
    selectionSort(nums);
    printArray(nums);
  }
  
  public static void printArray(int[] nums){
    for(int i : nums)
      System.out.print(i+" ");
    System.out.println();
  }
  
}
