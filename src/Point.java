public class Point {
    private int x;
    private int y;

    public Point(){
        x=(int) (Math.random()*15);
        y=(int) (Math.random()*20);
    }
    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    @Override
    public boolean equals(Object o){
        if (this==o){
            return true;
        }
        if (!(o instanceof Point)){
            return false;
        }
        Point point=(Point)o;
        if ((point.getX()==this.x)&&(point.getY()==this.y)){
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return "x="+x+"  y="+y;
    }
}
