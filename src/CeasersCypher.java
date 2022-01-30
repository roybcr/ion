public class CeasersCypher {
	private static int[] key = {5, 12, -3, 8, -9, 4, 10};

	public static String ceasersCypher(String msg) {
		Queue q = new Queue();
		String encoded = "";
		for (int i = 0; i < key.length; i++) {
			q.enqueue(key[i]);
			for (int j = 0; j < msg.length(); j++) {
				int keyVal = q.dequeue();
				encoded += (char) (msg.charAt(i) + keyVal);
				q.enqueue(keyVal);
			}
		}
		
		return encoded;
	}
}