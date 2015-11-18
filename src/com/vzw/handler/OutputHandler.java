package com.vzw.handler;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

import com.vzw.vo.LogFileVO;

public class OutputHandler implements ItemWriter<LogFileVO> {

	private String threadName;

	public String getThreadName() {
		return threadName;
	}

	public void setThreadName(String threadName) {
		this.threadName = threadName;
	}

	@Override
	public void write(List<? extends LogFileVO> arg0) throws Exception {
		// TODO Auto-generated method stub	
		for(LogFileVO obj:arg0){
			System.out.println("Thread Name : "+threadName+"XML : "+obj.getXml());
		}
	}

}
