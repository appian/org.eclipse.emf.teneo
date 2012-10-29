package temporal.mod;

import java.util.Date;

public interface TemporalDateProvider {

	public static TemporalDateProvider eINSTANCE = TemporalDateProviderImpl.init();

	public void setNow(Date now);

	public Date now();

	public int getGranularity();

	public void setGranularity(int granularity);

	public Date trimDate(Date date, int granularity);

	/**
	 * Compares two dates at a given granularity.
	 * 
	 * @param dateA
	 * @param dateB
	 * @param granularity
	 *          the granularity can be one of Calendar.YEAR, Calendar.DAY_OF_MONTH etc.
	 * @return
	 */
	public boolean areEqual(Date dateA, Date dateB, int granularity);
}
