package api;

public class ApiCliente {

    public static void main(String[] args) {


    import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;

        public class SwapiAPI {
            public static void main(String[] args) {
                try {
                    URL url = new URL("https://swapi.info/api/films/1");
                    HttpURLConnection con = (HttpURLConnection) url.openConnection();
                    con.setRequestMethod("GET");

                    BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                    String inputLine;
                    StringBuilder content = new StringBuilder();
                    while ((inputLine = in.readLine()) != null) {
                        content.append(inputLine);
                    }
                    in.close();
                    con.disconnect();
                    System.out.println(content.toString());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }




    }
}
