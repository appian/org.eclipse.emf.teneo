package org.eclipse.emf.teneo.samples.emf.hibernate.usertype;

import java.io.Serializable;

public class Name implements Serializable {
	private String first;

	private String last;

	public Name() {
	}

	public Name(String first, String last) {
		this.first = first;
		this.last = last;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof Name)) {
			return false;
		}
		Name other = (Name) obj;
		return ((this.first == null && other.first == null) || this.first.equals(other.first))
				&& (this.last == null && other.last == null) || this.last.equals(other.last);
	}

	public int hashCode() {
		int result = 17;
		result = 37 * result + first.hashCode();
		result = 37 * result + last.hashCode();
		return result;
	}
	
	public String toString() {
		return first + " " + last;
	}
}
