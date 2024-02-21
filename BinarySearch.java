public class BinarySearch {
public static int BinarySearchfunction(int number[],int key){
        int start=0;
        int end=number.length-1;
        
        while(start<=end){
            int mid=(start+end)/2;
            if(number[mid]==key){
                return mid;
            }else if(number[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
            
        }
return -1;

}
 public static void main(String[] args) {
        int number[]={4,6,33,67,81,99,400,501,694,800};
        int key=400;
        System.out.println("the index  of the given number  ="+ BinarySearchfunction(number,key));

    }
    
}
