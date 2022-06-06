package zadania.wzorceKonstrukcyjne;

import java.util.List;
public class WzorceMain {

    public static void main(String[] args) {
        Servers servers = Servers.getInstance();

        servers.addServer("Server 1");
        servers.addServer("http://www.wp.pl/");
        servers.addServer("https://www.onet.pl/");

        System.out.println(servers.getHttpServers());
        System.out.println(servers.getHttpsServers());


        ServersZad4 serversZad4 = ServersZad4.INSTANCE;
        serversZad4.addServer("Server 1");
        serversZad4.addServer("http://www.wp.pl/");
        serversZad4.addServer("https://www.onet.pl/");

        System.out.println(serversZad4.getHttpServers());
        System.out.println(serversZad4.getHttpsServers());


        Dog.DogBuilder dogBuilder = new Dog.DogBuilder();

        Dog dog = dogBuilder.withName("York")
                .withType("Mały")
                .withAge(10)
                .withToys(List.of("Zabawka")).build();



    }
}

