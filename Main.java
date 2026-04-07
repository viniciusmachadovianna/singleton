public class Main {
    public static void main(String[] args) {
        // instance
        Gym gym1 = Gym.getInstance();
        Gym gym2 = Gym.getInstance();

        // same instance?
        System.out.println("Are gym1 and gym2 the same instance? " + (gym1 == gym2));

        // ops
        System.out.println("\nGym Name: " + gym1.getName());
        System.out.println("Max Capacity: " + gym1.getMaxMembers());

        // add members
        gym1.addMember("Marco");
        gym1.addMember("Antonio");
        gym1.addMember("Araujo");

        // try add + members
        for (int i = 0; i < 5; i++) {
            gym1.addMember("Member" + (i + 4));
        }

        // remove member
        gym1.removeMember("Marco");

        // status check
        System.out.println("\nCurrent members: " + gym1.getCurrentMembers());
        System.out.println("Is at capacity? " + gym1.isAtCapacity());
    }
}