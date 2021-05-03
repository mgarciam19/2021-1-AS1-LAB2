package gt.com.GCApp;

import java.util.*;

public class figureFactory {
    private figureFactory instance = new figureFactory();

    public figureFactory getInstance(){
	return instance;
    }

    public figureFactory() {
    }

    public Figures getFigure(GeometryTypes figureType) {
	switch(figureType){
		case RECTANGLE: return new Rectangle(); 
		case TRIANGLE: return new Triangle();
		case SQUARE: return new Square();
		  default: return null;
	}
    }

}