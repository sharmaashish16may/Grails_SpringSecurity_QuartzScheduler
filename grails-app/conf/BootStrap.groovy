import springsecuritydemo.*;
import org.codehaus.groovy.grails.plugins.springsecurity.*

class BootStrap {
	def saltSource
	def springSecurityService

    def init = { servletContext ->
		if (Role.list().size() == 0) {
			new Role(authority:"ROLE_ANONYMOUS").save();
			new Role(authority:"ROLE_ADMIN").save();
			new Role(authority:"ROLE_USER").save();
		}
		String salt = saltSource instanceof NullSaltSource ? null : "Admin"
		String encodedPassword = springSecurityService.encodePassword('workN0w',salt)
		//String encodedPassword = springSecurityService.encodePassword("vision@123")
		
		
		User admin = new User(
			name:"Admin",
			username: "ashish",
			password: encodedPassword,
			email   :"sharma.ashish16may@gmail.com",
			secondaryEmail   :"cutedevil086@gmail.com",
			accountLocked: false,
			enabled: true,
			lastLogin:null,
			).save()
			
		User user2 = new User(
			name:"User",
			username: "ash",
			password: encodedPassword,
			email   :"sharma.ashish16may@gmail.com",
			secondaryEmail   :"cutedevil086@gmail.com",
			accountLocked: false,
			enabled: true,
			lastLogin:null,
			).save()
				
		User user3 = new User(
			name:"User",
			username: "a",
			password: encodedPassword,
			email   :"sharma.ashish16may@gmail.com",
			secondaryEmail   :"cutedevil086@gmail.com",
			accountLocked: false,
			enabled: true,
			lastLogin:null,
			).save()
				
		UserRole adminRole=new UserRole(user:admin , role: Role.findByAuthority('ROLE_ADMIN')).save()
		//UserRole userRole=new UserRole(user:admin  , role: Role.findByAuthority('ROLE_ANONYMOUS')).save()
		UserRole userRole2=new UserRole(user:admin  , role: Role.findByAuthority('ROLE_USER')).save()
		
		UserRole userRole3=new UserRole(user:user2  , role: Role.findByAuthority('ROLE_USER')).save()
		
		UserRole userRole=new UserRole(user:user3  , role: Role.findByAuthority('ROLE_ANONYMOUS')).save()
		
		
		
    }
    def destroy = {
    }
}
