package lab.task.four;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LabOneTaskFour {
  private static final String FILE_CONTENT = "<!DOCTYPE html>\n" +
          "<html lang=\"ru\">\n" +
          "<head>\n" +
          "    <title>Js test</title>\n" +
          "    <meta http-equiv=\"Content-type\" content=\"text/html;charset=UTF-8\"/>\n" +
          "</head>\n" +
          "<body style=\"background: bisque\">\n" +
          "<script>\n" +
          "function tableCreate() {\n" +
          "const body = document.body, tbl = document.createElement('table');\n" +
          "tbl.style.width = '500px';\n" +
          "tbl.style[\"border-spacing\"] = 0;\n" +
          "\n" +
          "for (let i = 255; i >= 0; i--) {\n" +
          "const tr = tbl.insertRow();\n" +
          "tr.style.background = `rgb(${i}, ${i}, ${i})`\n" +
          "const td = tr.insertCell();\n" +
          "}\n" +
          "body.appendChild(tbl);\n" +
          "}\n" +
          "tableCreate();\n" +
          "</script>\n" +
          "</body>\n" +
          "</html>";
  public static final String PATH = "src/main/resources/source.html";

  public static void generateFile() throws IOException {
    File f = new File(PATH);
    BufferedWriter bw = new BufferedWriter(new FileWriter(f));
    bw.write(FILE_CONTENT);
    bw.close();
  }
}

