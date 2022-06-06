package zadania.wzorceKonstrukcyjne;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ServersZad2 {

    private static ServersZad2 INSTANCE;
    private List<String> serverList;

    private ServersZad2() {
        serverList = new ArrayList<>();
    }

    public static ServersZad2 getInstance() {
        if (INSTANCE == null) {
            synchronized (ServersZad2.class) {
                if(INSTANCE == null) {
                    INSTANCE = new ServersZad2();
                }
            }
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
