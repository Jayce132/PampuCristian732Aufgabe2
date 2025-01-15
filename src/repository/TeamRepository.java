package repository;


import model.Team;

public class TeamRepository extends InMemoryRepository<Team> {

    @Override
    public Team create(Team Team) {
        store.put(Team.getId(), Team);
        return Team;
    }

    @Override
    public Team update(Team Team) {
        if (store.containsKey(Team.getId())) {
            store.put(Team.getId(), Team);
            return Team;
        }
        return null;
    }
}
