import model.network.NetworkClient;

public class Main {
    public static void main(String[] args) {

        NetworkClient networkClient = new NetworkClient();
        networkClient.startApp();

        System.out.println();

        NBGJsonParser nbgJsonParser = new NBGJsonParser();
        nbgJsonParser.startApp();
    }
}