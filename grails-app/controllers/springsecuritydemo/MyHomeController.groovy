package springsecuritydemo

class MyHomeController {
	def springsecurityService
    def index() {
		render(view:"homePage");
	}
	
	
	def viewAllUser(){
		def details = User.findAll();
		[details:details];
	}
}
