//  The Idea is to break the array into two parts 
// and then pick the smallest of two and build a temp array
// One of the two arrays might finish early so we need to copy
// all the left over elements using System.arraycopy()


public static void mergeSort(int[] arr){
  mergeSort(arr, new int[arr.length], 0, arr.length-1);
}

public static void mergeSort(int [] arr,int temp[], int leftStart, int rightEnd){
  if(leftStart>=rightEnd)
    return;
  int middle=(leftStart+rightEnd)/2;
  mergeSort(arr, temp, leftStart, middle);
  mergeSort(arr, temp, middle+1, rightEnd);
  mergeHalves(arr, temp, leftStart, rightEnd);    
}

public static void mergeHalves(int[] arr, int[] temp, int leftStart, int rightEnd){
  int leftEnd=(leftStart+rightEnd)/2;
  int rightStart=leftEnd+1;
  int left=leftStart;
  int right=rightStart;
  int index=leftStart;
  int size=rightEnd-leftStart+1;
  while(left<=leftEnd && right<=rightEnd){
    if(arr[left]<arr[right]){
      temp[index]=arr[left];
      left++;
    }else{
      temp[index]=arr[right];
      right++;
    }
    index++;      
  }
  System.arraycopy(arr, left, temp, index, leftEnd-left+1);
  System.arraycopy(arr, right, temp, index, rightEnd-right+1);
  System.arraycopy(temp, leftStart, arr, leftStart, size);    
}
