@FunctionalInterface
public interface TestInterface {
    default void hello(){}
    public void hello(int x);
}
