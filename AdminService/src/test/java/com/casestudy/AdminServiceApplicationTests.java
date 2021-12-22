package com.casestudy;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.casestudy.AdminRepo.AdminRepository;
import com.casestudy.AdminSer.AdminService;


@RunWith(SpringRunner.class)
@SpringBootTest
class AdminServiceApplicationTests {

	@Autowired
	private AdminService service;
	
	@MockBean
	private AdminRepository adminrepo;


	@Test
	public void getAdminTest() {
		when(adminrepo.findAll()).thenReturn(Stream
				.of(new Admin("01","saikumar","hyderabad"),new Admin("02","saikumar","hyderabad")).collect(Collectors.toList()));
		assertEquals(2,service.getAdmin().size());
	}
	
	@Test
	public void addAdminTest() {
		Admin admin=new Admin("01","saikumar","pullakandam");
		when(adminrepo.save(admin)).thenReturn(admin);
		assertEquals(admin,service.addAdmin(admin));
	}
	
	@Test
	public void deleteadminTest() {
		Admin admin=new Admin("01","saikumar","khammam");
		service.deleteadmin(admin);
	}
	
	

	

}