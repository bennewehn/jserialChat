import serialio.Serial;
public class Receiver extends Thread {
    private final Serial serial;
    public Receiver(Serial serial){
        this.serial = serial;
    }

    @Override
    public void run() {
        while(true){
            int c = serial.read();
            System.out.print((char)c);
        }
    }
}
