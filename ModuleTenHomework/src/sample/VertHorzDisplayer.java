package sample;

import javafx.scene.shape.Line;

public class VertHorzDisplayer implements LineInfoDisplayer {
    @Override
    public String getInfo(Line line) {
        if( line == null )
            return "";
        double st_x = line.getStartX();
        double st_y = line.getStartY();
        double et_x = line.getEndX();
        double et_y = line.getEndY();

        if( Math.abs(et_x - st_x) >= Math.abs(et_y - st_y) )
            return "HORIZONTAL LINE";
        else
            return "VERTICAL LINE";
    }
}
