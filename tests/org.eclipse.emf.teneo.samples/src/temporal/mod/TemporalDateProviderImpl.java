package temporal.mod;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

@SuppressWarnings("deprecation")
public class TemporalDateProviderImpl implements TemporalDateProvider {

	private Date now = null;

	private int granularity = Calendar.MINUTE;

	protected TemporalDateProviderImpl() {
	}

	public int getGranularity() {
		return granularity;
	}

	public void setGranularity(int granularity) {
		this.granularity = granularity;
	}

	public void setNow(Date now) {
		this.now = now;
	}

	public Date now() {
		if (now == null) {
			return new Date();
		}
		return now;
	}

	public static TemporalDateProvider init() {
		return new TemporalDateProviderImpl();
	}

	public Date trimDate(Date date, int granularity) {

		switch (granularity) {
		case Calendar.MILLISECOND:
			return date;
		case Calendar.SECOND:
			return new Date(date.getTime());
		case Calendar.MINUTE:
			return new Date(date.getYear(), date.getMonth(), date.getDate(), date.getHours(),
					date.getMinutes(), 0);
		case Calendar.HOUR_OF_DAY:
			return new Date(date.getYear(), date.getMonth(), date.getDate(), date.getHours(), 0, 0);
		case Calendar.DAY_OF_YEAR:
			return new Date(date.getYear(), date.getMonth(), date.getDate(), 0, 0, 0);
		case Calendar.MONTH:
			return new Date(date.getYear(), date.getMonth(), 0, 0, 0, 0);
		case Calendar.YEAR:
			return new Date(date.getYear(), 0, 0, 0, 0, 0);
		}

		throw new RuntimeException("unsuppored granularity");
	}

	public boolean areEqual(Date dateA, Date dateB, int granularity) {
		switch (granularity) {
		case Calendar.MILLISECOND:
			if (dateA.getTime() != dateB.getTime()) {
				return false;
			} else {
				return true;
			}

		case Calendar.SECOND:
			if (dateA.getSeconds() != dateB.getSeconds()) {
				return false;
			}
			return true;
		case Calendar.MINUTE:
			if (dateA.getMinutes() != dateB.getMinutes()) {
				return false;
			}
			return true;
		case Calendar.HOUR_OF_DAY:
			if (dateA.getHours() != dateB.getHours()) {
				return false;
			}
			return true;
		case Calendar.DAY_OF_YEAR:
			Calendar cal = new GregorianCalendar();
			cal.setTime(dateA);
			int dayA = cal.get(Calendar.DAY_OF_MONTH);
			Calendar calB = new GregorianCalendar();
			calB.setTime(dateB);
			int dayB = calB.get(Calendar.DAY_OF_MONTH);
			if (dayA != dayB) {
				return false;
			}
			return true;
		case Calendar.MONTH:
			if (dateA.getMonth() != dateB.getMonth()) {
				return false;
			}
			return true;
		case Calendar.YEAR:
			if (dateA.getYear() != dateB.getYear()) {
				return false;
			}
			return true;
		default:
			throw new RuntimeException("unsuppored granularity");
		}
	}
}
