package org.eclipse.emf.teneo.samples.emf.hibernate.usertype;


/**
 * Trivial example implementation of a specific type.
 */
public class UsaPhoneNumber {

	private int num1;
	private int num2;
	private int num3;

	public UsaPhoneNumber(int num1, int num2, int num3) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}
	
	public UsaPhoneNumber(String numbers) {
		String[] nums = numbers.split("_");
		num1 = Integer.parseInt(nums[0]);
		num2 = Integer.parseInt(nums[1]);
		num3 = Integer.parseInt(nums[2]);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj) {
		if (!(obj instanceof UsaPhoneNumber)) {
			return false;
		}
		UsaPhoneNumber up = (UsaPhoneNumber)obj;
		return up.num1 == num1 && up.num2 == num2 && up.num3 == num3;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		return num1 + num2 + num3;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return num1 + "_" + num2 + "_" + num3;
	}
}
