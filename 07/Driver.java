import java.io.*;
import java.util.*;

public class Driver {
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    ArrayList<String> singlePrograms = new ArrayList<>();
    ArrayList<String> linkedPrograms = new ArrayList<>();
    while (in.hasNextLine()) {
      String line = in.nextLine();
      if (line.contains("->")) {
        linkedPrograms.add(line);
      } else {
        singlePrograms.add(line);
      }
    }
    Circus c = new Circus(singlePrograms, linkedPrograms);
    System.out.println(c.findImbalance());
  }
}
