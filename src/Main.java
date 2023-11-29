import serialio.Serial;

public class Main {
    public static void main(String[] args) {
        String comPort = "COM255";
        String username = "user1";

        Serial serial = new Serial(comPort, 9600, 8, 1, Serial.PARITY_NONE);

        if(serial.open()){
            Receiver receiver = new Receiver(serial);
            Sender sender = new Sender(serial, username);
            sender.start();
            receiver.start();
        }

        else{
            System.out.printf("Error opening %s \n", comPort);
        }
    }
}