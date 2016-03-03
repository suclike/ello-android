package ello.co.ello;

/**
 * Created by Sean on 2/29/16.
 */
public class ElloURI {
    public static boolean shouldLoadInApp(String url) {
        if (url.matches("^(https?://)?((w{3}.)?ello.co|ello-webapp-(epic|rainbow).herokuapp.com)/?\\S*$")) {
            return true;
        }
        else if (url.matches("/\\S*$")) {
            return true;
        }
        else {
            return false;
        }
    }
}
