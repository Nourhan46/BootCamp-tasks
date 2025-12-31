public class Car  implements  Vechicle{
    DatabaseOperation databaseOperation;
    @Override
    public void StoreVechicle(String name) {
databaseOperation.storeVehicleIntoDatabase("car");
    }

    public Car(DatabaseOperation databaseOperation) {
        this.databaseOperation = databaseOperation;
    }
}
