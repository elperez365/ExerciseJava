package Computer.model;

import java.util.ArrayList;

public class Computer {

	ArrayList<HardDisk> hardDisks = new ArrayList<HardDisk>();

	public void addHardDisk(HardDisk hardDisk) {
		hardDisk.setDriveLetter((char) (hardDisks.size() + 67));
		hardDisks.add(hardDisk);
	}

	public ArrayList<HardDisk> elencoDisks() {
		return hardDisks;
	}

	public HardDisk getDisk(char driveLetter) {
		for (HardDisk hardDisk : hardDisks) {
			if (hardDisk.getDriveLetter() == driveLetter) {
				return hardDisk;
			}
		}
		return null;
	}

}
