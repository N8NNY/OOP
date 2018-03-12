import java.util.Scanner;
import java.util.Random;
public class Matrix{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        // Input Length 
        System.out.print("Enter the size for the matrix: ");
        int length = input.nextInt();
        // Print Matrix
        int[][] matrix_ = new int[length][length];
        for(int i = 0;i < length;i++){
            for(int j =0;j < length;j++){
                matrix_[i][j] = rand.nextInt(2);
                System.out.print(matrix_[i][j]);
            }
            System.out.println();
        }
       //
        int cRow =0;
        int cColumn =0;
        int count = 0;
        int sub = 0;
        int superr = 0;
        int diagonal = 0;
        while(count <= 1){
        for(int i = 0;i< length;i++){
            if(row(matrix_, i, count)){
                System.out.println("All " + count +"s on row" + i);
                cRow++;
            } 
        
        }
        for(int i = 0;i< length;i++){
            if(column(matrix_, i, count)){
                System.out.println("All " + count +"s on column" + i);
                cColumn++;
            } 
        }
        if(majorDiagonal(matrix_, count)){
            System.out.println("All " + count +"s on Diagonal");
            diagonal++;
        }
        if(superDiagonal(matrix_, count)){
            System.out.println("All " + count +"s on superdiagonal");
            superr++;
        }
        if(subDiagonal(matrix_, count)){
            System.out.println("All " + count +"s on subdiagonal");
            sub++;
        }
        count++;
    }
        if(cColumn == 0) System.out.println("No same numbers on a column");
        if(cRow == 0) System.out.println("No same numbers on a Row");
        if(diagonal == 0) System.out.println("No same numbers on the diagonal");
        if(sub == 0) System.out.println("No same numbers on the subdiagonal");
        if(superr == 0) System.out.println("No same numbers on the superdiagonal");
    
    }

    public static boolean row(int[][] matrix, int row, int num){
        for(int i = 0;i < matrix[row].length;i++){
            if(matrix[row][i] != num) return false;
        }
        return true;
    }
    
    public static boolean column(int[][] m, int column, int num){
        for(int i =0;i < m.length;i++){
            if(m[i][column] != num) return false;
        }
        return true;
    }

    public static boolean majorDiagonal(int[][] m, int n) {
        boolean topLeftDown = true; // top left to bottom right

        for (int i = 0; i < m.length; i++) {
            if (m[i][i] != n) topLeftDown = false;
        }

        return topLeftDown;
    }

    public static boolean subDiagonal(int[][] m, int n) {
        for (int i = 1; i < m.length; i++) {
            if (n != m[i][i-1]) return false;
        }

        return true;
    }

    public static boolean superDiagonal(int[][] m, int n) {

        for (int i = 0; i < m.length - 1; i++) {
            if (n != m[i][i+1]) return false;
        }

        return true;
    }

}