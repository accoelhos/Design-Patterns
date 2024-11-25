public class Rectangle extends Shape{
    int width;
    int height;
    public Rectangle(){}
    public Rectangle(Rectangle source){
        super(source);
        this.width = source.width;
        this.height = source.height;
    }
    @Override
    public Shape clone() {
        return new Rectangle(this);
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Width: " + width + ", Height: " + height);
    }

}
