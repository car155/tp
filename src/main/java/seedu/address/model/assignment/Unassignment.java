package seedu.address.model.assignment;
import static seedu.address.commons.util.CollectionUtil.requireAllNonNull;

import java.util.Set;

import seedu.address.model.person.PersonId;
import seedu.address.model.session.SessionId;

/**
 * Represents an Unassignment of a person to a class.
 */
public class Unassignment {
    private Set<PersonId> studentIds;
    private PersonId tutorId;
    private SessionId sessionId;

    /**
     * Public Constructor for An Unassignment between student/tutors and sessions
     * @param studentIds
     * @param tutorId
     * @param sessionId
     */
    public Unassignment(Set<PersonId> studentIds, PersonId tutorId, SessionId sessionId) {
        requireAllNonNull(sessionId);
        this.sessionId = sessionId;
        this.studentIds = studentIds;
        this.tutorId = tutorId;
    }

    public Set<PersonId> getStudentIds() {
        return studentIds;
    }

    public PersonId getTutorId() {
        return tutorId;
    }

    public SessionId getSessionId() {
        return sessionId;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("StudentId: ")
                .append(getStudentIds())
                .append("; TutorId: ")
                .append(getTutorId())
                .append("; SessionId: ")
                .append(getSessionId())
                .append(";");
        return builder.toString();
    }

}
