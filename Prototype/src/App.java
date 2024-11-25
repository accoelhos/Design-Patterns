import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // Criando e inicializando objetos
        ArrayList<Shape> shapes = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 10;
        circle.color = "Red";
        circle.radius = 20;
        shapes.add(circle);

        // Clonando o círculo
        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.x = 5;
        rectangle.y = 5;
        rectangle.color = "Blue";
        rectangle.width = 10;
        rectangle.height = 20;
        shapes.add(rectangle);

        // Clonando o retângulo
        Rectangle anotherRectangle = (Rectangle) rectangle.clone();
        shapes.add(anotherRectangle);

        // Exibindo detalhes e comparando os objetos originais e clonados
        System.out.println("Original Circle:");
        circle.display();
        System.out.println("Cloned Circle:");
        anotherCircle.display();

        System.out.println("\nOriginal Rectangle:");
        rectangle.display();
        System.out.println("Cloned Rectangle:");
        anotherRectangle.display();

        // Verificando se os objetos são instâncias diferentes
        System.out.println("\nComparando referências (se são objetos diferentes):");
        System.out.println("Circle original e clonado são diferentes? " + (circle != anotherCircle));
        System.out.println("Rectangle original e clonado são diferentes? " + (rectangle != anotherRectangle));
    }
}
