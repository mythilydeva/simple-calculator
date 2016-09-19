import java.util.Scanner;
class CaesarCipher 
{
	// code for encryption
	public static String encrypt(String name, int key) 
	{
		String CipherText = "";
		int temp;
		char c;
		for (int i = 0; i < name.length(); i++) 
		{
			if (name.charAt(i) + key < 97 || name.charAt(i) + key > 122) 
			{
				temp = (name.charAt(i) + key) - 26;
			} else
				temp = name.charAt(i) + key;
			c = (char) temp;
			CipherText = CipherText + c;
		}
		return CipherText;
	}

	// code for decryption
	public static String decrypt(String name, int key) 
	{
		String CipherText = "";
		int temp;
		char c;
		for (int i = 0; i < name.length(); i++) 
		{
			if (name.charAt(i) + key < 97 || name.charAt(i) + key > 122)

			{
				temp = (name.charAt(i) - key) - 26;
			} else
				temp = name.charAt(i) - key;
			c = (char) temp;
			CipherText = CipherText + c;
		}
		return CipherText;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text");
		String name = sc.next();
		System.out.println("Enter the key");
		int key = sc.nextInt();
		String cip = encrypt(name, key);
		System.out.println("Cipher text is: " + cip);
		String dip = decrypt(cip, key);
		System.out.println("DeCipher text is: " + dip);
		sc.close();
	}
}