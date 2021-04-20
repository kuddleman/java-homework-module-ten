package sample;

/*
(45 points) Complete the LineInfoDisplayer interface.
Implement the factory method to return three different
possible LineInfoDisplayer objects based on the requested type passed in as a parameter.
Requirement: use lambdas.
Optional suggestion: use a switch statement.
 */

import javafx.scene.shape.Line;
@FunctionalInterface
public interface LineInfoDisplayer {

    String getInfo(Line line);

    public static enum InfoType {
        DISTANCE, MIDPOINT, VERTHORZ;
    }

    public static LineInfoDisplayer createLineInfoDisplayer(InfoType type) {
        //  YOUR CODE HERE!
        switch(type) {
            case DISTANCE:
                return new DistanceDisplayer();

            case MIDPOINT:
                return new MidpointDisplayer();

            case VERTHORZ:
                return new VertHorzDisplayer();
        }
        return null;
    }

}
