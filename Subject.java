package collectionDepemdencyUsingConstructor;

import java.util.List;
import java.util.Set;

public class Subject {
	private String subjectName;
	private List<String> list;
	private Set<String> set;
	public Subject(String subjectName, List<String> list, Set<String> set) {
		super();
		this.subjectName = subjectName;
		this.list = list;
		this.set = set;
	}

	public Set<String> getSet() {
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	public Subject(String subjectName, List<String> list) {
		super();
		this.subjectName = subjectName;
		this.list = list;
	}

	public String getSubjectName() {
		return subjectName;
	}
	
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "Subject [subjectName=" + subjectName + ", list=" + list + ", set=" + set + "]";
	}
	

}
