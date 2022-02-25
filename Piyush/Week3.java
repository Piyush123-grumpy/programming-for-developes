package Piyush;

import java.util.HashMap;

public class Week3 {
    int smallest_int;
    int count;
    int count2=0;
      
    public void convert_n_push(String number){
        int []arr={1,2,3,4,5,6,7,8,9};
        int [] arr2=new int[number.length()];
        HashMap<Integer, Boolean> mp = new HashMap<>();
        for(int i=0;i<number.length();i++){
            char a=number.charAt(i);
            int b=Character.getNumericValue(a);  
            arr2[i]=b;
        }
        for(int i=0;i<arr2.length;i++){
            if (mp.get(arr2[i]) == null)
            {
                
                mp.put(arr2[i], true);
            }
        }
        for(int i=0;i<arr.length;i++){
            if (mp.get(arr[i]) == null)
            {
                count=count+1;
            }
        }
        int [] arr3=new int[count];
        for(int i=0;i<arr.length;i++){
            if (mp.get(arr[i]) == null)
            {   
                arr3[count2]=arr[i];
                count2=count2+1;
            }
        }
        int min =arr3[0];
        for(int i=0;i<arr3.length;i++){
            if(arr3[i]<min){
            min = arr3[i];  
            }  
        
        }
        System.out.println(min);
    }
    public static void main(String[] args) {
        Week3 c=new Week3();
        c.convert_n_push("16452");
    }
}

