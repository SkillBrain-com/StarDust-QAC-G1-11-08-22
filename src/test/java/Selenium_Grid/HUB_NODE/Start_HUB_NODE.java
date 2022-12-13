//import org.openqa.grid.internal.utils.configuration.GridHubConfiguration;
//import org.openqa.grid.internal.utils.configuration.GridNodeConfiguration;
//import org.openqa.grid.web.Hub;



package Selenium_Grid.HUB_NODE;

import java.io.File;

public class Start_HUB_NODE {

//    https://stackoverflow.com/questions/45885774/selenium-using-java-start-hub-server-and-register-nodes-with-hub

//    public static void main(String[] args) throws Exception {
//        // TODO Auto-generated method stub
//        GridHubConfiguration configHub = new GridHubConfiguration();
//        configHub.host = "localhost";
//        configHub.port = 4444;
//
//        GridNodeConfiguration configNode = new GridNodeConfiguration();
//        configNode.host = configHub.host;
//        configNode.port = 5555;
//
//        Hub hub = new Hub(configHub);
//        configNode.getHubHost();
//        hub.start();
//
//        System.out.println(configNode.getRemoteHost());
//
//        hub.stop();
//    }


//    private static Object GRIDINFO;
//    public static String HUBIP = GRIDINFO.HOSTIP.toString();
//    public static Integer HUBPORT = 4444;
//    static String separator = "\n------------------------\n";
//
//    public static void hubServer() {
//        try {
//            GridHubConfiguration gridHubConfig = new GridHubConfiguration();
//            gridHubConfig.setHost( HUBIP );
//            gridHubConfig.setPort( HUBPORT );
//            gridHubConfig.setNewSessionWaitTimeout( 50000 );
//            File JOSNFile = new File(System.getProperty("user.dir")+"/gridHub.json" );
//            gridHubConfig.loadFromJSON( JOSNFile.toString() );
//
//
//            Hub hub = new Hub(gridHubConfig);
//            hub.start();
//
//            System.out.println("Nodes should register to " + hub.getRegistrationURL());
//            System.out.format("%s Running as a grid hub: %s\n" +
//                    "Console URL : %s/grid/console \n", separator,separator,hub.getUrl());
//
//            System.out.println("Please Enter to stop service.");
//            System.in.read();
//            System.in.read();
//
//            hub.stop();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void main(String[] args) {
//        hubServer();
//    }


}
