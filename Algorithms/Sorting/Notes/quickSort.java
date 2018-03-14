public static void quickSort(int[] nums){
  	 quickSort(nums, 0, nums.length-1);
  }
  public static void quickSort(int[] nums, int left, int right){
  	if(left>=right)
      return;
    int pivot=nums[(left+right)/2];
    int index=partition(nums, left, right, pivot);
    quickSort(nums, left, index-1);
    quickSort(nums, index, right);
  }
  
  public static int partition(int[] nums, int left, int right, int pivot){
    while(left<=right){
      while(nums[left]<pivot)
       ++left;
      while(nums[right]>pivot)
       --right;
      if(left<=right){
       	int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
        ++left;
        --right;
      }
    }
    return left;
  }
