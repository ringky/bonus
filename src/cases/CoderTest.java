package cases;

import static org.junit.Assert.*;

import org.junit.Test;


/** 
* 
*/
public class CoderTest {
	@Test
	public void test() throws Exception {
		String inputStr = "base64加密";
		
		System.err.println("原文:\n" + inputStr + "\n\n");

		byte[] inputData = inputStr.getBytes();
		String code = Coder.encryptBASE64(inputData);

		System.err.println("BASE64加密后:\n\n" + code);

		byte[] output = Coder.decryptBASE64(code);

		String outputStr = new String(output);

		System.err.println("BASE64解密后:\n\n" + outputStr);
		
		
		String encodedStr = "YmFzZTY0vNPD3GJhc2U2NLzTw9xiYXNlNjS808PcYmFzZTY0vNPD3GJhc2U2NLzTw9xiYXNlNjS8" +
				"08PcYmFzZTY0vNPD3GJhc2U2NLzTw9xiYXNlNjS808PcYmFzZTY0vNPD3A==";
		
		System.out.println("解密后 ： " + new String(Coder.decryptBASE64(encodedStr)));
		System.out.println("MD5加密后1：" + new String(Coder.encryptMD5(inputStr.getBytes())));
		System.out.println("MD5加密后2：" + new String(Coder.encryptMD5(inputStr.getBytes())));
		
		// 验证BASE64加密解密一致性
		assertEquals(inputStr, outputStr);

		// 验证MD5对于同一内容加密是否一致
		assertArrayEquals(Coder.encryptMD5(inputData), Coder.encryptMD5(inputData));

		// 验证SHA对于同一内容加密是否一致
		assertArrayEquals(Coder.encryptSHA(inputData), Coder.encryptSHA(inputData));
	}
}
