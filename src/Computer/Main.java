package Computer;

import Computer.model.Computer;
import Computer.model.File;
import Computer.model.Folder;
import Computer.model.HardDisk;

public class Main {
	public static void main(String[] args) {

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

		// folder1.addFolder(new Folder("folder2"));

		// folder1.getSubFolder("folder2").addFile(new File("f6", 500));
		// folder1.getSubFolder("folder2").addFile(new File("f7", 500));
		// folder1.getSubFolder("folder2").addFile(new File("f8", 500));

		hd1.addFile(new Folder("folder3"));
		hd1.addFile(folder1);

		System.out.println("Drive letter: " + hd2.getDriveLetter());

	}
}
