package Array3;

public class Array3 {

    public static void main(String[] args) {
        int [][] array = new int [3][3];
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int)(Math.random()*8.99+1);
                for (int ci = 0; ci <= i; ci++) {
                    for (int cj = 0; cj < array[ci].length; cj++) {
                        if (array[ci][cj]==array[i][j]) {
                            if (ci==i && cj==j) {
                            break;
                            }else{
                            array[i][j] = (int)(Math.random()*8.99+1);
                            ci=0;
                            cj=-1;
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println("");//para que saque los números en filas
        }
    }
    
}
