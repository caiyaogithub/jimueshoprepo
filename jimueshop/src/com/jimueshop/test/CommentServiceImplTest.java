package com.jimueshop.test;

import static org.junit.Assert.fail;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jimueshop.admin.service.CommentService;
import com.jimueshop.domain.Comment;
import com.jimueshop.domain.Page;
import com.jimueshop.domain.Product;

public class CommentServiceImplTest {
	
	ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:/applicationContext-*.xml") ;
	
	CommentService commentService = (CommentService)ac.getBean("CommentService") ;
	@Test
	public void testQueryAllComment() {
		Page page = commentService.queryAllComment(1) ;
		List list = page.getList() ;
		for(Object o : list ){
			Comment comment = (Comment)o ;
			System.out.println(comment.getContent()) ;
		}
	}

	@Test
	public void testQuerySomeCommentsByProperties() {
		/*Map<String , String> alreadyReply = new HashMap<String,String>() ;
		alreadyReply.put("flag", "�ѻظ�") ;
		Page page = commentService.querySomeCommentsByProperties(1, alreadyReply) ;*/
		
		Map<String , String> alreadyReply = new HashMap<String,String>() ;
		alreadyReply.put("flag", "δ�ظ�") ;
		Page page = commentService.querySomeCommentsByProperties(1, alreadyReply) ;

		List list = page.getList() ;
		for(Object o : list ){
			Comment comment = (Comment)o ;
			System.out.println(comment.getContent()) ;
		}
	}

	@Test
	public void testReplyComment() {
		commentService.replyComment(4, "���ǲ��ԵĻظ�����") ;
	}

	@Test
	public void testSetCommentDao() {
		fail("Not yet implemented");
	}
	@Test
	public void testAddComment(){
		Product product = new Product() ;
		product.setId(3) ;
		Comment comment = new Comment() ;
		comment.setProduct(product) ;
		comment.setCommentDate(new Date()) ;
		comment.setContent("���Ƕ���Ʒ3������") ;
		comment.setFlag("�ѻظ�") ;
		comment.setTitle("�ö���") ;
		comment.setUserName("caiyao") ;
		comment.setReply("����ϵͳ�����۵Ļظ�") ;
		commentService.addComment(comment) ;
	}
}
