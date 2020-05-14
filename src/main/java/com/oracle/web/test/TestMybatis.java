package com.oracle.web.test;
 
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mybatis.generator.codegen.ibatis2.model.ExampleGenerator;

import com.github.pagehelper.PageHelper;
import com.mysql.fabric.xmlrpc.base.Array;
/*import com.oracle.web.bean.Admin;
import com.oracle.web.bean.Monster;
import com.oracle.web.bean.MonsterExample;
import com.oracle.web.bean.MonsterExample.Criteria;
import com.oracle.web.mapper.AdminMapper;
import com.oracle.web.mapper.MonsterMapper;*/
 

public class TestMybatis {

	 SqlSession session=null;
	 /*MonsterMapper mapper =null;
	@Before
	public void cread() throws IOException{
		//加载主配置文件
		 InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
	//2.创建SqlSessionFactory
		 SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	//3开启会话 
		  session=sessionFactory.openSession();
		     mapper = session.getMapper(MonsterMapper.class);
	}
	
	@Test
	public void testM(){
		MonsterExample example=new MonsterExample();
		//Criteria criteria = example.createCriteria();
		//criteria.andMonsterIdIn(Arrays.asList(30,33));
		//criteria.andMonsternameLike("%3%");
		PageHelper.startPage(1, 2);
	List<Monster> list=  mapper.selectByExample(example);
      for (Monster monster : list) {
	System.out.println(monster.toString());
      }
	}*/
	@After
	public void distroy(){
		 //6.提交事务
		 
		 session.commit();
		 //7.关闭会话
		 session.close();
	}
	
}
