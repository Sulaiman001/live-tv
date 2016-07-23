package com.yashketkar.livetv;

public class TVC {

public	String[] keys;
public	String[] values;
public String name;
public String path;
public int imageid;

	TVC() {
	}

	TVC(String name, String path) {
		this.name = name;
		this.path = path;
	}

	TVC(String name, String path, int imageid, String[] keys, String[] values) {
		this.name = name;
		this.path = path;
		this.imageid = imageid;
		this.keys = keys;
		this.values = values;
	}
}