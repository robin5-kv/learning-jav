package com.fileoperations;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonFile {

	public static void main(String[] args) throws IOException {

		JSONObject jsonobject = new JSONObject();
		jsonobject.put("Name", "Robin");
		jsonobject.put("number", 2);

		// implementing array
		JSONArray jsa = new JSONArray();
		jsa.add("rome");
		jsa.add("Italy");
		jsa.add("Dubai");
		jsonobject.put("states", jsa);
		FileWriter fw = new FileWriter("vibin.json");
		fw.write(jsonobject.toJSONString());
		fw.close();

	}
F
}
