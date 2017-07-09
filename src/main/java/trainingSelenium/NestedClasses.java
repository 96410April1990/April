package trainingSelenium;

class NestedClasses {
	
	int num;
	
	private class InnerClass {
		
		public void printInnerClass() {
			
			System.out.println("Hi, i am the nested class");
			
		}
		
	}

	void displayInner() {
	// TODO Auto-generated method stub
	
		InnerClass accessnestedclass = new InnerClass(); 
		
			accessnestedclass.printInnerClass();
			
		}

	}


