package springsecuritydemo



class MyJobJob {
	def MyService;
    static triggers = {
      simple repeatInterval: 30000l // execute job once in 5 seconds
    }

    def execute() {
        MyService.fireOnTrigger();
    }
}
