public class Main {
    public static void main(String[] args) {


        MovableCircle mCircle = new MovableCircle(3, 5, 8, 7, 1);
        MovablePoint mPoint = new MovablePoint(2,3, 6, 3 );

        System.out.println(mPoint);
        mPoint.moveDown();
        System.out.println(mPoint);
        mPoint.moveRight();
        System.out.println(mPoint);

        System.out.println("***************************");

        System.out.println(mCircle);
        mCircle.moveDown();
        System.out.println(mCircle);
        mCircle.moveRight();
        System.out.println(mCircle);

        }

}
