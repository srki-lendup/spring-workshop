package Part01.springContext.step00.dependencyInjection;


public class Circle implements  Shape{

    @Override
    public void draw() {
        System.out.println("Drawing circle");
    }
}
