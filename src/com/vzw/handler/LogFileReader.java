package com.vzw.handler;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

import com.vzw.vo.LogFileVO;

public class LogFileReader implements ItemReader<LogFileVO> {

	private String threadName;

	public String getThreadName() {
		return threadName;
	}

	public void setThreadName(String threadName) {
		this.threadName = threadName;
	}

	@Override
	public LogFileVO read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		// TODO Auto-generated method stub
		System.out.println("Log Reader ....  ");
		LogFileVO obj = new LogFileVO();
		obj.setXml("<xml><threadName>" + threadName + "</threadName></xml>");
		return null;
	}

}
