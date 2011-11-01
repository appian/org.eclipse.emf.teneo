package fruits;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.jpox.JpoxDataStore;
import org.eclipse.emf.teneo.jpox.JpoxHelper;
import org.jpox.PMFConfiguration;



public class TestFruits
{
	public static void main(String[] args) 
	{
		java.util.Properties properties = new java.util.Properties();
		properties.setProperty(PMFConfiguration.JDO_DATASTORE_DRIVERNAME_PROPERTY, "com.ibm.db2.jcc.DB2Driver");
		properties.setProperty(PMFConfiguration.JDO_DATASTORE_URL_PROPERTY, "jdbc:db2://127.0.0.1:50000/fruits");
		properties.setProperty(PMFConfiguration.JDO_DATASTORE_USERNAME_PROPERTY, "db2");
		properties.setProperty(PMFConfiguration.JDO_DATASTORE_PASSWORD_PROPERTY, "db2");
		
		JpoxDataStore jpoxDataStore = JpoxHelper.INSTANCE.createRegisterDataStore("MyPMF");
		jpoxDataStore.setProperties(properties);
		jpoxDataStore.setEPackages(new EPackage[] {TreePackage.eINSTANCE, ApplePackage.eINSTANCE});
		jpoxDataStore.initialize();
	}
}
