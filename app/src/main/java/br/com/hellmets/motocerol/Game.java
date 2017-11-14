//Aplication package
package br.com.hellmets.motocerol;

//Used Packages
import android.os.Bundle;
import br.com.hellmets.motocerol.AndGraph.AGActivityGame;
import br.com.hellmets.motocerol.AndGraph.AGGameManager;
import br.com.hellmets.motocerol.AndGraph.CenaAbertura;
import br.com.hellmets.motocerol.AndGraph.CenaMenu;


public class Game extends AGActivityGame
{
    public void onCreate(Bundle saved)
    {
        super.onCreate(saved);
        this.vrManager = new AGGameManager(this, false);

        CenaAbertura abertura = new CenaAbertura(vrManager);
        CenaMenu menu = new CenaMenu(vrManager);

        vrManager.addScene(abertura);
        vrManager.addScene(menu);

    }
}
