package org.eclipse.emf.teneo.samples.emf.hibernate.usertype;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;
import org.hibernate.usertype.UserType;

/**
 * Trivial example implementation of a user type for an ereference.
 */
public class CertificateType implements UserType {

	private static final int[] SQL_TYPES = new int[] { Types.VARCHAR, Types.INTEGER };

	public Object assemble(Serializable cached, Object owner) throws HibernateException {
		return deepCopy(cached);
	}

	public Object deepCopy(Object value) throws HibernateException {
		Certificate certificate = (Certificate) value;
		return EcoreUtil.copy(certificate);
	}

	public Serializable disassemble(Object value) throws HibernateException {
		return (Serializable) deepCopy(value);
	}

	public boolean equals(Object x, Object y) throws HibernateException {
		if (x == y) {
			return true;
		} else if (x == null || y == null) {
			return false;
		}
		return x.equals(y);
	}

	public int hashCode(Object x) throws HibernateException {
		return x.hashCode();
	}

	public boolean isMutable() {
		return true;
	}

	public Object nullSafeGet(ResultSet rs, String[] names, SessionImplementor session, Object owner)
			throws HibernateException, SQLException {
		String name = StringType.INSTANCE.nullSafeGet(rs, names[0], session);
		Integer length = IntegerType.INSTANCE.nullSafeGet(rs, names[1], session);
		final Certificate certificate = UsertypeFactory.eINSTANCE.createCertificate();
		certificate.setLength(length.intValue());
		certificate.setName(name);
		return certificate;
	}

	public void nullSafeSet(PreparedStatement st, Object value, int index,
			SessionImplementor sessionImplementor) throws HibernateException, SQLException {
		Certificate certificate = (Certificate) value;
		StringType.INSTANCE.nullSafeSet(st, certificate.getName(), index, sessionImplementor);
		IntegerType.INSTANCE.nullSafeSet(st, certificate.getLength(), index + 1, sessionImplementor);
	}

	public Object replace(Object original, Object target, Object owner) throws HibernateException {
		return original;
	}

	public Class<?> returnedClass() {
		return Certificate.class;
	}

	public int[] sqlTypes() {
		return SQL_TYPES;
	}

}
