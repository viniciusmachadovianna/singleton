public class Gym {
    private static Gym instance;

    // props
    private String name;
    private int maxMembers;
    private int currentMembers;

    // constructor
    private Gym() {
        this.name = "UniAcademia Academia";
        this.maxMembers = 100;
        this.currentMembers = 0;
    }

    public static Gym getInstance() {
        if (instance == null) {
            instance = new Gym();
        }
        return instance;
    }

    public boolean addMember(String memberName) {
        if (currentMembers < maxMembers) {
            currentMembers++;
            System.out.println("Member " + memberName + " added to " + name + ". Current members: " + currentMembers);
            return true;
        } else {
            System.out.println("Cannot add " + memberName + ". Gym is at full capacity (" + maxMembers + ")");
            return false;
        }
    }

    public boolean removeMember(String memberName) {
        if (currentMembers > 0) {
            currentMembers--;
            System.out.println("Member " + memberName + " removed from " + name + ". Current members: " + currentMembers);
            return true;
        } else {
            System.out.println("Cannot remove " + memberName + ". No members in the gym.");
            return false;
        }
    }

    public int getCurrentMembers() {
        return currentMembers;
    }

    public String getName() {
        return name;
    }

    public int getMaxMembers() {
        return maxMembers;
    }

    public boolean isAtCapacity() {
        return currentMembers >= maxMembers;
    }
}