package week12;

import java.io.Serializable;

public class Student implements Serializable, Comparable<Student> {
	private String name;
	private int sNum;
	private int javaScore;
	private int linuxScore;

	public Student() {
		name = "";
		sNum = -1;
		javaScore = 0;
		linuxScore = 0;
	}

	public Student(String name, int num, int java, int linux) {
		this.name = name;
		sNum = num;
		javaScore = java;
		linuxScore = linux;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getsNum() {
		return sNum;
	}

	public void setsNum(int sNum) {
		this.sNum = sNum;
	}

	public int getJavaScore() {
		return javaScore;
	}

	public void setJavaScore(int javaScore) {
		this.javaScore = javaScore;
	}

	public int getLinuxScore() {
		return linuxScore;
	}

	public void setLinuxScore(int linuxScore) {
		this.linuxScore = linuxScore;
	}
	public String toString() {
		return name+"\t"+sNum+"\t"+javaScore+"\t"+linuxScore;
	}

	@Override
	public int compareTo(Student s) {
		return name.compareTo(s.getName());
	}


}
