package com.vzw.utils;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.vzw.vo.LogFileVO;

public class LogFileMapper implements FieldSetMapper{

	@Override
	public Object mapFieldSet(FieldSet set) throws BindException {
		// TODO Auto-generated method stub
		LogFileVO vo=new LogFileVO();
		vo.setXml(set.readString("xml"));
		return vo;
	}

}
