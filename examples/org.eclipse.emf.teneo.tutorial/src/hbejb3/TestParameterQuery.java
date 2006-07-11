/*
 *	Copyright 2004-2006, Elver.org (http://www.elver.org).
 *
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *
 *		http://www.apache.org/licenses/LICENSE-2.0
 *
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 */
package hbejb3;

import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.example.library.Book;
import org.eclipse.example.library.BookCategory;
import org.eclipse.example.library.Library;
import org.eclipse.example.library.LibraryFactory;
import org.eclipse.example.library.LibraryPackage;
import org.eclipse.example.library.Writer;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.annotations.pannotation.InheritanceType;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Environment;
import org.hibernate.ejb.Ejb3Configuration;
import org.hibernate.tool.hbm2ddl.SchemaUpdate;

/**
 * Quick Start Tutorial
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
*/
public class TestParameterQuery {

	/** The main method */
	public static void main(String[] args) {
		Ejb3Configuration conf = new Ejb3Configuration();

		final Properties props = new Properties();
		props.setProperty(Environment.DRIVER, "com.mysql.jdbc.Driver");
		props.setProperty(Environment.USER, "root");
		props.setProperty(Environment.URL, "jdbc:mysql://127.0.0.1:3306/house");
		props.setProperty(Environment.PASS, "root");
		props.setProperty(Environment.DIALECT, org.hibernate.dialect.MySQLInnoDBDialect.class.getName());
		conf.addProperties(props);
		conf.addAnnotatedClass(My.class);
		conf.addAnnotatedClass(House.class);

		new SchemaUpdate(conf.getHibernateConfiguration()).execute(false, true);
		
		EntityManagerFactory emf = conf.createEntityManagerFactory();
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		My my = new My();
		House house = new House();
		my.getHouses().add(house);
		em.persist(house);
		em.persist(my);
		tx.commit();
		
		tx.begin();
		Query qry = em.createQuery("select h from Huis as h");
		House testHouse = (House)qry.getResultList().get(0);
		
		Query myQry = em.createQuery("select m from My as m where :param in elements(m.houses)");
		myQry.setParameter("param", testHouse);
		My testMy = (My)myQry.getResultList().get(0);
		tx.commit();
	}
}