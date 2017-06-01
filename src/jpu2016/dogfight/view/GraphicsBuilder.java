package jpu2016.dogfight.view;

import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.gameframe.IGraphicsBuilder;

import java.awt.*;
import java.awt.image.ImageObserver;

/**
 * Created by clemckr on 01/06/2017.
 */
public class GraphicsBuilder implements IGraphicsBuilder {
// ==================== ATTRIBUTS ====================
    private int globalWidth;
    private int globalHeight;

// ==================== METHODES ====================
    public GraphicsBuilder(IDogfightModel dogfightModel) {

    }

    public void applyModelToGraphic(Graphics graphics, ImageObserver observer) {

    }

    private void buildEmptySky() {

    }

    private void drawMobile(IMobile mobile, Graphics graphics, ImageObserver observer) {

    }

    // ==================== GETTERS ====================
    public int getGlobalWidth() {
        return globalWidth;
    }

    public int getGlobalHeight() {
        return globalHeight;
    }
}
