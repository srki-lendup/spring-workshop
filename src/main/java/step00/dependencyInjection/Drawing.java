package step00.dependencyInjection;


public class Drawing {

    private final Shape shape;

    public Drawing( final Shape shape ) {
        this.shape = shape;
    }

    public void drawShape() {
        shape.draw();
    }
}
