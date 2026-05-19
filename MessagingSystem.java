
public class MessagingSystem {

    public boolean validateCredentials(String userName, String Password) {
        // Check login Credentials
        return true;
    }

    public boolean checkMessages() {
        // Check for any messages
        return true;
    }

    public String getMessages() {
        // return any received messages
        if (checkMessages()) {
            return "This is a message";
        }
        else {
            return "No New Messages";
        }
    }

    public String findUserID(String userName) {
        // Correlate username and user ID
        return "ij4ewioafj";
    }

    public boolean writeMessage(String message, String userName) {
        // send a message to the user
        String userID = findUserID(userName);
        if (sendMessage(message, userID)) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean sendMessage(String message, String userID) {
        // send the message to user and save copy to server
        return true;
    }
}