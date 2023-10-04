package Computer.model;

import java.util.ArrayList;

public class HardDisk {

	private char driveLetter;
	private int size;
	ArrayList<File> elencoFiles = new ArrayList<File>();

	public HardDisk(int size) {
		this.size = size;
		this.elencoFiles.add(new Folder("/"));
	}

	public char getDriveLetter() {
		return driveLetter;
	}

	public int getSize() {
		return size;
	}

	public int getSizeAvailable() {
		int sizeAvailable = this.size;

		for (File file : elencoFiles) {
			if (file instanceof Folder) {
				sizeAvailable -= ((Folder) file).totalSize();
			} else {
				sizeAvailable -= file.getSize();
			}
		}
		return sizeAvailable;
	}

	public void setDriveLetter(char driveLetter) {
		this.driveLetter = driveLetter;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public File getFileByPath(String path) {
		ArrayList<File> newElencoFiles = this.elencoFiles;

		String[] pathArray = path.split("/");
		for (int i = 1; i < pathArray.length; i++) {
			for (File file : newElencoFiles) {
				if (file.getName().equals(pathArray[i])) {
					if (file instanceof Folder) {
						newElencoFiles = ((Folder) file).getElencoFiles();
					} else {
						return file;
					}
				}
			}
		}
		return null;
	}

	public void format() {
		this.elencoFiles = new ArrayList<File>();
		this.elencoFiles.add(new Folder("/"));
	}

	public Folder getFolder(String path) {
		ArrayList<File> newElencoFiles = this.elencoFiles;

		String[] pathArray = path.split("/");
		for (int i = 1; i < pathArray.length; i++) {
			for (File file : newElencoFiles) {
				if (file.getName().equals(pathArray[i])) {
					if (file instanceof Folder) {
						return (Folder) file;
					}
				}
			}
		}
		return null;
	}

	public int filesSize() {
		int filesSize = 0;

		for (File file : elencoFiles) {
			if (file instanceof Folder) {
				filesSize += ((Folder) file).totalSize();
			} else {
				filesSize += file.getSize();
			}
		}
		return filesSize;
	}

	public void addFile(File f) throws FileAlreadyExistingExeption {
		Boolean found = false;

		for (File file : elencoFiles) {
			if (file.equals(f)) {
				found = true;
			}
		}
		if (found == true) {
			throw new FileAlreadyExistingExeption("File already existing");
		} else {
			f.setFather(new Folder("/"));
			elencoFiles.add(f);
		}
	}

	public ArrayList<File> getAllFiles() {
		return this.elencoFiles;
	}

	public String toString() {
		return "HardDisk [driveLetter=" + driveLetter + ", sizeAvailable=" + this.getSizeAvailable() + ", elencoFiles="
				+ elencoFiles + "]";
	}
}
