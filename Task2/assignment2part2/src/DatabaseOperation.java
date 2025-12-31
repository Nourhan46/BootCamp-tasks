public class DatabaseOperation {
    private String url;
    private String username;
    private String password;

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    void storeVehicleIntoDatabase(String name)
    {
        System.out.println("Connecting to: " + url);
        System.out.println("Storing Vehicle into database  " + name);
    }
}
