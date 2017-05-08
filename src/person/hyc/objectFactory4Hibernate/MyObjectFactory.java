package person.hyc.objectFactory4Hibernate;

public interface MyObjectFactory {
	 
	<T>T get(Class<T> clazz,int id);
	
	

}
