package br.com.hellmets.motocerol.AndGraph;

import br.com.hellmets.motocerol.R;

public class CenaMenu extends AGScene {

    AGSprite capacete = null;
    AGSprite gato = null;

    public CenaMenu (AGGameManager manager){

        super (manager);
    }

    @Override
    public void init() {

        /*setSceneBackgroundColor(0,1,0);
        gato = createSprite(R.mipmap.cat, 2, 4);
        gato.setScreenPercent(40,20);
        gato.vrPosition.setX(AGScreenManager.iScreenWidth/2);
        gato.vrPosition.setY(AGScreenManager.iScreenHeight/2);*/

        capacete = createSprite(R.mipmap.versocarta, 1, 1);
        capacete.setScreenPercent(50, 50);
        capacete.vrPosition.setX(AGScreenManager.iScreenWidth/3);
        capacete.vrPosition.setY(AGScreenManager.iScreenHeight/3);

    }

    @Override
    public void restart() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void loop() {

        if (AGInputManager.vrTouchEvents.screenClicked()){
            vrGameManager.vrActivity.finish();
        }

        //capacete.fAngle += 5;

    }
}

