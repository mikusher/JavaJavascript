package cv.mikusher.security;

public class TestUserDataStore {

	public static void main(String[] args) {
		UserDataStore.getInstance().registerUser("miky", "mikusher");
		UserDataStore.getInstance().isLoginCorrect("miky", "mikusher");
		UserDataStore.getInstance().isLoginCorrect("miky", "miky");
		UserDataStore.getInstance().isUsernameTaken("miky");
	}

}
