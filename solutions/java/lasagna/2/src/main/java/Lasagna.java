public class Lasagna {
    private static final int EXPECTED_MINUTES_IN_OVEN = 40;
    private static final int PREPARATION_TIME_PER_LAYER = 2;
    
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return EXPECTED_MINUTES_IN_OVEN;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int x) {
        return expectedMinutesInOven() - x;
    }
    
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int y) {
        return PREPARATION_TIME_PER_LAYER * y;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int y, int z) {
        return preparationTimeInMinutes(y) + z;
    }
}
