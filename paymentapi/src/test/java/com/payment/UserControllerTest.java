package com.payment;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.payment.controller.UserController;
import com.payment.model.AddMoney;
import com.payment.model.User;
import com.payment.service.TransactionService;
import com.payment.service.UserService;

@RunWith(SpringRunner.class)
@WebMvcTest(value = UserController.class, secure = false)
public class UserControllerTest {

		@Autowired
		private MockMvc mockMvc;
		
		@MockBean
		private UserService userService;

		@MockBean
		private TransactionService trService;
		
		
		List<User> userlist;
		User u1;
		AddMoney a1;
		
		@Before
		public void beforeEachTest() {
			userlist= new ArrayList<User>();
			u1= new User(1L,"abc","abc","abc@gmail.com","1234");
			a1= new AddMoney();
			
			a1.setFromAccountNumber("14");
			a1.setAmount(200L);
			a1.setToAccountNumber("13");
			
			User u2= new User(1L,"xyz","zyx","xyz@gmail.com","12345");
			userlist.add(u1);
			userlist.add(u2);			
		}
		
		
		@Test
		public void getAllUsers() throws Exception {
			
			Mockito.when(userService.getAllUsers()).thenReturn(userlist);
			
			RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
					"/api/Users").accept(
					MediaType.APPLICATION_JSON);
			MvcResult result = mockMvc.perform(requestBuilder).andReturn();
			
			System.out.println(result.getResponse());
		
			assertNotNull(result.getResponse().getContentAsString());
		}
		
		
	/*
	 * @Test public void getAllUsers_fail() throws Exception {
	 * 
	 * throw new Exception(); }
	 */
		 
		  @Test
			public void getSelfUser() throws Exception {
				
			  Mockito.when(userService.getSelfUser()).thenReturn(u1);
				RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
						"/api/User").accept(
						MediaType.APPLICATION_JSON);
				MvcResult result = mockMvc.perform(requestBuilder).andReturn();
				
				System.out.println(result.getResponse());
			
				assertNotNull(result.getResponse().getContentAsString());
		  }
		  
	/*
	 * @Test public void getSelfUser_fail() throws Exception { throw new
	 * Exception(); }
	 */
		  
		  @Test
			public void addUser() throws Exception {
			  	
			    Mockito.when(userService.addUser(u1)).thenReturn(u1);
				String sampleRequestBody="{\r\n" + 
						"		\"firstName\": \"John\",\r\n" + 
						"		\"lastName\": \"DOW\",\r\n" + 
						"		\"emailId\": \"email@jd.com\",\r\n" + 
						"		\"phoneNumber\" :\"12346\"\r\n" + 
						"}";
				
				RequestBuilder requestBuilder = MockMvcRequestBuilders.post(
						"/api/User").accept(
						MediaType.APPLICATION_JSON).content(sampleRequestBody).contentType(MediaType.APPLICATION_JSON);
				MvcResult result = mockMvc.perform(requestBuilder).andReturn();
				
				System.out.println(result.getResponse());
			
				assertNotNull(result.getResponse().getContentAsString());
		  }
	/*
	 * @Test public void addUser_fail() throws Exception { throw new Exception(); }
	 */
		  
		  
		  
		  @Test
			public void addMoney() throws Exception {
				
			  Mockito.when(userService.addMoney(a1)).thenReturn("Success");
				String sampleRequestBody="{\r\n" + 
						"		\"fromUser\": {\r\n" + 
						"			\"accountNumber\": \"14\",\r\n" + 
						"			\"amount\": \"500\"\r\n" + 
						"		},\r\n" + 
						"		\"toUser\": {\r\n" + 
						"			\"accountNumber\": \"13\"\r\n" + 
						"		}\r\n" + 
						"}";
				RequestBuilder requestBuilder = MockMvcRequestBuilders.post(
						"/api/User").accept(
						MediaType.APPLICATION_JSON).content(sampleRequestBody).contentType(MediaType.APPLICATION_JSON);
				MvcResult result = mockMvc.perform(requestBuilder).andReturn();
				
				System.out.println(result.getResponse());
			
				assertNotNull(result.getResponse().getContentAsString());
		  }
		
		  /*
			 * @Test public void addMoney_fail() throws Exception { throw new Exception(); }
			 */
}
