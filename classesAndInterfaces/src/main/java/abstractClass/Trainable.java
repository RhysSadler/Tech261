package abstractClass;

public interface Trainable{
    public default boolean train() {
        System.out.println("We like to train");
        return false;
    }
    public default void study() {
        System.out.println("We like to study");
    }
}
