package br.com.hellmets.motocerol.AndGraph;



public class CenaAbertura extends AGScene {

    private AGTimer tempo = null;

    public CenaAbertura (AGGameManager manager){

        super (manager);
    }

    @Override
    public void init() {

        setSceneBackgroundColor(1,0,0);
        tempo = new AGTimer(3000);

    }

    @Override
    public void restart() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void loop() {
        tempo.update();
        if (tempo.isTimeEnded()){
            vrGameManager.setCurrentScene(1);

            return;
        }

        if(AGInputManager.vrTouchEvents.screenClicked()){

            vrGameManager.setCurrentScene(1);
        }

    }
}


