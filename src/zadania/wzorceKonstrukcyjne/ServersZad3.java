package zadania.wzorceKonstrukcyjne;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ServersZad3 {

    private static final ServersZad3 INSTANCE = new ServersZad3();
    private List<String> serverList;

    private ServersZad3() {
        serverList = new ArrayList<>();
    }

    public static ServersZad3 getInstance() {
        return INSTANCE;
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

