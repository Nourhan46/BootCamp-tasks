public class Square  implements Shape{

    private Draw2D draw2D;
    private Draw3D draw3D;

    public void setDraw2D(Draw2D draw2D) {
        this.draw2D = draw2D;

    }

    @Override
    public void perimeter() {
        System.out.println("i am Square my perimerter is 4*l");
    }

    @Override
    public void draw2d() {
        draw2D.draw("Square");
    }

    @Override
    public void draw3d() {
        draw3D.draw("Square");
    }

}
