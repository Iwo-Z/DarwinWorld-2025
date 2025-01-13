package agh.ics.darwinworld.ApplicationModel;

import agh.ics.darwinworld.World;
import agh.ics.darwinworld.WorldModel.MapChangeListener;
import agh.ics.darwinworld.WorldModel.WorldMap;

public class SimulationPresenter implements MapChangeListener {
    WorldMap worldMap;

    public void setWorldMap(WorldMap map) {
        this.worldMap = map;
    }

    public void drawMap(){
        //tutaj po kolei rysuje wszytkie rzeczy na mapie
    }

    @Override
    public void mapChanged(WorldMap worldMap) {
        //tutaj renderuje mape na nowo
    }
}
