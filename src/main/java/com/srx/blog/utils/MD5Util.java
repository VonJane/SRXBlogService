package com.srx.blog.utils;

import java.security.MessageDigest;

public class MD5Util {
	// private final static String[] hexDigits = { "0", "1", "2", "3", "4", "5",
		// "6", "7", "8", "9", "a", "b", "c", "d", "e", "f" };
		//  
		// /**
		// * 转换字节数组为16进制字串
		// *
		// * @param b
		// * 字节数组
		// * @return 16进制字串
		// */
		//   
		// public static String byteArrayToHexString(byte[] b) {
		// StringBuffer resultSb = new StringBuffer();
		// for (int i = 0; i < b.length; i++) {
		// resultSb.append(byteToHexString(b[i]));
		// }
		// return resultSb.toString();
		// }
		//  
		// private static String byteToHexString(byte b) {
		// int n = b;
		// if (n < 0) n = 256 + n;
		// int d1 = n / 16;
		// int d2 = n % 16;
		// return hexDigits[d1] + hexDigits[d2];
		// }

		/**
		 * 将16位byte[] 转换为32位String
		 * 
		 * @param buffer
		 * @return
		 */
		private static String toHex(byte buffer[]) {
			StringBuilder sb = new StringBuilder(buffer.length * 2);
			for (int i = 0; i < buffer.length; i++) {
				sb.append(Character.forDigit((buffer[i] & 240) >> 4, 16));
				sb.append(Character.forDigit(buffer[i] & 15, 16));
			}

			return sb.toString();
		}

		public static String MD5Encode(String origin) {
			String resultString = null;

			try {
				resultString = new String(origin);
				MessageDigest md = MessageDigest.getInstance("MD5"); // MD5 SHA
																		// SHA1
																		// SHA-1

				resultString = toHex(md.digest(resultString.getBytes()));

				// 或者
				// resultString = byteArrayToHexString(md.digest(resultString
				// .getBytes()));
			} catch (Exception ex) {

			}
			return resultString;
		}

		public static String SHAEncode(String origin) {

			String resultString = null;

			try {
				resultString = new String(origin);
				MessageDigest md = MessageDigest.getInstance("SHA");
				resultString = toHex(md.digest(resultString.getBytes()));

				// 或者
				// resultString = byteArrayToHexString(md.digest(resultString
				// .getBytes()));
			} catch (Exception ex) {

			}
			return resultString;
		}

}
