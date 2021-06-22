package exam;

public class ShiftElementsInArray {

  public void shift(int[] arr) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
     for(int i = 0; i < n; i++){  
            int j, first;  
  
            first = arr[0];  
          
            for(j = 0; j < arr.length-1; j++){  
                 arr[j] = arr[j+1];  
            }  
            arr[j] = first;  
        }  

  }

}
