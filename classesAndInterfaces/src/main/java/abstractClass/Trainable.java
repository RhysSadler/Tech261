package abstractClass;

public interface Trainable{
    default void train() {
        System.out.println("We like to train");
    }
    default void study() {
        System.out.println("We like to study");
    }
}
