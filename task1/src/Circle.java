public class Circle  implements Shape{
    @Override
    public double getArea(double dim) {
        return Math.PI * dim * dim;
    }
}
