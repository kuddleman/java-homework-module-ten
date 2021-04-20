package sample;

import javafx.scene.shape.Line;

public class DistanceDisplayer implements LineInfoDisplayer {
    @Override
    public String getInfo(Line line) {
        if( line == null )
            return "";
        // calculate distance
        double st_x = line.getStartX();
        double st_y = line.getStartY();
        double et_x = line.getEndX();
        double et_y = line.getEndY();

        double distance = Math.sqrt((et_x - st_x) * (et_x - st_x) + (et_y - st_y) * (et_y - st_y));

        return String.format("Distance = %.2f", distance);
    }
}
