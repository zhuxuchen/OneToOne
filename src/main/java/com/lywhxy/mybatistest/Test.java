package com.lywhxy.mybatistest;

import com.lywhxy.mapper.OrderMapper;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;

public class Test {
	
	public static void main(String[] args) throws IOException {
		SqlSession sqlSession = MyBatisUtils.getSession();
		OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
		System.out.println(orderMapper.selectOrderList2());
		sqlSession.close();
	}
}
