import org.springframework.context.support.ClassPathXmlApplicationContext;


void main() {
    ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext("applicationContext.xml");


    Vechicle myCar = context.getBean(Car.class);
    myCar.StoreVechicle("car");
Vechicle myPlane =(Plane) context.getBean("myPlane");
myPlane.StoreVechicle("myplane");

}
