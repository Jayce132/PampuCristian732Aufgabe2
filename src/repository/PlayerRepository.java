package repository;


import model.Player;

public class PlayerRepository extends InMemoryRepository<Player> {

    @Override
    public Player create(Player Player) {
        store.put(Player.getId(), Player);
        return Player;
    }

    @Override
    public Player update(Player Player) {
        if (store.containsKey(Player.getId())) {
            store.put(Player.getId(), Player);
            return Player;
        }
        return null;
    }
}
