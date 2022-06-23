import java.util.ArrayList;
import java.util.List;

class HelloWorld {
   public static void main(String[] args) {
      String[] somethings = {"something1", "something2", "something3"};
      System.out.println("Hello World!");

      List<byte[]> list = new ArrayList<>();
      while(true) {
         byte[] b = new byte[1048576];
         list.add(b);
      }
   }
}
