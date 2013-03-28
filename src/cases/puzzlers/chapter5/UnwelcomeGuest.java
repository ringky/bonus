package cases.puzzlers.chapter5;

public class UnwelcomeGuest {
    public static final long GUEST_USER_ID = -1;

    private static final long USER_ID = getUserIdOrGuest();
/*    static {
        try {
            USER_ID = getUserIdFromEnvironment();
        } catch (IdUnavailableException e) {
            USER_ID = GUEST_USER_ID;
            System.out.println("Logging in as guest");
        }
    }*/
    private static long getUserIdOrGuest(){
   
        try {
            return getUserIdFromEnvironment();
        } catch (IdUnavailableException e) {
            System.out.println("Logging in as guest");
            return GUEST_USER_ID;
        }
    
    }
    private static long getUserIdFromEnvironment() 
            throws IdUnavailableException { 
        throw new IdUnavailableException(); // Simulate an error
    }

    public static void main(String[] args) {
        System.out.println("User ID: " + USER_ID);
    }
}

class IdUnavailableException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1038433486182853142L; 
}
