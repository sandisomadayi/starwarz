package co.projectcodex.starwarz;

public class StarPatterns {

    /**
     *
     * line(4) prints * * * *
     *
     * line(7) prints * * * * * * *
     *
     *
     * @param size
     */

    public static void line(int size) {
        String star = "* ";
        for (int i = 0; i < size; i++) {
//            star += star;
            System.out.print(star);
        }
    }
    
    /**
     * Print a square of stars of a specified size
     *
     * squareStars(4) should print
     *
     * * * * *
     * * * * *
     * * * * *
     * * * * *
     *
     * or
     *
     * squareStars(7) should print
     *
     * * * * * * * *
     * * * * * * * *
     * * * * * * * *
     * * * * * * * *
     * * * * * * * *
     * * * * * * * *
     * * * * * * * *
     *
     * @param size
     */
    public static void squareStars(int size) {
        String star = "* ";
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(star);
            }

            System.out.print("\n");
        }
    }


    /**
     *
     * triangleBottomBase(4)
     *
     * prints
     *
     * *
     * * *
     * * * *
     * * * * *
     *
     * triangleBottomBase(7)
     *
     * prints
     *
     *  *
     *  * *
     *  * * *
     *  * * * *
     *  * * * * *
     *  * * * * * *
     *  * * * * * * *
     *
     *
     *
     * @param size
     */
    public static void triangleBottomBase(int size) {
        String star = "* ";
        int value = 1;
        for (int i = 0; i < size; i++) {

            for (int j = 0; j < value; j++) {
                System.out.print(star);
            }
            value++;
            System.out.print("\n");
        }
    }

    /**
     * triangleTopBase(3)
     *
     * prints
     *
     * * * *
     * * *
     * *
     *
     * triangleTopBase(7)
     *
     * prints
     *
     *  * * * * * * *
     *  * * * * * *
     *  * * * * *
     *  * * * *
     *  * * *
     *  * *
     *  *
     *
     *
     * @param size
     */

    public static void triangleTopBase(int size) {
        String star = "* ";
        int value = size;
        for (int i = 0; i < size; i++) {

            for (int j = 0; j < value; j++) {
                System.out.print(star);
            }
            value--;
            System.out.print("\n");
        }
    }

    /**
     * emptySquare(4);
     *
     * prints
     *
     *  * * * *
     *  *     *
     *  *     *
     *  * * * *
     *
     *  emptySquare(7);
     *
     *  * * * * * * *
     *  *           *
     *  *           *
     *  *           *
     *  *           *
     *  *           *
     *  * * * * * * *
     *
     * @param size
     */
    public static void emptySquare(int size) {
        String star = "* ";
        for (int i = 0; i < size; i++) {
            if (i == 0 || i == size - 1) {
                for (int j = 0; j < size; j++) {
                    System.out.print(star);
                }

            }
            else {
                for(int k = 0; k < size; k++) {
                    if (k == 0 || k == size -1) {
                        System.out.print(star);
                    }
                    else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.print("\n");
        }
    }
    public static void diamond(int size) {
        String star = "* ";
        int value = size;
        for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (i == (size/2)) {
                        System.out.print(star);
                    }
                    else {
                        for (int k = 0; k < size; k++) {
                            System.out.print("  ");
                        }
                    }
                }

//            else {
//                for (int k = 0; k < size; k++) {
//                    System.out.print("  ");
//                }
//            }
            value++;
            System.out.print("\n");
        }
    }


    public static void main(String[] args) {

//        squareStars(10);
//        squareStars(5);

//        triangleTopBase(10);
//        triangleBottomBase(7);

        //emptySquare(4);

//        emptySquare(15);


    }




}
