package person.hyc.objectFactory4Hibernate;

public interface MyObjectFactory {
	 
	<T extends BaseEntityObject>T get(Class<T> clazz,int id);
	
	<T>T create();
	
	//Session getHibernateSession();
	
	void delete(BaseEntityObject entity);
	
	<T>T criteria(Class<T> clazz);//只负责放入objectFactory
}
