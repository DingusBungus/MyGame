package view;

import java.awt.event.ActionListener;

/**
 * Created by Doherty on 5/5/2015.
 */
public class MainScreenViewport extends Viewport {

    ActionListener startButtonListener;
    ActionListener optionsButtonListener;
    ActionListener loadButtonListener;
    ActionListener exitButtonListener;

    public MainScreenViewport( ActionListener startButtonListener,
                               ActionListener optionsButtonListener,
                               ActionListener loadButtonListener,
                               ActionListener exitButtonListener )
    {
        this.startButtonListener = startButtonListener;
        this.optionsButtonListener = optionsButtonListener;
        this.loadButtonListener = loadButtonListener;
        this.exitButtonListener = exitButtonListener;
        initComponents();
        setListeners();
    }

    @Override
    public void setListeners() {
        startButton.addActionListener(startButtonListener);
        optionsButton.addActionListener(optionsButtonListener);
        loadButton.addActionListener(loadButtonListener);
        exitButton.addActionListener(exitButtonListener);
    }
}
