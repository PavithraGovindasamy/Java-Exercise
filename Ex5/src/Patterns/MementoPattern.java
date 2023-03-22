package Patterns;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/**
 * 
 * @author pavithra
 * class that implements MementoPattern to restore a value which is changed
 *
 */
public class MementoPattern {
	public static void main(String[] args)throws Exception {
		vechicle vechicle=new vechicle();
		System.out.println("the size of vechicle:"+vechicle.size);
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("file.dat"));
		vechicle.size=8;
		oos.writeObject(vechicle);
		vechicle.size=5;
		System.out.println("size of vechicle:"+vechicle.size);
		System.out.println("Restore old value:");
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("file.dat"));
		vechicle=(vechicle)ois.readObject();
		System.out.println("vechicle size..:"+vechicle.size);
		ois=new ObjectInputStream(new FileInputStream("file.dat"));
		vechicle vechicle2=(vechicle)ois.readObject();
		System.out.println(vechicle2.size);
	}
}
class vechicle implements Serializable{
	int size=10;
}