package com.kosmo.jsonrestapi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import mybatis.IAndroidDAO;
import mybatis.MemberVO;

@Controller
public class AndroidController {
	
	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping("/android/memberObject.do")
	@ResponseBody
	public Map<String, Object> memberObject() {
		
		Map<String, Object> map = new HashMap<String, Object>();
		ArrayList<MemberVO> list = sqlSession.getMapper(IAndroidDAO.class).memberList();
		
		map.put("memberList", list);
		return map;
	}
	
	@RequestMapping("/android/memberList.do")
	@ResponseBody
	public ArrayList<MemberVO> memberList() {
		
		ArrayList<MemberVO> list = sqlSession.getMapper(IAndroidDAO.class).memberList();
		
		return list;
	}
	
	@RequestMapping("/android/memberLogin.do")
	@ResponseBody
	public Map<String, Object> memberLogin(MemberVO memberVO) {
		
		Map<String, Object> map = new HashMap<String, Object>();
		MemberVO dto = sqlSession.getMapper(IAndroidDAO.class).memberLogin(memberVO);
		
		if (dto == null) {
			map.put("isLogin", 0);
		}
		else {
			map.put("isLogin", 1);
			map.put("memberInfo", dto);
		}
		
		return map;
	}
}
