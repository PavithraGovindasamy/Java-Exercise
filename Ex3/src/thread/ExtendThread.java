package thread;
/**
 * 
 * @author pavithra
 * class that implements thread implementation that extends thread class 
 *
 */
public class ExtendThread extends Thread {
    private StringBuffer buffer;

    public ExtendThread(StringBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
             synchronized(buffer) {
            for (int i = 0; i < 100; i++) {
                System.out.print( buffer.toString());
            }
            System.out.println("");
            
            buffer.setCharAt(0,(char) (buffer.charAt(0)+1));
             }
    }

    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("A");
        ExtendThread thread1 = new ExtendThread(buffer);
        ExtendThread thread2 = new ExtendThread(buffer);
        ExtendThread thread3 = new ExtendThread(buffer);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
