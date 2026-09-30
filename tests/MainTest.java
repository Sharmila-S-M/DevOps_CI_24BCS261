public class MainTest {
    public static void main(String[] args) {
        String information = Main.getCenterInformation();
        if (!information.contains("Vehicle Service Center Management System")
                || !information.contains("maintenance")) {
            throw new AssertionError("Center information is incomplete");
        }
        System.out.println("MainTest passed");
    }
}