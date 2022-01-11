import java.util.ArrayList;
import java.util.List;

/*
Создайте супер класс Shape и его наследники Circle, Rectangle. Класс Shape содержит абстрактный метод draw() и переменную хранящую цвет.
 Классы Circle, Rectangle содержат координаты точек. Создать массив содержащий эти фигуры. В цикле нарисовать их (вызвать метод draw).
  Добавить метод equals() для классов Shape, Circle, Rectangle.
 */
public class ShapeStorage {
    List<Shape> list=new ArrayList<>();

    public void add(Shape shape){
        list.add(shape);
    }
    public int returnSize(){
        return list.size();
    }

    public String toString(int index){
       return list.get(index).toString();
    }
}
