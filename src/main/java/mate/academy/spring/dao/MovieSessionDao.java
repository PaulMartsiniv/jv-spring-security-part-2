package mate.academy.spring.dao;

import java.time.LocalDate;
import java.util.List;
import mate.academy.spring.model.MovieSession;

public interface MovieSessionDao extends GenericDao<MovieSession> {
    List<MovieSession> findAvailableSessions(Long movieId, LocalDate date);
}
