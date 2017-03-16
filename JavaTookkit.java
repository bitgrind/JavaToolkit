import java.io.Console;
import java.io.IOException;
import java.lang.reflect.Method;

public class App {

  public static void main(String[] args) {
    Class hClass = newHangman.getClass();
    Method[] classMethods = hClass.getMethods();

    for (int i = 0; i < classMethods.length; i++) {
      System.out.println("public method: " + classMethods[i]);
    }
  }
}
