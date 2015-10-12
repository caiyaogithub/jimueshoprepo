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
		alreadyReply.put("flag", "已回复") ;
		Page page = commentService.querySomeCommentsByProperties(1, alreadyReply) ;*/
		
		Map<String , String> alreadyReply = new HashMap<String,String>() ;
		alreadyReply.put("flag", "未回复") ;
		Page page = commentService.querySomeCommentsByProperties(1, alreadyReply) ;

		List list = page.getList() ;
		for(Object o : list ){
			Comment comment = (Comment)o ;
			System.out.println(comment.getContent()) ;
		}
	}

	@Test
	public void testReplyComment() {
		commentService.replyComment(4, "这是测试的回复内容") ;
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
		comment.setContent("这是对商品3的评论") ;
		comment.setFlag("已回复") ;
		comment.setTitle("好东西") ;
		comment.setUserName("caiyao") ;
		comment.setReply("这是系统对评论的回复") ;
		commentService.addComment(comment) ;
	}
}
