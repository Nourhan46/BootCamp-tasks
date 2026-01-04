public class Circle  implements  Shape{
    private Draw2D draw2D;
    private Draw3D draw3D;

    public Circle(Draw2D draw2D) {
        this.draw2D = draw2D;

    }

    public Circle(Draw3D draw3D) {
        this.draw3D = draw3D;
    }

    @Override
    public void perimeter() {
        System.out.println("iam circle my perimerter is 4pi*r");
    }

    @Override
    public void draw2d() {
        draw2D.draw("Circle");

    }

    @Override
    public void draw3d() {
        draw3D.draw("Circle");
    }
}
