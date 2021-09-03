package com.cg.spring.core.demo.aug3;

import java.util.List;

public class Department {

	private int did;
	private String dname;
	private List<String> functions;

	public Department() {
		super();
	}

	public Department(int did, String dname, List<String> functions) {
		super();
		this.did = did;
		this.dname = dname;
		this.functions = functions;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public List<String> getFunctions() {
		return functions;
	}

	public void setFunctions(List<String> functions) {
		this.functions = functions;
	}

	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + ", functions=" + functions + "]";
	}

}
