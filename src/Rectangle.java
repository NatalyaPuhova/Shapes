public class Rectangle extends Shape {
    private Point p1;
    private Point p2=new Point();
    private Point p3=new Point();
    private Point p4=new Point();

    private int lenght;
    private int height;

    public Rectangle(Point p1,int lenght,int height,String color){
        super(color);
        this.p1=p1;
        p2.setX(p1.getX());
        p2.setY(p1.getY()+height);
        System.out.println("p2.getY()="+p2.getY());
        p3.setY(p2.getY());
        p3.setX(p1.getX()+lenght);
        p4.setX(p1.getX()+lenght);
        p4.setY(p1.getY());

    }
    Point [] points=new Point[4];
    public Point[] returnRectanglePoints(){
        points [0]= p1;
        points [1]= p2;
        points [2]= p3;
        points [3]= p4;
        return points;
    }

    public double returnLenght(){
        return lenght;
    }
    public double returnHeight(){
        return height;
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

    public double calculateSquare(){
        double minX=p1.getX();
        double minY=p1.getY();
        if (p2.getX()<minX){
            minX=p2.getX();
            minY=p2.getY();
        }
        else if (p3.getX()<minX){
            minX=p3.getX();
            minY=p3.getY();
        }
        System.out.println("minX, minY="+minX+"___"+minY);

        double maxX=p1.getX();
        double maxY=p1.getY();
        if (p2.getX()>maxX){
            maxX=p2.getX();
            maxY=p2.getY();
        }
        else if (p3.getX()>maxX){
            maxX=p3.getX();
            maxY=p3.getY();
        }
        System.out.println("maxX, maxY="+maxX+"___"+maxY);
        return Math.abs(maxX-minX)*Math.abs(maxY-minY);
    }
    @Override
    public String toString(){
        return "координаты четырехугольника"+"("+p1.getX()+";"+p1.getY()+")"+" ; "+"("+p2.getX()+";"+p2.getY()+")"+"("+p3.getX()+";"+p3.getY()+")"+"("+p4.getX()+";"+p4.getY()+")"+"цвет="+color;
    }
    @Override
    public boolean equals(Object o){
        if (this==o){
            return true;
        }
        if (!(o instanceof Rectangle)){
            return false;
        }
        Rectangle rectangle=(Rectangle) o;
        if (this.height==rectangle.height&&this.lenght==rectangle.returnHeight()){
            return true;

        }
        return false;

    }
}
