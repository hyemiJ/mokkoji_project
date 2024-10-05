package com.example.backend.service;

import java.util.List;

import com.example.backend.entity.Code;
import com.example.backend.entity.CodeId;

public interface CodeService {
	public List<Code> selectList();
	public List<Code> selectPCList();
	public Code selectOne(CodeId id);
	public void save(Code entity);
	public void delete(CodeId id);
}
