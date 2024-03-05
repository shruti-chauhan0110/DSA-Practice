public class diagonalSum {

public static void diagonal(int matrix[][]){
    int a=0;
    int b =0;

    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            if(i==j){
                a=a+matrix[i][j];
            }                   
         }       
    }

    for(int i=0;i<matrix.length;i++){
        for(int j=matrix[i].length-1;j>=0;j--){
            if(i+j==matrix.length-1){
                b=b+matrix[i][j];
            }                   
         }       
    }

System.out.println(a);
System.out.println(b);


}






    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4,},
                         {5,6,7,8},
                         {9,10,11,12},
                         {13,14,15,16}};
                         diagonal(matrix);

            
    }
    
    
}
