/**
 * Represents an executable game action.
 */
public interface Action {
    /**
     * Returns a short description of the action.
     *
     * @return description string
     */
    String getDescription();

    /**
     * Executes the action.
     */
    void execute();
}


