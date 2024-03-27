package seedu.address.logic.commands;

import seedu.address.model.person.predicates.PersonAvailableOnDayPredicate;

/**
 * Filters and lists all persons in address book who are available on any of the given days of the week.
 * Day matching is case-insensitive.
 */
public class FilterDayCommand extends Filter {

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Filters for all persons whose availabilities"
            + " include any of the specified days and displays them as a list with index numbers.\n"
            + "Parameters: filter day [days of the week]...\n"
            + "Example: " + COMMAND_WORD + " monday";

    /**
     * Returns a new FilterTagCommand object that takes in a PersonHasTagPredicate
     * to update the filtered list
     * @param predicate
     */
    public FilterDayCommand(PersonAvailableOnDayPredicate predicate) {
        this.setPredicate(predicate);
    }
}