package Computer.model;

import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;

public class Folder extends File {

	private ArrayList<File> elencoFiles = new ArrayList<File>();

	public Folder(String name) {
		super(name, 0);
		this.size += 5;
	}

	public ArrayList<File> getElencoFiles() {
		return this.elencoFiles;
	}

	public File getFile(String name) {
		for (File file : elencoFiles) {
			if (file.getName().equals(name)) {
				return file;
			}
		}
		return null;
	}

	public List<File> getFilesByName() {
		return elencoFiles.stream().sorted((f1, f2) -> f1.getName().compareTo(f2.getName()))
				.collect(Collectors.toList());
	}

	public List<File> getFileBySize() {
		return elencoFiles.stream().sorted((f1, f2) -> f1.getSize() - f2.getSize()).collect(Collectors.toList());
	}

	public int totalSize() {
		int totalSize = this.size;

		for (File file : elencoFiles) {
			if (file instanceof Folder) {
				totalSize += ((Folder) file).totalSize();
			} else {
				totalSize += file.getSize();
			}
		}
		return totalSize;
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
			f.father = this;
			this.elencoFiles.add(f);
		}
	}

	public Folder getSubFolder(String name) {
		for (File file : elencoFiles) {
			if (file instanceof Folder) {
				if (file.getName().equals(name)) {
					return (Folder) file;
				}
			}
		}
		return null;
	}

	public Folder getFather() {
		return this.father;
	}

	@Override
	public String toString() {
		return this.name + " " + this.size + " " + this.elencoFiles;
	}
}
