import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

public class Server{

    ServerSocket serverSocket;
    Socket clientSocke;
    int porta;

    //Costruttore
    public Server(int porta) {
        this.porta = porta;
    }

    public Socket attendi() {

        Socket s = new Socket();
        return s;
    }

    public void scrivi() {

    }

    public void leggi() {

    }

    public void chiudi() {

    }

    public void termina() {


    }
}