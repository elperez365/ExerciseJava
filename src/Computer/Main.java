package Computer;

import Computer.model.Computer;
import Computer.model.HardDisk;
import Computer.model.File;
import Computer.model.FileAlreadyExistingExeption;
import Computer.model.Folder;

public class Main {
	public static void main(String[] args) throws FileAlreadyExistingExeption {

		Computer c = new Computer();
		HardDisk hd1 = new HardDisk(5000);
		HardDisk hd2 = new HardDisk(5000);
		Folder folder1 = new Folder("folder1");

		c.addHardDisk(hd1);
		c.addHardDisk(hd2);
		folder1.addFile(new File("f2", 500));
		folder1.addFile(new File("f3", 500));
		folder1.addFile(new File("f4", 500));
		folder1.addFile(new File("f5", 500));

		folder1.addFile(new Folder("folder2"));

		folder1.getSubFolder("folder2").addFile(new File("f6", 500));

		hd1.addFile(new Folder("folder3"));
		hd1.addFile(folder1);

		System.out.println("Total size: " + hd1.getSize());
		System.out.println("Total size available: " + hd1.getSizeAvailable());
		System.out.println("Elenco folder 1: " + folder1.getElencoFiles());
		System.out.println("Total size of folder2: " + hd1.getFolder("/C/folder1"));
		System.out.println("Total size of folder3: " + hd1.getFolder("/C/folder3"));
		System.out.println(hd1);

	}
}
