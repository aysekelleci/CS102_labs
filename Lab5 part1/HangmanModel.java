import cs102.*;
import java.util.ArrayList;

public class HangmanModel extends Hangman {
    
    //properties
    ArrayList<IHangmanView> hangmanViews = new ArrayList<IHangmanView> ();
    
    //constructors
    public HangmanModel( BasicSetup setup ) //IHangmanView view)
    {
       super( setup);
    }
    
    public void addView( IHangmanView view)
    {
        hangmanViews.add(view);
        view.updateView(this);
    }
    
    public void update() {
        for (int i = 0; i< hangmanViews.size(); i++ ){
            hangmanViews.get(i).updateView(this);
        }
    }
    
    @Override
    public int tryThis(char c)
    {
        int repetition = super.tryThis(c);
        this.update();
        
        return repetition;
    }
    
    @Override
    public void initNewGame()
    {
        super.initNewGame();
        //this.update();
    }
}
