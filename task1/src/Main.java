import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    Circle c  = context.getBean(Circle.class);
    Scanner s = new Scanner(System.in);
    double x = s.nextDouble();
   System.out.println(c.getArea(x));
   Square square = context.getBean(Square.class);
   System.out.println(square.getArea(x));

}
