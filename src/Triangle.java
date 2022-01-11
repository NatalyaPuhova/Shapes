import java.util.ArrayList;
import java.util.List;
/*
Создайте супер класс Shape и его наследники Circle, Rectangle. Класс Shape содержит абстрактный метод draw() и переменную хранящую цвет.
 Классы Circle, Rectangle содержат координаты точек. Создать массив содержащий эти фигуры. В цикле нарисовать их (вызвать метод draw).
  Добавить метод equals() для классов Shape, Circle, Rectangle.
 */
public class Triangle extends Shape{
    private Point p1;
    private Point p2;
    private Point p3;

    public Triangle(Point p1,Point p2,Point p3,String color){
        super(color);
        this.p1=p1;
        this.p2=p2;
        this.p3=p3;
    }

    public  void draw(){
        System.out.println("нарисуем треугольник");
    }

    public double calculateD1d2d3(Point p1, Point p2){
        return (Math.pow((p1.getX()- p2.getX()),2)+Math.pow((p1.getY()- p2.getY()), 2));
    }

    public boolean checkTriangle(){
        double d1=Math.pow(p1.getX()- p2.getX(),2)+Math.pow(p1.getX()- p2.getY(), 2);
        double d2=Math.pow(p3.getX()- p2.getX(),2)+Math.pow(p3.getX()- p2.getY(), 2);
        double d3=Math.pow(p1.getX()- p3.getX(),2)+Math.pow(p1.getX()- p3.getY(), 2);
        System.out.println("Проверкка: d1="+Math.sqrt(d1)+"  d2="+Math.sqrt(d2)+"   d3="+Math.sqrt(d3));
        if (Math.sqrt(d1)+Math.sqrt(d2)>Math.sqrt(d3)&&Math.sqrt(d1)+Math.sqrt(d3)>Math.sqrt(d2)&&Math.sqrt(d3)+Math.sqrt(d2)>Math.sqrt(d1)){
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return "координаты треугольника"+"("+p1.getX()+";"+p1.getY()+")"+" ; "+"("+p2.getX()+";"+p2.getY()+")"+"("+p3.getX()+";"+p3.getY()+")"+"цвет="+color;
    }
    @Override
    public boolean equals(Object o){
        if (this==o){
            return  true;
        }
        if (!(o instanceof Triangle)){
            return false;
        }
        Triangle myTriangle=(Triangle)o;

        List<Double> list2=new ArrayList<>();
        System.out.println("calculateD1d2d3(this.p1,this.p2)="+calculateD1d2d3(this.p1,this.p2));
        System.out.println("calculateD1d2d3(this.p1,this.p3)="+calculateD1d2d3(this.p1,this.p3));
        System.out.println("calculateD1d2d3(this.p3,this.p2)="+calculateD1d2d3(this.p3,this.p2));
        list2.add(Double.valueOf(calculateD1d2d3(this.p1,this.p2)));
        list2.add(Double.valueOf(calculateD1d2d3(this.p1,this.p3)));
        list2.add(Double.valueOf(calculateD1d2d3(this.p3,this.p2)));

        List<Double> list1=new ArrayList<>();
        System.out.println("calculateD1d2d3(myTriangle.p1,myTriangle.p2))="+calculateD1d2d3(myTriangle.p1,myTriangle.p2));
        System.out.println("calculateD1d2d3(myTriangle.p1,myTriangle.p3))="+calculateD1d2d3(myTriangle.p1,myTriangle.p3));
        System.out.println("calculateD1d2d3(myTriangle.p3,myTriangle.p2))="+calculateD1d2d3(myTriangle.p3,myTriangle.p2));
        list1.add(Double.valueOf(calculateD1d2d3(myTriangle.p1,myTriangle.p2)));
        list1.add(Double.valueOf(calculateD1d2d3(myTriangle.p1,myTriangle.p3)));
        list1.add(Double.valueOf(calculateD1d2d3(myTriangle.p3,myTriangle.p2)));


        int num=0;
        int i;
        for (i=0;i<list1.size();i++){
            for (int j=0;j<list2.size();j++){
                System.out.println("i="+i+"  j="+j);
                if (list1.get(i).equals(list2.get(j))){
                    System.out.println("list1.get(i)="+list1.get(i));
                    System.out.println("list2.get(j)="+list2.get(j));
                    num++;
                    System.out.println("num="+num);
                    if (num==3){
                        return true;
                    }
                    i++;
                    j=-1;

                }
            }
        }
        System.out.println("num="+num);


        return false;
    }
}
