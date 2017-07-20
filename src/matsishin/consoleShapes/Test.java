package matsishin.consoleShapes;


public class Test {
    public static void main(String[] args) {
        System.out.println("first figure");
        angle(0,  5,true,false,true);
        horizontalLine(0,6);
        angleBottomUp(0,5,true,false,true);
        System.out.println("second figure");
        horizontalLine(0,7);
        angleBottomUp(6,6,true,true,false);
        System.out.println("third figure");
        angle(7,  7,true,true,false);
        horizontalLine(0,8);
        System.out.println("forth figure");
        angle(5,  5,true,true,false);
        horizontalLine(0,6);
        angleBottomUp(5,5,true,true,false);
        System.out.println("fifth figure");
        angle(5,  5,true,true,true);
        horizontalLine(0,11);
        angle(5,5,true,true,true);
        horizontalLine(0,11);
    }

    private static void horizontalLine(int startFrom, int length) {
        for (int i = startFrom; i < length+startFrom; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    private static void angle(int startPosition, int height, boolean isLine, boolean isLeftPart, boolean isRightPart) {
        for (int j = 0; j < startPosition; j++) {
            System.out.print(" ");
        }
        System.out.println("*");

        for (int k = 0; k < height-1; k ++) {
            for (int i = 0; i < startPosition; i++) {
                if (isLeftPart && i==startPosition-k-1)System.out.print("*");else System.out.print(" ");
            }
            if (isLine) System.out.print("*");else System.out.print(" ");
            for (int j = 0; j < k; j++) {
                System.out.print(" ");
            }
            if (isRightPart)System.out.println("*");else System.out.println();
        }

    }

    private static void angleBottomUp(int startPosition, int height, boolean isLine, boolean isLeftPart, boolean isRightPart) {

        for (int k = height-2; k >= 0; k --) {
            for (int i = 0; i < startPosition; i++) {
                if (isLeftPart && i==startPosition-k-1)System.out.print("*");else System.out.print(" ");
            }
            if (isLine) System.out.print("*");else System.out.print(" ");
            for (int j = 0; j < k; j++) {
                System.out.print(" ");
            }
            if (isRightPart)System.out.println("*");else System.out.println();
        }
        for (int j = 0; j < startPosition; j++) {
            System.out.print(" ");
        }
        System.out.println("*");

    }
}

