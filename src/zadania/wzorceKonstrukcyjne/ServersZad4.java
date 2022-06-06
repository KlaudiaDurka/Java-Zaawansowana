package zadania.wzorceKonstrukcyjne;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public enum ServersZad4 {

    INSTANCE;

    private List<String> serverList;

    ServersZad4() {
        serverList = new ArrayList<>();
    }

    public boolean addServer(String server) {
        if ((server.startsWith("http") || server.startsWith("https"))
                && !serverList.contains(server)) {
            serverList.add(server);
            return true;
        }

        return false;
    }

    public List<String> getHttpServers() {
        return serverList.stream()
                .filter(t -> t.startsWith("http"))
                .collect(Collectors.toList());
    }

    public List<String> getHttpsServers() {
        return serverList.stream()
                .filter(t -> t.startsWith("https"))
                .collect(Collectors.toList());
    }
}
