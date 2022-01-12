import java.io.IOException;

/*
Создайте супер класс Shape и его наследники Circle, Rectangle. Класс Shape содержит абстрактный метод draw() и переменную хранящую цвет.
 Классы Circle, Rectangle содержат координаты точек. Создать массив содержащий эти фигуры. В цикле нарисовать их (вызвать метод draw).
  Добавить метод equals() для классов Shape, Circle, Rectangle.
 */
public class Main {
    public static void main(String[] args)  {
        CreateTriangle produceForms=new CreateTriangle();
        int[][] arrayTriangle;
        do {
            arrayTriangle=produceForms.createTrianglePoints();
            System.out.println(produceForms.checkPoints(arrayTriangle));
        }
        while (produceForms.checkPoints(arrayTriangle)==false);
        Point p5=new Point();
        int radius=(int)(Math.random()*12);
        Circle circle=new Circle(p5,radius,"красная");
        circle.draw();

        Triangle triangle;
        do {
            Point p1=new Point();
            System.out.println(p1);
            Point p2=new Point();
            System.out.println(p2);
            Point p3=new Point();
            System.out.println(p3);
            triangle = new Triangle(p1,p2,p3,"зеленый");
            System.out.println("p1:"+p1);
            System.out.println("p2:"+p2);
            System.out.println("p3:"+p3);
        }

        while (triangle.checkTriangle()==false);
        System.out.println("triangle.checkTriangle()="+triangle.checkTriangle());
        triangle.draw();

        Point p4=new Point();
        System.out.println("p4.getX()="+p4.getX());


        Rectangle rectangle1=new Rectangle(p4,10,5,"желтый");
        rectangle1.draw();
        System.out.println(rectangle1.toString());

        System.out.println(triangle.toString());
        System.out.println(circle.toString());

        ShapeStorage storage=new ShapeStorage();
        storage.add(rectangle1);
        storage.add(triangle);

        System.out.println("\nstoragE^");
        for (int i=0;i<storage.returnSize();i++){
            System.out.println(storage.toString(i));
        }

        Point point1=new Point(2,3);
        Point point2=new Point(0,3);
        point1=null;
        point2=null;
        boolean b;
        try {
            System.out.println(point1.equals(point2));
        }
        catch (NullPointerException exception){
            System.out.println("это нул");
        }

        Point point4=new Point(5,6);
        Point point5=new Point(5,6);
        Circle circle1=new Circle(point4,2,"grуeen");
        Circle circle2=new Circle(point5,2,"green");
        b=circle1.equals(circle2);
        System.out.println("окружности совпадают "+b);

        Point p1=new Point(0,0);
        Point p2=new Point(0,4);
        Point p3=new Point(3,0);

        Point p7=new Point(-1,-1);
        Point p8=new Point(-1,2);
        Point p9=new Point(-5,-1);

        Triangle triangle1=new Triangle(p1,p2,p3,"green");
        Triangle triangle2=new Triangle(p7,p8,p9,"green");

        b=triangle1.equals(triangle2);
        System.out.println("triangle совпадают "+b);



        System.out.println(rectangle1.calculateSquare());

        p4=new Point(1,2);
        Rectangle rectangle2=new Rectangle(p4,4,5,"желтый");

        System.out.println(rectangle1.calculateSquare());
        for (Point p:rectangle2.returnRectanglePoints()){
            System.out.println(p);
        }
        System.out.println("rectangle2.calculateSquare()="+rectangle2.calculateSquare());

        p5=new Point(2,3);
        Rectangle rectangle3=new Rectangle(p5,4,5,"желтый");
        System.out.println("rectangle3.calculateSquare()="+rectangle3.calculateSquare());

        b=rectangle2.equals(rectangle3);
        System.out.println("rectangle совпадают "+b);







    }
}
