package Computer.model;

public class File {

	String name;
	int size;
	Folder father;

	public File(String name, int size) {
		this.name = name;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public int getSize() {
		return size;
	}

	public void setFather(Folder father) {
		this.father = father;
	}

}
