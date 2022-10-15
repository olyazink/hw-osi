import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        String host = "127.0.0.1";
        int port = 8090;
        try (Socket clientSoket = new Socket(host, port);
             PrintWriter out = new PrintWriter(clientSoket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSoket.getInputStream()))) {

            out.println("ещё раз получилось");

            String resp = in.readLine();
            System.out.println(resp);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

