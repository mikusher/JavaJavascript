package cv.mikusher.security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

public class UserDataStore {

	private static UserDataStore instance = new UserDataStore();

	/**
	 * Map of usernames to their password hashes.
	 */
	private Map<String, Integer> userPasswordMap = new HashMap<>();

	/**
	 * Map of usernames to their salts.
	 */
	private Map<String, Integer> userSaltMap = new HashMap<>();

	public static UserDataStore getInstance() {
		return instance;
	}

	// This class is a singleton. Call getInstance() instead.
	private UserDataStore() {
	}

	public boolean isUsernameTaken(String username) {
		return userPasswordMap.containsKey(username);
	}

	public void registerUser(String username, String password) {
		int salt = getRandomSalt();
		String saltedPassword = password + salt;
		int passwordHash = getSimpleHash(saltedPassword);
		userPasswordMap.put(username, passwordHash);
		userSaltMap.put(username, salt);
	}

	public boolean isLoginCorrect(String username, String password) {

		// username isn't registered
		if (!userPasswordMap.containsKey(username) || !userSaltMap.containsKey(username)) {
			return false;
		}

		int salt = userSaltMap.get(username);
		String saltedPassword = password + salt;
		int passwordHash = getSimpleHash(saltedPassword);
		int storedPasswordHash = userPasswordMap.get(username);

		return passwordHash == storedPasswordHash;
	}

	/**
	 * Returns a random number between 0 and 1000.
	 */
	private int getRandomSalt() {
		return (int) (Math.random() * 1000);
	}

	private int getSimpleHash(String saltedPassword) {
		MessageDigest messageDigest;
		int simpleHash = 0;
		try {
			messageDigest = MessageDigest.getInstance("SHA-256");
			messageDigest.update(saltedPassword.getBytes());
			String encryptedString = new String(messageDigest.digest());
			simpleHash = encryptedString.hashCode();
		} catch (NoSuchAlgorithmException e) {

			e.printStackTrace();
		}

		return simpleHash;
	}
}
