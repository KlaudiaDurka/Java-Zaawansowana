package zadania.wzorceStrukturalne;

import java.util.Optional;
import java.util.UUID;

public class TokenHolder {

    public Optional<UUID> create() {
        return Optional.of(UUID.randomUUID());
    }
}