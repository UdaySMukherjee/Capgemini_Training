package Annotation;

@MyAnnotation(value = 10, value2 = "hello")
public class AnnotationDriver {
	@MyAnnotation(value2 = "heelo")
	int age;
	@MyAnnotation(value2 = "Hi")
	void mix() {
		
	}
	public static void main(String[] args) {
		
	}
}
