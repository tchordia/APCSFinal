package gui;

import info.gridworld.gui.DisplayMap;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;


public class NewGame extends JFrame
{
    DisplayMap map = new DisplayMap();

    BoundedGrid<Piece> gr = new BoundedGrid<Piece>( 8, 8 );


    public NewGame()
    {
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        setVisible( true );
        setLayout( new GridLayout() );

        GridPanel board = new GridPanel( map );
        board.setGrid( gr );
        board.setVisible( true );
        getContentPane().add( board );
        board.minCellSize = this.getHeight() / board.DEFAULT_CELL_COUNT;
        board.defaultCellSize = this.getHeight() / board.DEFAULT_CELL_COUNT;
        pack();
        setResizable( false );
    }


    public static void main( String[] args )
    {
        JFrame window = new NewGame();
    }
}
