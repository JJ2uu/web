package com.multi.mvc02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {
	
	@Autowired
	BbsDAO dao;
	
	@RequestMapping("insert2.multi")
	public void bbs_insert(BbsVO bag) {
		System.out.println("insert 요청됨");
		System.out.println(bag);
		System.out.println(dao);
		dao.insert(bag);
	}
	
	@RequestMapping("delete2.multi")
	public void bbs_delete(BbsVO bag) {
		System.out.println("delete 요청됨");
		System.out.println(bag);
		System.out.println(dao);
		dao.delete(bag);
	}
	
	@RequestMapping("update2.multi")
	public void bbs_update(BbsVO bag) {
		System.out.println("update 요청됨");
		System.out.println(bag);
		System.out.println(dao);
		dao.update(bag);
	}
	
	@RequestMapping("one2.multi")
	public void bbs_one(BbsVO bag) {
		System.out.println("one 검색 요청됨");
		System.out.println(bag);
		System.out.println(dao);
		dao.one(bag);
	}
}
