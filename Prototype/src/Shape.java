public abstract class Shape {
    int x;
    int y;
    String color;
    public Shape(){
    }
    public Shape(Shape source){
        this.x = source.x;
        this.y= source.y;
        this.color=source.color;
    }
    public abstract Shape clone();
    public void display(){
        System.out.println("x: "+x);
        System.out.println("\ny: "+y);
        System.out.println("\ncolor: "+color);
    }
}
