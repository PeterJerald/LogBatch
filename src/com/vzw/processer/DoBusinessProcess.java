package com.vzw.processer;

import org.springframework.batch.item.ItemProcessor;

import com.vzw.vo.LogFileVO;

public class DoBusinessProcess implements ItemProcessor<LogFileVO, LogFileVO> {

	private String threadName;

	public String getThreadName() {
		return threadName;
	}

	public void setThreadName(String threadName) {
		this.threadName = threadName;
	}

	@Override
	public LogFileVO process(LogFileVO arg0) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("In processor  : Thread name :" + threadName + " XMl Content  : " + arg0.getXml());
		return arg0;
	}

}
