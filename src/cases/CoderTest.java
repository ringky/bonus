package cases;

import static org.junit.Assert.*;

import org.junit.Test;


/** 
* 
*/
public class CoderTest {
	@Test
	public void test() throws Exception {
		String inputStr = "base64����";
		
		System.err.println("ԭ��:\n" + inputStr + "\n\n");

		byte[] inputData = inputStr.getBytes();
		String code = Coder.encryptBASE64(inputData);

		System.err.println("BASE64���ܺ�:\n\n" + code);

		byte[] output = Coder.decryptBASE64(code);

		String outputStr = new String(output);

		System.err.println("BASE64���ܺ�:\n\n" + outputStr);
		
		
		String encodedStr = "YmFzZTY0vNPD3GJhc2U2NLzTw9xiYXNlNjS808PcYmFzZTY0vNPD3GJhc2U2NLzTw9xiYXNlNjS8" +
				"08PcYmFzZTY0vNPD3GJhc2U2NLzTw9xiYXNlNjS808PcYmFzZTY0vNPD3A==";
		
		System.out.println("���ܺ� �� " + new String(Coder.decryptBASE64(encodedStr)));
		System.out.println("MD5���ܺ�1��" + new String(Coder.encryptMD5(inputStr.getBytes())));
		System.out.println("MD5���ܺ�2��" + new String(Coder.encryptMD5(inputStr.getBytes())));
		
		// ��֤BASE64���ܽ���һ����
		assertEquals(inputStr, outputStr);

		// ��֤MD5����ͬһ���ݼ����Ƿ�һ��
		assertArrayEquals(Coder.encryptMD5(inputData), Coder.encryptMD5(inputData));

		// ��֤SHA����ͬһ���ݼ����Ƿ�һ��
		assertArrayEquals(Coder.encryptSHA(inputData), Coder.encryptSHA(inputData));
	}
}
