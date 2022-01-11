/*
Создайте супер класс Shape и его наследники Circle, Rectangle. Класс Shape содержит абстрактный метод draw() и переменную хранящую цвет.
 Классы Circle, Rectangle содержат координаты точек. Создать массив содержащий эти фигуры. В цикле нарисовать их (вызвать метод draw).
  Добавить метод equals() для классов Shape, Circle, Rectangle.
 */

public abstract class Shape {
   protected String color;
   public  abstract void draw();

   public Shape(String color){
       this.color=color;
   }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
