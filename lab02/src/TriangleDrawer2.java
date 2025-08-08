public class TriangleDrawer2 {
    public static void drawTriangle() {
        int SIZE = 5;
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        drawTriangle();
    }

}
