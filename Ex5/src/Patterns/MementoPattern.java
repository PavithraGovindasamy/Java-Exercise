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
	Vechicle vechicle=new Vechicle();
		System.out.println("the size of vechicle:"+vechicle.size);
		ObjectOutputStream object=new ObjectOutputStream(new FileOutputStream("file.dat"));
		vechicle.size=8;
		object.writeObject(vechicle);
		vechicle.size=5;
		System.out.println("size of vechicle:"+vechicle.size);
		System.out.println("Restore old value:");
		ObjectInputStream new_object=new ObjectInputStream(new FileInputStream("file.dat"));
		vechicle=(Vechicle)new_object.readObject();
		System.out.println("vechicle size..:"+vechicle.size);
		new_object=new ObjectInputStream(new FileInputStream("file.dat"));
		Vechicle vechicle2=(Vechicle)new_object.readObject();
		System.out.println(vechicle2.size);
	}
}
class Vechicle implements Serializable{
	int size=10;
}