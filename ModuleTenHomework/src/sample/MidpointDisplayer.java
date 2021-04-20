package sample;

import javafx.scene.shape.Line;

public class MidpointDisplayer implements LineInfoDisplayer {
    @Override
    public String getInfo(Line line) {
        if( line == null )
            return "";
        double st_x = line.getStartX();
        double st_y = line.getStartY();
        double et_x = line.getEndX();
        double et_y = line.getEndY();

        double mid_x = (st_x + et_x) / 2;
        double mid_y = (st_y + et_y) / 2;

        return String.format("Mid Point = (%.2f, %.2f)", mid_x,  mid_y);
    }
}
