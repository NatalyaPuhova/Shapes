/*
Создайте супер класс Shape и его наследники Circle, Rectangle. Класс Shape содержит абстрактный метод draw() и переменную хранящую цвет.
 Классы Circle, Rectangle содержат координаты точек. Создать массив содержащий эти фигуры. В цикле нарисовать их (вызвать метод draw).
  Добавить метод equals() для классов Shape, Circle, Rectangle.
 */
public class Circle extends Shape{
    private Point centre;
    private int radius;

    public Circle(Point centre,int radius,String color){
         super(color);
         this.centre=centre;
         this.radius=radius;
    }


    public  void draw(){
        System.out.println("нарисуем окружность");
    }

    public Point getCentre() {
        return centre;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    @Override
    public String toString(){
        return "окружность   центр"+"("+centre.getX()+";"+centre.getY()+")"+" ; "+" радиус="+radius+"   цвет="+color;
    }
    @Override
    public boolean equals(Object o){
        if (this==o){
            return true;
        }
        if (!(o instanceof Circle)){
            return false;
        }
        Circle myCircle=(Circle)o;
        if (this.centre.equals(myCircle.centre)&&this.radius==myCircle.radius&&this.color.equals(myCircle.color)){
            return true;

        }
        return false;

    }

}
