package Computer.model;

import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;

public class Folder extends File implements FolderInterface {

	public Folder(String name) {
		super(name, 0);
		this.size += 5;
	}

	public ArrayList<File> getElencoFiles() {
		return elencoFiles;
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

	public void addFolder(Folder folder) {
		try {
			for (File file : elencoFiles) {
				if (file.getName().equals(folder.getName())) {
					throw new FolderAlreadyExistingExeption("Folder already existing");
				} else {
					elencoFiles.add(folder);
				}
			}
		} catch (FolderAlreadyExistingExeption e) {
			System.out.println(e.getMessage());
		}
	}

	public void addFile(File f) {
		try {
			for (File file : elencoFiles) {
				if (file.getName().equals(file.getName())) {
					throw new FileAlreadyExistingExeption("File already existing");
				} else {
					file.father = this;
					elencoFiles.add(file);
				}
			}
		} catch (FileAlreadyExistingExeption e) {
			System.out.println(e.getMessage());
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
}
