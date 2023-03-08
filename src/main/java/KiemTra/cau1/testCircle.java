package KiemTra.cau1;

public class testCircle {
    public static void main(String[] args) {
        // Circle[r = 1] mac dinh
       /* Circle c1 = new Circle();
        System.out.println(c1);
        System.out.println("diện tích hình tròn = "+c1.getArea());
        System.out.println("chu vi Hình tròn = "+c1.getCircumference());

        // Circle[r = 3]
        Circle c2 = new Circle(3);
        System.out.println(c2);
        System.out.println("diện tích hình tròn = "+c2.getArea());
        System.out.println("chu vi Hình tròn = "+c2.getCircumference());*/


        // Circle[r = - 3 ] loi
        Circle c3 = new Circle(-3);
        System.out.println(c3);
        System.out.println("diện tích hình tròn = "+c3.getArea());
        System.out.println("chu vi Hình tròn = "+ c3.getCircumference());


        /*// Circle[r = 0 ] loi
        Circle c4 = new Circle(0);
        System.out.println(c4);
        System.out.println("diện tích hình tròn = "+c4.getArea());
        System.out.println("chu vi Hình tròn = "+ c4.getCircumference());*/
    }
}
