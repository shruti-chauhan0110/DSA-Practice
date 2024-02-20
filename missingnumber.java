import java.util.Scanner;

public class missingnumber {
    public static void main(String[] args) {
        int mainarr[]={1,2,3,4,5,6,7,8,9};
        int arr[]={1,2,3,4,5,6,9};
        
        for(int i=0;i<mainarr.length;i++){
            boolean found=false;

            for(int j=0;j<arr.length;j++){
               if(mainarr[i]==arr[j]){
                found=true;
                
               }
                 }
                 if(!found){
                    System.out.println("missing number is = "+mainarr[i] );

                 }
            


            }
            

        }
        


    }
    

