public class Printing_Shapes {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int heigth = 6;

        for (int i = 0; i < heigth; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.println("=======================================");

        int h = 4;
        int w = 7;
        int startPoint = w / 2;
        int endPoint = w / 2;

        for (int i = 0; i < h; i++) {
            for (int j = 0; j <= w; j++) {
                if (j >= startPoint && j <= endPoint) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            startPoint--;
            endPoint++;
            System.out.print("\n");
        }


        System.out.println("=======================================");

        int rhombus = 9;
        int startPos = rhombus / 2;
        int endPos = rhombus / 2;

        for (int i = 0; i < rhombus; i++) {
            for (int j = 0; j < rhombus; j++) {
                if (j >= startPos && j <= endPos) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            if (i >= rhombus / 2) {
                startPos++;
                endPos--;
            } else {
                startPos--;
                endPos++;
            }
            System.out.print("\n");
        }
    }
}


