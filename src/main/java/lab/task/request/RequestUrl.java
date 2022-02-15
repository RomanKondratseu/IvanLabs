package lab.task.request;

import lab.task.four.LabOneTaskFour;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class RequestUrl {
  public static void main(String[] args) throws IOException {
    String urlFromArgs = args[0];
    String filePath = args[1];

    URL url = new URL(urlFromArgs);
    HttpURLConnection con = (HttpURLConnection) url.openConnection();
    con.setRequestMethod("GET");

    BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
    String inputLine;
    StringBuffer content = new StringBuffer();
    while ((inputLine = in.readLine()) != null) {
      content.append(inputLine);
    }
    in.close();

    LabOneTaskFour.saveToFile(content.toString(), filePath);
  }
}
