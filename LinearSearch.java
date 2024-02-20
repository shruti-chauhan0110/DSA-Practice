public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {3,4,1,5,8};

        int target = 1;
        int found = -1;

        for(int i =0; i<arr.length; i++){
            if(arr[i]==target){
                found = i;
                System.out.println("The target element is found at index: " +i);
            }
        }

        if(found==-1){
            System.out.println("The target element is not found in the array!!");
        }
    }
}
