/* 'Public' is a access specifier - how a class can be accessed by other classes
 * 'First' is the class identifier
 * {} - what is contained inside is the body with any number of data items and methods
 */
public class First {
    /* 'static' - means that it is instantiated, a method is accessible and usable even
     * though no object of hte class exist.
     * 'void' - a method that doesn't return any value when it is called.
     * All java programs must have a main method.
     * The JVM executes the main() method first.
     * String - a Java class that holds character strings
     * [] - the argument is a list of strings.
     * 'args' identifier does not need to be there, but it's traditional.
     */
    public static void main(String[]args) {
        //This is the body
        System.out.println("First Java application");
    }
}
