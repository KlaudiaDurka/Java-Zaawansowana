package zadania.wzorceKonstrukcyjne;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Servers {

    private static Servers INSTANCE;
    private List<String> serverList;

    private Servers() {
        serverList = new ArrayList<>();
    }

    public static Servers getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Servers();
        }
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

    public List<String> getHttpServers(){
        return serverList.stream()
                .filter(t -> t.startsWith("http"))
                .collect(Collectors.toList());
    }

    public List<String> getHttpsServers(){
        return serverList.stream()
                .filter(t -> t.startsWith("https"))
                .collect(Collectors.toList());
    }
}
