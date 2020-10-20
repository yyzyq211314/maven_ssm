package com.tledu.zrz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tledu.zrz.dao.IBranchDao;
import com.tledu.zrz.model.Branch;
import com.tledu.zrz.service.IBranchService;

@Service
public class BranchService implements IBranchService {
	@Autowired
	private IBranchDao branchDao;
	
	@Override
	public List<Branch> list() {
		return branchDao.list();
	}
}
