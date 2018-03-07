package com.well.SeleniumFramework.Utils;

import java.util.HashMap;
import java.util.List;

/**
 * @author Rustam Yuldoshev 2018
 *
 */
public class ExecutionDriver {

	public static void main(String[] args) {
		SeleniumExecutor exec=new SeleniumExecutor();
		TestNGExecutor tngExec=new TestNGExecutor();
		List<TestNGModuleDTO> list=exec.getRunnableTestCases();
		HashMap<String,List<TestNGModuleDTO>> map_Suite=new HashMap<String,List<TestNGModuleDTO>>();
		map_Suite.put(String.valueOf(1), list);
		tngExec.buildXML(map_Suite);
	
	}
}
