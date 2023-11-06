package q32;

//public interface ObjectCreator<T> {
//public interface ObjectCreator<T extends Integer> {
public interface ObjectCreator<T extends Number> {
    T create(String str);
}
