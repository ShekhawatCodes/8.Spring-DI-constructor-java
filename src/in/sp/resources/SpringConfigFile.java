package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {

	@Bean
	public Address createAddressObj() {
		Address addr = new Address(107,"kishangarh",201301);
		return addr;
	}
	
	
	@Bean
	public Student createStudentObj() {
		Student std = new Student("anurag vyas",177,createAddressObj());		
		return std;
	}
}
