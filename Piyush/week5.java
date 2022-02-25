package Piyush;

public class week5 {
    int rank=1;
    int arr[][]={{3,2,4},{8,5,6}};
    int [][] arr2=new int[arr.length][arr[0].length];
    week5(){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<=arr[i].length-1;j++){
                if(j==arr[i].length-1){
                    System.out.println(j);
                   if(arr[i][j]<arr[i][j-1]){
                       arr2[i][j]=rank-1;

                   }
                   if(arr[i][j]>arr[i][j-1]){
                    arr2[i][j]=rank+1;

                    }
                    if(arr[i][j]==arr[i][j-1]){
                        arr2[i][j]=rank;
    
                        }
                }
                else {
                    if(arr[i][j]<arr[i][j+1]){
                        arr2[i][j]=rank;
                        arr2[i][j+1]=rank+1;
                        
                    }
                    if(arr[i][j]>arr[i][j+1]){
                        arr2[i][j]=rank+1;
                        arr2[i][j+1]=rank;
                        
                    }
                    if(arr[i][j]==arr[i][j+1]){
                        arr2[i][j]=rank;
                        arr2[i][j+1]=rank;
                        
                    }
                }
                
                
                
            }
            rank=rank+1;
        }
        
        for(int k=0;k<arr2.length;k++){
            for(int l=0;l<arr2[k].length;l++){
                System.out.print(arr2[k][l]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        week5 w5=new week5();
    }
    
}
