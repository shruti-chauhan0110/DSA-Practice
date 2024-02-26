import java.util.*;
public class FindElement2DArray {
    public static boolean search(int matrix[][],int key){
        for(int i=0;i < matrix.length;i++){
            for(int j=0;j< matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("element is found at=" + i+","+j);
                }
            }
        }
        return false;
        

    }
    public static void main(String[] args) {
       
        int matrix[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i < matrix.length;i++){
            for(int j=0;j< matrix[0].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i < matrix.length;i++){
            for(int j=0;j< matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print("enter the element to find it in the matrix=");

        int a=sc.nextInt();
        search(matrix, a);

    }
    
}
