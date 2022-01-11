public class Rectangle extends Shape {
    private Point p1;
    private Point p2=new Point();
    private Point p3=new Point();
    private Point p4=new Point();




    public Rectangle(Point p1,int lenght,int height,String color){
        super(color);
        this.p1=p1;
        p2.setX(p1.getX());
        p2.setY(p1.getX()+height);

        p3.setY(p2.getY());
        p3.setX(p1.getX()+lenght);

        p4.setX(p1.getX()+lenght);
        p4.setY(p1.getY());

    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public  void draw(){
        System.out.println("нарисуем Rectangle");
    }
    @Override
    public String toString(){
        return "координаты четырехугольника"+"("+p1.getX()+";"+p1.getY()+")"+" ; "+"("+p2.getX()+";"+p2.getY()+")"+"("+p3.getX()+";"+p3.getY()+")"+"("+p4.getX()+";"+p4.getY()+")"+"цвет="+color;
    }
}
