import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    ApplicationContext Context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    Shape shape = (Circle) Context.getBean("circle",Circle.class);
   // shape.draw2d();
    shape.draw3d();
Shape shape1 = (Square) Context.getBean("square" , Square.class);
shape1.draw2d();
}
