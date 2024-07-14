
import java.util.ArrayList;
import java.util.List;

public class QueueManagementSystem {
    private static QueueManagementSystem instance;
    private List<HelpDeskStation> helpDeskStations;

    private QueueManagementSystem() {
        helpDeskStations = new ArrayList<>();
    }

    public static synchronized QueueManagementSystem getInstance() {
        if (instance == null)
            instance = new QueueManagementSystem();
        return instance;
    }

    public synchronized void resetQueueNumber(HelpDeskStation helpDesk, int newQueueNumber) {
        int index = helpDeskStations.indexOf(helpDesk);
        System.out.println("Reset Queue Number");

        if (index != -1) {
            helpDeskStations.get(index).setQueueNumber(newQueueNumber);
            System.out.println("Queue number for " + helpDesk.getName() + " reset to: " + newQueueNumber);
            System.out.println("___________________________________________ ");
            System.out.println();
        }
    }

    public synchronized int getCurrentQueueNumber(HelpDeskStation helpDesk) {
        int index = helpDeskStations.indexOf(helpDesk);
        return (index != -1) ? helpDeskStations.get(index).getQueueNumber() : 0;
    }

    public synchronized int generateQueueNumber(HelpDeskStation helpDesk) {
        int index = helpDeskStations.indexOf(helpDesk);
        if (index != -1) {
            int currentQueueNumber = helpDeskStations.get(index).getQueueNumber() + 1;
            helpDeskStations.get(index).setQueueNumber(currentQueueNumber);
            return currentQueueNumber;
        }
        return 0;
    }

    public synchronized void registerHelpDesk(HelpDeskStation helpDesk, int initialQueueNumber) {
        helpDesk.setQueueNumber(initialQueueNumber);
        helpDeskStations.add(helpDesk);
    }

    public List<HelpDeskStation> getHelpDesks() {
        return helpDeskStations;
    }
}

class HelpDeskStation {
    private String name;
    private QueueManagementSystem queuingSystem;
    private int queueNumber;

    public HelpDeskStation(String name, QueueManagementSystem queuingSystem) {
        this.name = name;
        this.queuingSystem = queuingSystem;
        this.queueNumber = 0;
    }

    public void resetQueue(int newQueueNumber) {
        queuingSystem.resetQueueNumber(this, newQueueNumber);
    }

    public int generateQueueNumber() {
        return queuingSystem.generateQueueNumber(this);
    }

    public int getCurrentQueueNumber() {
        return queuingSystem.getCurrentQueueNumber(this);
    }

    public String getName() {
        return name;
    }

    public int getQueueNumber() {
        return queueNumber;
    }

    public void setQueueNumber(int queueNumber) {
        this.queueNumber = queueNumber;
    }
}

class OnlineMonitoringSystem {
    private QueueManagementSystem queuingSystem;

    public OnlineMonitoringSystem(QueueManagementSystem queuingSystem) {
        this.queuingSystem = queuingSystem;
    }

    public void displayRealTimeQueue() {
        System.out.println("\nReal-time Queue Monitoring:");

        for (HelpDeskStation helpDesk : queuingSystem.getHelpDesks()) {
            int currentQueueNumber = queuingSystem.getCurrentQueueNumber(helpDesk);
            System.out.println(helpDesk.getName() + ": " + " [ " + currentQueueNumber + " ] ");
        }
    }
}
