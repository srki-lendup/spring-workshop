package Part01.springContext.step00.dependencyInjection;


public class Main {

    public static void main( String[] args ) {
        Shape shape = new Triangle();
        Drawing drawing = new Drawing( shape );
        drawing.drawShape();
    }

}
