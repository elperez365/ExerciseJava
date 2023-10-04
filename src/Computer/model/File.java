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
		return this.name;
	}

	public int getSize() {
		return this.size;
	}

	public void setFather(Folder father) {
		this.father = father;
	}

	@Override
	public boolean equals(Object obj) {
		File f = (File) obj;
		return this.name.equals(f.getName());
	}

	public String toString() {
		return this.name + " " + this.size;
	}
}
