import java.util.Arrays;

public class Basic {
    public static int[][] add(int[][] a, int[][] b) {
        int result[][] = new int[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                result[i][j] = a[i][j]+b[i][j];
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(result[i][j] + " ");
            }
        }
        return result;
    }
    public static int[][]subtract(int[][] a, int[][] b) {
        int result[][] = new int[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                result[i][j] = a[i][j]-b[i][j];
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(result[i][j] + " ");
            }
        }
        return result;

    }
    public static int[][] multiply(int[][] a, int[][] b) {
        int n = a[0].length;
        int m = b.length;
        if(n<m || m<n ){
            return null;
        }
        int result[][] = new int[a.length][b[0].length];
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    temp += a[i][k] * b[k][j];
                }
                result[i][j] = temp;
            }

        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(result[i][j] + " ");
            }
        }

        return result;
    }
    public static int[][] transpose(int[][] a) {
        int result[][] = new int[a[0].length][a.length];
        for (int i = 0; i < a[0].length; i++) {
            for (int j = 0; j < a.length; j++) {
                result[i][j] = a[j][i];
            }
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int array[][]={{7,2},{5,3}};
        int b[][]={{2,1},{3,1}};
       // add(array,b);
      //  multiply(array,b);
        int c[][]={{1,2},{3,4},{5,6}};
        transpose(c);
    }
}
