package LibraryManagement_Util;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class Util_StringUtil {
	/**
	 * Các biến toàn cục của trang này
	 */
	private Cipher objCipher;
	private SecretKey sKey;

	/**
	 * <ul>
	 * <li>Mục đích của hàm này
	 * </ul>
	 * 
	 * @author ThienVD
	 * @param Các
	 *            thông số đi vào hàm này
	 * @return Kết quả trả về của hàm này
	 * @throws Lỗi
	 *             ném về (nếu có)
	 */
	public Util_StringUtil() {
		KeyGenerator generator;
		try {
			generator = KeyGenerator.getInstance("DES");
			sKey = generator.generateKey();
			objCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * <ul>
	 * <li>Mục đích của hàm này
	 * </ul>
	 * 
	 * @author ThienVD
	 * @param Các
	 *            thông số đi vào hàm này
	 * @return Kết quả trả về của hàm này
	 * @throws Lỗi
	 *             ném về (nếu có)
	 */
	public String encrypt(String inputText) {
		String encryptedText = "";
		try {
			objCipher.init(Cipher.ENCRYPT_MODE, sKey);

			byte[] text = inputText.getBytes();

			byte[] encryptedData = objCipher.doFinal(text);

			// Display the encrypted text in the textarea
			encryptedText = new String(encryptedData);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return encryptedText;
	}

	/**
	 * <ul>
	 * <li>Mục đích của hàm này
	 * </ul>
	 * 
	 * @author ThienVD
	 * @param Các
	 *            thông số đi vào hàm này
	 * @return Kết quả trả về của hàm này
	 * @throws Lỗi
	 *             ném về (nếu có)
	 */
	public String decrypt(String inputText) {
		String plainText = "";
		try {

			objCipher.init(Cipher.DECRYPT_MODE, sKey);

			byte[] decryptedText = inputText.getBytes();
			
			byte[] plainData = objCipher.doFinal(decryptedText);
			
			plainText = new String(plainData);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return plainText;
	}

}
