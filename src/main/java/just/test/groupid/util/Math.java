package just.test.groupid.util;

import org.apache.commons.math3.stat.StatUtils;

/**
 * Math 提供了一个求平均数的静态方法.
 * 
 * @author 作者
 */
public final class Math {

	/**
	 * 返回数组 values 的平均数.
	 * 
	 * @param values 数组.
	 */
	public static void Mean(double[] values) {
		System.out.println("平均数：" + StatUtils.mean(values));
	}
}
