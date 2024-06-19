package abstractClass;

public class App {
    public static void main(String[] args) {
        JavaTrainee rhys = new JavaTrainee("Rhys",23,"RSadler@spartaglobal.com", "07749128188","Cool guy experience", "Business and management", "Tech261", "Rhys Sadler");
        rhys.train();
        rhys.study();
        System.out.println(rhys.getCertifications());
    }

}
