public class Plane  implements  Vechicle{
    DatabaseOperation databaseOperation;
    @Override
    public void StoreVechicle(String name) {
        databaseOperation.storeVehicleIntoDatabase("plane");
    }

    public void setDatabaseOperation(DatabaseOperation databaseOperation) {
        this.databaseOperation = databaseOperation;
    }
}
