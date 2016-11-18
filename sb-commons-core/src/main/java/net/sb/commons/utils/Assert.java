package net.sb.commons.utils;

/**
 * 
 * @author sergio
 *
 */
public class Assert {

	/**
	 * 
	 * @param str
	 * @return
	 */
	public static final boolean isEmpty( String str ) {
		return str == null || (str != null && str.isEmpty());
	}
	
	/**
	 * 
	 * @param str
	 * @return
	 */
	public static final boolean isNotEmpty( String str ) {
		return !isEmpty( str );
	}
	
}
