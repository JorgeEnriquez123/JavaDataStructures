package reviewstructures;

import java.util.Arrays;

public class ArraysT {
    public static void main(String[] args) {
//        String[] bears = new String[5];
//        bears[0] = "Grizz";
//        bears[1] = "Polar";
//        bears[2] = "Panda";
        String[] bears = {"Grizz", "Polar", "Panda"};
        Arrays.stream(bears).forEach(System.out::println);

        char[][] grid1 = new char[][]{
            new char[]{'-', '-', '-'},  // 2 elements [2 arrays]
            new char[]{'-', '-', '-'}   // with 3 elements inside [3 chars]
        };                              // The same as: char[2][3]

        Arrays.stream(grid1).forEach(System.out::println);;
        // * -- Another way to set them
        char[][] grid2 = new char[2][3];
        for(int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                grid2[i][j] = '-';
            }
        }
        System.out.println(Arrays.deepToString(grid2));

    }
}


