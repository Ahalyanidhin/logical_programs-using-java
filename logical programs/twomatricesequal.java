package Assessment;

public class twomatricesequal {
	

    public static void main(String args[])
    {
        
        int mat1[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int mat2[][] =  {{5,1,1},{9,4,7},{2,7,5}};
        int row, col ;
        boolean flag = true;
        
        System.out.print("\nMatrix 1");
        printMatrix(mat1);
        System.out.print("\nMatrix 2");
        printMatrix(mat2);
      
        for(row=0;row<3;row++)
            for(col=0;col<3;col++)
            {   
                
                if(mat1[row][col]!=mat2[row][col])
                {
                  
                    flag = false;
                    break;
                }
            }
        if(flag)
            System.out.println("\n\nBoth the matrices are equal");
        else
            System.out.println("\n\nBoth the matrices are not equal");
    }
    
    static void printMatrix(int arr[][])
    {
        int row, col;
        
        for(row=0;row<3;row++)
        {
           
            System.out.print("\n");
            for(col=0;col<3;col++)
            {
                System.out.print(arr[row][col]+" ");
            }
        }
        System.out.print("\n");
    

}}