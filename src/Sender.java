import serialio.Serial;
import java.util.Scanner;

public class Sender extends Thread{
    private final Serial serial;
    private final String username;
    private final Scanner scn = new Scanner(System.in);
    public Sender(Serial serial, String username){
        this.serial = serial;
        this.username = username;
    }

    @Override
    public void run() {
        while(scn.hasNextLine()){
            String msg = scn.nextLine();
            serial.write(username + ": " + msg + "\n");
        }
    }
}
