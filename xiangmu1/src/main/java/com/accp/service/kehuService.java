package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.DizhiMapper;
import com.accp.dao.KehuMapper;
import com.accp.domain.Dizhi;
import com.accp.domain.DizhiExample;
import com.accp.domain.Kehu;
import com.accp.domain.KehuExample;

@Service
@Transactional
public class kehuService {
	
	@Autowired
	DizhiMapper dimap;
	
	@Autowired
	KehuMapper kemap;
	
	public List<Dizhi> finddi(){
		return dimap.selectByExample(null);
	}
	
	public Kehu findById(Integer id) {
		KehuExample example=new KehuExample();
		example.createCriteria().andIdEqualTo(id);
		List<Kehu> ke = kemap.selectByExample(example);
		DizhiExample example2=new DizhiExample();
		example2.createCriteria().andIdEqualTo(ke.get(0).getId());
		List<Dizhi> di = dimap.selectByExample(example2);
		Dizhi dd=di.get(di.size()-1);
		int num=dd.getDname().length();
		System.out.println(num);
		if(num>6) {
			String dname=dd.getDname().substring(3);
			dd.setDname(dname);
		}
		ke.get(0).setDizhi(dd);
		return ke.get(0);
	}
	
	public int update(Kehu ke) {
		kemap.deleteByPrimaryKey(ke.getId());
		int count=kemap.insert(ke);
		if(count>0) {
			ke.getDizhi().setId(ke.getId());
			/*Dizhi di=dimap.selectByPrimaryKey(ke.getDizhi().getDid());*/
			/*System.out.println(di.getId()+"**");*/
			System.out.println(ke.getId()+"**");
			System.out.println(ke.getDizhi().getDid()+"**");
			/*if(di.getId()==ke.getId()) {
				dimap.deleteByPrimaryKey(ke.getDizhi().getDid());
			}*/
			dimap.insert(ke.getDizhi());
			return 1;
		}
		return -1;
	}
	
	
}
