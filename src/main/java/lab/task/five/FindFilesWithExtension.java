package lab.task.five;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FindFilesWithExtension {
  private static final String PATH = "src/test/java";

  public static void main(String[] args) {
    String extension = args[0];
    File root = new File(PATH);
    List<String> paths = new ArrayList<>();
    find(root, extension, paths);

    paths.forEach(System.out::println);
  }

  public static void find(File file, String extension, List<String> resultList) {
    if (file.isDirectory()) {
      for (File item : file.listFiles()) {
        if (item.isDirectory()) {
          find(item, extension, resultList);
        } else {
          String currentFile = item.getName();
          if (currentFile.endsWith(extension))
            resultList.add(currentFile);
        }
      }
    } else {
      String currentFile = file.listFiles()[0].getName();
      if (currentFile.endsWith(extension))
        resultList.add(currentFile);
    }
  }
}
