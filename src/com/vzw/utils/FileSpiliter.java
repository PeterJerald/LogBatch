package com.vzw.utils;

import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.core.partition.support.Partitioner;
import org.springframework.batch.item.ExecutionContext;

public class FileSpiliter implements Partitioner {

	@Override
	public Map<String, ExecutionContext> partition(int gridSize) {
		// TODO Auto-generated method stub

		Map<String, ExecutionContext> result = new HashMap<String, ExecutionContext>();

		for (int i = 1; i <= gridSize; i++) {
			ExecutionContext value = new ExecutionContext();

			// give each thread a name
			value.putString("name", "Thread : " + i);
			value.putString("fileName", "spilt"+i+".log");

			result.put("partition" + i, value);

		}
		System.out.println("File Spliting Completed .... ");

		return result;
	}

}
