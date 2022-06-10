package tytr;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ToSave {

	public static void main(String[] args) {
		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hemanth");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		
		
	//	Student s =new Student();
//		s.setId(1080);
//		s.setName("hkli");
//		s.setPercentage(9878.9);
//		                                    //to add data into database
//		entityTransaction.begin();
//		entityManager.persist(s);
//		entityTransaction.commit();
//		
//		System.out.println("its done");
		
		System.out.println("______________________");
		
//		Student student=entityManager.find(Student.class, 101);
//		
//		System.out.println(student.getId());
//		System.out.println(student.getName());                //to get values
//		System.out.println(student.getPercentage());
		
		System.out.println("______________________");
		
//		Student student=entityManager.find(Student.class, 101);
//		entityTransaction.begin();                              //to delete
//	 	entityManager.remove(student);
// 		entityTransaction.commit();
		
		System.out.println("______________________");
		
//		Query query=entityManager.createQuery("select s from Student s  ");
//		
//		List<Student> student=query.getResultList();
//		                                                       //to get multiple data
//		for(Student student2:student) {
//			System.out.println(student2.getId());
//			System.out.println(student2.getName());
//			System.out.println(student2.getPercentage());
//			System.out.println("___________________");
//			System.out.println("___________________");
//		}
		
		System.out.println("______________________");
		
//		Query query=entityManager.createQuery("select s from Student s where s.id=3 ");
//		
//		List<Student> student=query.getResultList();
//		                                            //to get  data with custom query
//		for(Student student2:student) {
//			System.out.println(student2.getId());
//			System.out.println(student2.getName());
//			System.out.println(student2.getPercentage());
//			System.out.println("___________________");
//			System.out.println("___________________");
//		}
	
		System.out.println("______________________");
		
//		Query query=entityManager.createQuery("select s from Student s where s.id=?1 ");
//		query.setParameter(1, 3);
//		
//		List<Student> student=query.getResultList();
//		                                            //to get  data with custom query
//		for(Student student2:student) {
//			System.out.println(student2.getId());
//			System.out.println(student2.getName());
//			System.out.println(student2.getPercentage());
//			System.out.println("___________________");
//			System.out.println("___________________");
//		
//	}
		
		System.out.println("________________________");
//		Query query=entityManager.createQuery("select s from Student s where s.id=?1 and s.name=?2 ");
//		query.setParameter(1, 107);
//		query.setParameter(2, "hli");
//		
//		List<Student> student=query.getResultList();
//		                                            //to get  data with custom query2
//		for(Student student2:student) {
//			System.out.println(student2.getId());
//			System.out.println(student2.getName());
//			System.out.println(student2.getPercentage());
//			System.out.println("___________________");
//			System.out.println("___________________");
//		
//	}
		System.out.println("________________________");
		
		Student s =new Student();
		s.setId(1080);
		s.setName("malla");
		s.setPercentage(78.9);
		                                    //to update data into database
		entityTransaction.begin();
		entityManager.merge(s);
		entityTransaction.commit();
		
}
}
