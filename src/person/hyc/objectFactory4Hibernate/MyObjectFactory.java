package person.hyc.objectFactory4Hibernate;

import java.util.List;

public interface MyObjectFactory {
	 
	<T extends BaseEntityObject> T get(Class<T> clazz,int id);
	
	<T extends BaseEntityObject> T create();
	
	//Session getHibernateSession();
	
	void delete(BaseEntityObject entity);
	
	<T extends BaseCriteria> T criteria(Class<T> clazz);//只负责放入objectFactory
	
	<T extends BaseEntityObject> List<T> all(Class<T> clazz);
}
